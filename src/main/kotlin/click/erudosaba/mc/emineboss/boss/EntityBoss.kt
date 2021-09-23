package click.erudosaba.mc.emineboss.boss

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.inventory.ItemStack

abstract class EntityBoss(
    name: String,
    hp: Int,
    time: Int,
    dungeon : Dungeon?,
    stageNum : Int,
    isEnabled: Boolean,
    val type: EntityType,
    ): Boss(name, hp, time, dungeon, stageNum, isEnabled) {

    abstract fun summon(loc : Location)
}