package click.erudosaba.mc.emineboss.util

import click.erudosaba.mc.emineboss.Main
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.configuration.file.YamlConfiguration
import org.jetbrains.annotations.NotNull
import java.io.File
import java.io.IOException
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.util.logging.Level

class CustomConfig(val plugin : Main, path : String?) {

    lateinit var config : FileConfiguration
    val file = path ?: "config.yml"
    val configFile: File = File(plugin.dataFolder, file)

    init {
        this.saveDefaultConfig()
        this.reload()
    }

    private fun saveDefaultConfig() {
        if(!configFile.exists()) {
            plugin.saveResource(file,false)
        }
    }

    fun saveConfig() {
        try {
            config.save(configFile)
        } catch(ex : IOException) {
            plugin.logger.log(Level.SEVERE,"Could not save config to $configFile",ex)
        }
    }

    private fun reload() {
        config = YamlConfiguration.loadConfiguration(configFile)
        val configStream = plugin.getResource(file) ?: return

        (config as @NotNull YamlConfiguration).setDefaults(YamlConfiguration.loadConfiguration(InputStreamReader(configStream,
            StandardCharsets.UTF_8)))
    }
}