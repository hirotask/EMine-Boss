package click.erudosaba.mc.emineboss.boss.entityboss

import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location
import org.bukkit.entity.Entity
import org.bukkit.inventory.ItemStack

open class EntityBoss(
    name: String,
    hp: Int,
    time: Int,
    isEnable: Boolean,
    dungeon: Dungeon,
    firstLocation: Location,
    val entity: Entity,
    val hand: ItemStack,
    val head: ItemStack,
    val chest: ItemStack,
    val leggings: ItemStack,
    val boots: ItemStack
): Boss(name, hp, time, isEnable, dungeon, firstLocation) {

    open override fun summon() {
        // TODO Entityの召喚
        // TODO 装備、武具の装着
        // TODO エフェクトの生成
    }
}