package de.imateapot.antiexplosion

import org.bukkit.Sound
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityExplodeEvent

class ExplosionListener() : Listener {
    @EventHandler
    fun onEntityExplode(event: EntityExplodeEvent) {
        if (event.entityType == EntityType.CREEPER) {
            event
                .apply { isCancelled = true }
                .run {
                    location.world!!.playSound(
                        event.location,
                        Sound.ENTITY_GENERIC_EXPLODE,
                        10F,
                        0F
                    )
                }

        }
    }
}
