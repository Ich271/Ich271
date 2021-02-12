package de.leander.nr1.commands;

import de.leander.nr1.NR1;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DamageCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {

            NR1.plugin.log("Du bist ne Maschine");

            return  true;

        }

        Player player = (Player) sender;

        if(player.hasPermission("de.leander.NR1.damage")){
            player.setFoodLevel(1);
            player.setHealth(0.1d);
            player.setSaturation(0);
            player.sendMessage(NR1.Prefix + "lööööööööööööööööööööl");
            player.playSound(player.getLocation(), Sound.ENTITY_IRON_GOLEM_DAMAGE, 1.0f, 1.2f);
        }
        else {
            player.sendMessage(NR1.Prefix + "§cNOPE");
            player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 0.8f, 1.2f);
        }
        return true;
    }
}
