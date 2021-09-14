package click.erudosaba.mc.emineboss.dungeon

import click.erudosaba.mc.emineboss.dungeon.portal.Portal
import org.bukkit.Location

open class Dungeon(
    val name: String,
    val firstLocation: Location,
    val people: Int,
    val stage: Int,
    var isEnable: Boolean
    ) {

    val portal: Portal

    init {
        // TODO Portalの座標を取得(ymlの可能性)、生成
        portal = Portal()
    }
}