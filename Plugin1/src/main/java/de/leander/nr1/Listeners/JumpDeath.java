package de.leander.nr1.Listeners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class JumpDeath implements Listener {

    @EventHandler
    public void playerJumps(PlayerJumpEvent event) {
        boolean enabled = false;
        if (event.getPlayer() == event.getPlayer()) {

            if (enabled == true) {
                Player player = event.getPlayer();

                player.setHealth(0);
            }


        }

    }
}
