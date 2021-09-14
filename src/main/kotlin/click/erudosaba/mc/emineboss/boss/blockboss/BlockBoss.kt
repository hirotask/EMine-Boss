package click.erudosaba.mc.emineboss.boss.blockboss

import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location
import org.bukkit.block.Block

open class BlockBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    dungeon: Dungeon,
    firstLocation: Location,
    val blockSet: Set<Block>,
    val weaknessBlockSet: Set<Block>,
    val multiplier: Double,
): Boss(name, hp, time, isEnable, dungeon, firstLocation) {

    open override fun summon() {
        // TODO ブロックの設置
        // TODO エフェクトの生成
    }
}