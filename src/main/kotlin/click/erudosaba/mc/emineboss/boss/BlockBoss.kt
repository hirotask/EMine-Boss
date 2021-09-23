package click.erudosaba.mc.emineboss.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location
import org.bukkit.block.Block

abstract class BlockBoss(
    name: String,
    hp: Int,
    time: Int,
    dungeon : Dungeon?,
    stageNum : Int,
    isEnabled: Boolean,
    val blockSet: Set<Block>,
    val weaknessBlockSet: Set<Block>,
    val multiplier: Double,
    val weaknessHP : Int
    ): Boss(name, hp, time, dungeon, stageNum, isEnabled) {

    abstract fun summon()
}