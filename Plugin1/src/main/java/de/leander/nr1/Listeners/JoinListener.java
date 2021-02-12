package de.leander.nr1.Listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {

    @EventHandler
    public void handlePlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        event.setJoinMessage(event.getPlayer().getName() + " ist auf den server gehüpft.");
        player.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 1.0f);

    }

}
