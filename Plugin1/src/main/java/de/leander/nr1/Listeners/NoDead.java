package de.leander.nr1.Listeners;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class NoDead implements Listener {
    @EventHandler
    public void PlayerDies(PlayerDeathEvent event) {
        event.setCancelled(true);
        Player player = event.getEntity().getPlayer();
        player.setGameMode(GameMode.SPECTATOR);

    }
}
