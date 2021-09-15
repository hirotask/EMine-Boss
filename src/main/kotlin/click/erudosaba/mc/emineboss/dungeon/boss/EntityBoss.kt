package click.erudosaba.mc.emineboss.dungeon.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import click.erudosaba.mc.emineboss.dungeon.stage.BossStage
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.entity.ArmorStand
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.entity.LivingEntity
import org.bukkit.inventory.ItemStack

open class EntityBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    stage: BossStage,
    val type: EntityType,
    val hand: ItemStack,
    val head: ItemStack,
    val chest: ItemStack,
    val leggings: ItemStack,
    val boots: ItemStack
    ): Boss(name, hp, time, isEnable, stage) {

    var entity: Entity? = null
    val firstLocation: Location? = stage.bosses[this]

    open override fun summon() {
        // TODO Entityの召喚
        //entity = Bukkit.getWorld("").spawnEntity()
        // TODO 装備、武具の装着
        // TODO エフェクトの生成
    }
}