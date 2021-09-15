package click.erudosaba.mc.emineboss.dungeon.boss

import click.erudosaba.mc.emineboss.dungeon.stage.BossStage
import org.bukkit.Location

open class Boss(
    val name: String,
    var hp: Int,
    var time: Int,
    var isEnable: Boolean,
    val stage: BossStage
    ) {

    open fun summon() {}
}