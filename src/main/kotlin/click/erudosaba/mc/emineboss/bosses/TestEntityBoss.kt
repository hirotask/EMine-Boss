package click.erudosaba.mc.emineboss.bosses

import click.erudosaba.mc.emineboss.dungeon.boss.EntityBoss
import click.erudosaba.mc.emineboss.dungeon.stage.BossStage
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.entity.HumanEntity
import org.bukkit.entity.Zombie
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class TestEntityBoss(stage: BossStage): EntityBoss(
    "Test Entity Boss",
    10,
    400,
    true,
    stage,
    EntityType.ZOMBIE,
    ItemStack(Material.GOLDEN_SWORD),
    ItemStack(Material.IRON_HELMET),
    ItemStack(Material.DIAMOND_CHESTPLATE),
    ItemStack(Material.GOLDEN_LEGGINGS),
    ItemStack(Material.IRON_BOOTS)
    ) {

    override fun summon() {
        // Entityの召喚
        entity = firstLocation?.world?.spawnEntity(firstLocation, type)
        // 装備の装着
        (entity as HumanEntity).inventory
        // エフェクトの生成
    }
}