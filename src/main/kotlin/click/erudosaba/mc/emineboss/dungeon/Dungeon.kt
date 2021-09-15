package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.dungeon.portal.Portal
import click.erudosaba.mc.emineboss.dungeon.stage.Stage

open class Dungeon(val name: String, val people: Int, var isEnable: Boolean = true) {

    // TODO Portalの座標を取得(ymlの可能性)、生成
    val portal: Portal = Portal()
    val stages: List<Stage> = ArrayList()
}