package click.erudosaba.mc.emineboss.command.commands

import org.bukkit.entity.Player

interface SubCommand {

    fun onCommand(player: Player, args : Array<String>)

    fun name() : String

    fun info() : String

    fun aliases() : Array<String>
}
