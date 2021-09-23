package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.portal.Portal
import click.erudosaba.mc.emineboss.stage.Stage
import org.bukkit.Location

class Dungeon(
    val name: String,
    val stages: List<Stage>,
    var maxPeople : Int,
    var isEnabled: Boolean,
    var interval : Int
    ) {
}