package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.portal.Portal
import org.bukkit.Location

open class Dungeon(
    val name: String,
    val people: Int,
    val stageFirstLocations : List<Location>,
    val maxStage: Int,
    var isEnable: Boolean,
    val bosses : List<Boss>
    ) {
}