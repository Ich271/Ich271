package de.leander.nr1.commands;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class BpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("de.leander.NR1.Bp")) {
                if (args.length == 0) {
                    Inventory inventory = Bukkit.createInventory(null, 9 * 3, "BackPack");
                    ItemStack item = new ItemStack(Material.BOW);
                    ItemMeta itemMeta = item.getItemMeta();
                    itemMeta.setDisplayName("§aTechnoBow");
                    itemMeta.addEnchant(Enchantment.ARROW_DAMAGE, 10, true);
                    item.setItemMeta(itemMeta);
                    inventory.addItem(item);
                    item.setAmount(100);
                    inventory.setItem(13, item);
                    player.openInventory(inventory);
                    player.sendMessage("Your BackPack:");
                } else player.sendMessage("nö");
            } else player.sendMessage("Nope");
        }
        return false;
    }
}
