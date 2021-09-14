package click.erudosaba.mc.emineboss.dungeon

import org.bukkit.Location

open class Dungeon(
    val name: String,
    val firstLocation: Location,
    val people: Int,
    val stage: Int,
    var isEnable: Boolean
    ) {
}