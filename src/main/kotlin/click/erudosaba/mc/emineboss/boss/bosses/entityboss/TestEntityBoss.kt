package click.erudosaba.mc.emineboss.boss.bosses.entityboss

import click.erudosaba.mc.emineboss.boss.EntityBoss
import org.bukkit.Location
import org.bukkit.entity.EntityType

class TestEntityBoss : EntityBoss(
    "テストボス",
    100,
    180,
    null,
    0,
    true,
    EntityType.ZOMBIE
) {

    override fun summon(loc : Location) {
        //locにEntityをスポーンさせる
        //Entityに装備を装着
        //Entityの出現エフェクトを表示
    }
}