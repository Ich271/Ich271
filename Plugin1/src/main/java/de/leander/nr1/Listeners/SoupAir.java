package de.leander.nr1.Listeners;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import java.util.Objects;
public class SoupAir implements Listener {
    @EventHandler
    public void Consumessoup(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
            ItemStack mushroomstew = new ItemStack(Material.MUSHROOM_STEW);
            Player player = event.getPlayer();
            if (player.getItemInHand().equals(mushroomstew)) {
                if (player.getHealth() <= 19) {
                    double health = player.getHealth() + 6;
                    if (health >= 20)
                        health = 20;
                    ItemStack bowl = new ItemStack(Material.BOWL);
                    player.setHealth(health);
                    Objects.requireNonNull(player.getEquipment()).setItemInMainHand(bowl);

                }
            }
        }
    }
}