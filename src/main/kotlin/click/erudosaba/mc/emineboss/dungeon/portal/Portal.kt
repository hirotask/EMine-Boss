package click.erudosaba.mc.emineboss.dungeon.portal

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location

class Portal(val loc1: Location, val loc2: Location, val dungeon: Dungeon) {

    // isEnableはBossのインスタンスから参照する案
    var isEnable: Boolean
    get() = dungeon.isEnable
    set(value) {dungeon.isEnable = value}

    val hologram: Hologram = Hologram(this)

    init {
        // TODO loc1とloc2のworldが違ったらエラー
    }
}