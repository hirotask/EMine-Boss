package click.erudosaba.mc.emineboss.dungeon.stage

import click.erudosaba.mc.emineboss.boss.Boss
import org.bukkit.Location

class BossStage(firstLocation: Location): Stage(firstLocation) {

    val bosses: List<Boss> = ArrayList();
}