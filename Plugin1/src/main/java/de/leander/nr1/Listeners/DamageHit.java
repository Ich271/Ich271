package de.leander.nr1.Listeners;


import com.destroystokyo.paper.event.player.PlayerAttackEntityCooldownResetEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class DamageHit implements Listener {

    @EventHandler
    public void playerHits(PlayerChangedMainHandEvent event) {

        Player player = event.getPlayer();
        double health = player.getHealth();
        health = health - 0.1;
        player.setHealth(health);

    }

}
