package click.erudosaba.mc.emineboss.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location

abstract class Boss(
    val name: String,
    var hp: Int,
    var time: Int,
    val dungeon : Dungeon?,
    val stageNum : Int,
    var isEnabled: Boolean
    ) {
}