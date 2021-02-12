package de.leander.nr1.Listeners;
import de.leander.nr1.NR1;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
public class GHGChallange implements Listener {
    @EventHandler
    public void PlayerMoves(PlayerMoveEvent event) {
        Player player = (Player) event;
        FileConfiguration config = NR1.getPlugin().getConfig();
        if(player.getLocation().getY() <= config.getDouble("Spawn.YG")) {
            config.set("Spawn.YG", player.getLocation().getY());
            NR1.plugin.saveConfig();
        }else  {
            player.setHealth(0);
        }
    }
}
