package de.leander.nr1.Listeners;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class OpCreeper implements Listener {
    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

        if ((event.getEntityType() == EntityType.CREEPER)) {

            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(true);


        }
    }
}