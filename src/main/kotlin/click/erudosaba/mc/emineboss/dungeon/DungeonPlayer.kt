package click.erudosaba.mc.emineboss.dungeon

import org.bukkit.entity.Player

class DungeonPlayer(val player: Player, val dungeon: Dungeon) {

    var stage: Int = 0

    // TODO stageを確認し、変更するメソッド
    fun stageChanger() {}
}