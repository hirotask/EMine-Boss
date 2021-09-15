package click.erudosaba.mc.emineboss.stages

import click.erudosaba.mc.emineboss.bosses.TestEntityBoss
import click.erudosaba.mc.emineboss.dungeon.stage.BossStage
import org.bukkit.Bukkit
import org.bukkit.Location

// ymlからfisrtLocationを取得して渡す
class TestStage: BossStage(Location()) {

    init {
        // ymlからBossのfirstLocationを取得して渡す
        bosses.put(TestEntityBoss(), Location())
    }
}