package click.erudosaba.mc.emineboss.stage

import org.bukkit.Location

class Stage(
   val playerFirstLoc : Location,
   val firstLoc : Location,
   val endLoc : Location,
   var isCleared : Boolean
) {}