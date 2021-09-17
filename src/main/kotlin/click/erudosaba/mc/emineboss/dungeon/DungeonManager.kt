package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.Main
import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.portal.Portal
import click.erudosaba.mc.emineboss.util.CustomConfig
import org.bukkit.Location
import java.io.File
import kotlin.math.min

class DungeonManager(val plugin : Main) {

    val dungeons = mutableListOf<Dungeon>()
    val portals = mutableListOf<Portal>()
    val bosses = mutableListOf<Boss>()

    fun loadDungeons() {
        val directory = "dungeons"
        val files = File(directory).list()!!

        //読み込み開始
        val startTime = System.currentTimeMillis()

        for(file in files) {
            val customConfig = CustomConfig(plugin, "${directory}/${file}")
            val config = customConfig.config

            //ダンジョンのロード　ここから
            val name = config.getString("name")
            val maxPeople = config.getInt("max_people")
            val isEnabled = config.getBoolean("isEnabled")
            val stageFirstLocations = mutableListOf<Location>()
            val list = config.getStringList("stage_firstLocations")
            for (str in list) {
                val locs = str.split(',') //[x,y,z]
                if (locs.size == 3) {
                    val loc = Location(null, locs[0].toDouble(), locs[1].toDouble(), locs[2].toDouble())
                    stageFirstLocations.add(loc)
                }
            }
            val maxStage = stageFirstLocations.size

            //ポータルのロード ここから
            val minLocStrs = config.getString("portal.minLoc")!!.split(',')
            val minLoc = if(minLocStrs.size == 3) Location(null,minLocStrs[0].toDouble(),minLocStrs[1].toDouble(), minLocStrs[2].toDouble()) else null

            val maxLocStrs = config.getString("portal.maxLoc")!!.split(',')
            val maxLoc = if(maxLocStrs.size == 3) Location(null,maxLocStrs[0].toDouble(),maxLocStrs[1].toDouble(), maxLocStrs[2].toDouble()) else null


            //ここまで

            //ボスのロード　ここから
            val bossesInDungeon = mutableListOf<Boss>()
            val bossSection = config.getConfigurationSection("bosses")
            if(bossSection != null) {
                for(boss in bossSection.getKeys(false)) {
                    val path = "bosses.${boss}."

                    val bossName = config.getString("${path}name")
                    val bossHP = config.getInt("${path}hp")
                    val bossTime = config.getInt("${path}time")
                    val bossIsEnabled = config.getBoolean("${path}isEnabled")
                    val bossLocStrs = config.getString("${path}firstLocation")!!.split(',')
                    val bossLoc = if(bossLocStrs.size == 3) Location(null,bossLocStrs[0].toDouble(),bossLocStrs[1].toDouble(), bossLocStrs[2].toDouble()) else null
                    val bossStage = config.getInt("${path}stage")
                    val boss = Boss(bossName!!,bossHP, bossTime, bossIsEnabled, bossLoc!!, bossStage)

                    bossesInDungeon.add(boss)
                }
                bosses.addAll(bossesInDungeon)
            }
            //ここまで

            val dungeon = Dungeon(name!!, maxPeople, stageFirstLocations, maxStage, isEnabled, bossesInDungeon)
            dungeons.add(dungeon)

            val portal = Portal(minLoc!!, maxLoc!!, dungeon)
            portals.add(portal)
        }
        val endTime = System.currentTimeMillis()

        println("[EMine-Boss] Plugin loaded in ${endTime - startTime} ms.")
    }


    fun getPortal(dungeon: Dungeon) : Portal? {
        val name = dungeon.name

        for(portal in portals) {
            if(name == portal.dungeon.name) {
                return portal
            }
        }

        return null
    }
}