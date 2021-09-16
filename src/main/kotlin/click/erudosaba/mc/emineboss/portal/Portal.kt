package click.erudosaba.mc.emineboss.portal

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location

class Portal(val loc1: Location, val loc2: Location, val dungeon: Dungeon) {

    // isEnableはBossのインスタンスから参照する案
    val isEnable: Boolean = dungeon.isEnable

    val hologram: Hologram = Hologram(this)

    init {
        // TODO loc1とloc2のworldが違ったらエラー
    }

}