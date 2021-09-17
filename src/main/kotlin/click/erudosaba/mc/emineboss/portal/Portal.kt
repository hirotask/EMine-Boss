package click.erudosaba.mc.emineboss.portal

import click.erudosaba.mc.emineboss.dungeon.Dungeon
import org.bukkit.Location

class Portal(val loc1: Location, val loc2: Location, val dungeon: Dungeon) {

    val isEnable: Boolean = dungeon.isEnabled

    val hologram: Hologram = Hologram(this)
}