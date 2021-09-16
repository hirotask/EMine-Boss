package click.erudosaba.mc.emineboss.boss

import org.bukkit.Location
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.inventory.ItemStack

open class EntityBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    firstLocation : Location,
    stage: Int,
    val type: EntityType,
    val hand: ItemStack,
    val head: ItemStack,
    val chest: ItemStack,
    val leggings: ItemStack,
    val boots: ItemStack
    ): Boss(name, hp, time, isEnable, firstLocation, stage) {

    var entity: Entity? = null

    open override fun summon() {
        // TODO Entityの召喚
        //entity = Bukkit.getWorld("").spawnEntity()
        // TODO 装備、武具の装着
        // TODO エフェクトの生成
    }
}