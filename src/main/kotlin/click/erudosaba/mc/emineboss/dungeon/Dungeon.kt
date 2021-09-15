package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.dungeon.portal.Portal
import click.erudosaba.mc.emineboss.dungeon.stage.Stage
import org.bukkit.Location

open class Dungeon(
    val name: String,
    val people: Int,
    var isEnable: Boolean,
    portalLocation1: Location,
    portalLocation2: Location
    ) {

    // TODO Portalの座標を取得、生成(保存先はymlでほぼ確定)
    // TODO Portalの座標の取得方法(Dungeonの引数にするか、ymlマネージャを参照するか)とりあえずDungeonの引数として実装する
    val portal: Portal = Portal(portalLocation1, portalLocation2, this)
    val stages: MutableList<Stage> = mutableListOf()
}