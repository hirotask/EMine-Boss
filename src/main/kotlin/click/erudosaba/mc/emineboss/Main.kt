package click.erudosaba.mc.emineboss

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onDisable() {
        logger.info("Plugin Disabled")
    }

    override fun onEnable() {
        logger.info("Plugin Enabled")
    }
}