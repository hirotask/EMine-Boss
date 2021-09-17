package click.erudosaba.mc.emineboss.boss

import org.bukkit.Location

open class Boss(
    val name: String,
    var hp: Int,
    var time: Int,
    var isEnabled: Boolean,
    var firstLocation : Location,
    val stage: Int
    ) {

    open fun summon() {}
}