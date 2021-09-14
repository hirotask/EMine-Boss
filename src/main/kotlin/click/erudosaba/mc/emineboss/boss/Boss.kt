package click.erudosaba.mc.emineboss.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location

open class Boss(
    val name: String,
    var hp: Int,
    var time: Int,
    var isEnable: Boolean,
    val dungeon: Dungeon,
    var firstLocation: Location
    ) {

    open fun summon() {}
}