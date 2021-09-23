package click.erudosaba.mc.emineboss

import click.erudosaba.mc.emineboss.boss.bosses.entityboss.TestEntityBoss
import click.erudosaba.mc.emineboss.dungeon.DungeonManager
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    val dungeonManager = DungeonManager(this)

    override fun onDisable() {
        logger.info("Plugin Disabled")
    }

    override fun onEnable() {
        logger.info("Plugin Enabled")




    }
}