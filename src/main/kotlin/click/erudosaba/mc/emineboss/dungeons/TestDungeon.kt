package click.erudosaba.mc.emineboss.dungeons

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import click.erudosaba.mc.emineboss.dungeon.stage.Stage
import click.erudosaba.mc.emineboss.stages.TestStage
import org.bukkit.Location

class TestDungeon: Dungeon("テストダンジョン", 16, true) {

    init {
        stages.add(TestStage())
    }
}