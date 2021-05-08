package de.imateapot.antiexplosion

import org.bukkit.plugin.java.JavaPlugin

class AntiExplosion: JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(ExplosionListener(), this)
    }
}
