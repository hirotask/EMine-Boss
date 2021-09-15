package click.erudosaba.mc.emineboss.dungeon.stage

import click.erudosaba.mc.emineboss.dungeon.boss.Boss
import org.bukkit.Location

open class BossStage(firstLocation: Location): Stage(firstLocation) {

    val bosses: MutableMap<Boss, Location> = mutableMapOf()
}