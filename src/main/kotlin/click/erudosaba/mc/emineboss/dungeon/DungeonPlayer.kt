package click.erudosaba.mc.emineboss.dungeon

import org.bukkit.entity.Player

class DungeonPlayer(val player: Player, val dungeon: Dungeon) {

    var stage: Int = 0
}