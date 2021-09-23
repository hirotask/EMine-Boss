package click.erudosaba.mc.emineboss.command.commands.subcommands

import click.erudosaba.mc.emineboss.Main
import click.erudosaba.mc.emineboss.command.commands.SubCommand
import org.bukkit.entity.Player

class Help(plugin: Main) : SubCommand {

    //「/emj help args[0] args[1]」
    override fun onCommand(player: Player, args: Array<String>) {
        //ここにヘルプコマンドの処理
    }

    override fun name(): String {
        return "help"
    }

    override fun info(): String {
        return ""
    }

    override fun aliases(): Array<String> {
        return arrayOf(String())
    }
}