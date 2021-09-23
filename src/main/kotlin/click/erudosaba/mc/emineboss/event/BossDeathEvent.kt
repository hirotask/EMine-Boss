package click.erudosaba.mc.emineboss.event

import click.erudosaba.mc.emineboss.boss.Boss
import click.erudosaba.mc.emineboss.dungeon.Dungeon
import click.erudosaba.mc.emineboss.dungeon.DungeonPlayer
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class BossDeathEvent(val DPlayer : DungeonPlayer, val boss : Boss) : Event(), Cancellable {

    var cancel = false

    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    override fun isCancelled(): Boolean {
        return cancel
    }

    override fun setCancelled(p0: Boolean) {
        cancel = p0
    }

    companion object {
        private val HANDLERS = HandlerList()

        @JvmStatic
        fun getHandlerList() : HandlerList {
            return HANDLERS
        }
    }
}