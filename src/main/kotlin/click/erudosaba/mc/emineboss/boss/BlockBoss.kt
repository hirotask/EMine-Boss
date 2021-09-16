package click.erudosaba.mc.emineboss.boss

import org.bukkit.Location
import org.bukkit.block.Block

open class BlockBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    firstLocation : Location,
    stage: Int,
    val blockSet: Set<Block>,
    val weaknessBlockSet: Set<Block>,
    val multiplier: Double,
    ): Boss(name, hp, time, isEnable, firstLocation, stage) {

    open override fun summon() {
        // TODO ブロックの設置
        // TODO エフェクトの生成
    }
}