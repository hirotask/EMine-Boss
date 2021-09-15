package click.erudosaba.mc.emineboss.dungeon.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import click.erudosaba.mc.emineboss.dungeon.stage.BossStage
import click.erudosaba.mc.emineboss.dungeon.stage.Stage
import org.bukkit.Location
import org.bukkit.block.Block
import org.graalvm.compiler.phases.common.NodeCounterPhase

open class BlockBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    stage: BossStage,
    val blockSet: Set<Block>,
    val weaknessBlockSet: Set<Block>,
    val multiplier: Double,
    ): Boss(name, hp, time, isEnable, stage) {

    open override fun summon() {
        // TODO ブロックの設置
        // TODO エフェクトの生成
    }
}