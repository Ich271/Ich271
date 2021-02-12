package de.leander.nr1.commands;

import de.leander.nr1.NR1;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("de.leander.NR1.heal")) {
                if (args.length == 0) {
                    player.setFoodLevel(20);
                    player.setHealth(20d);
                    player.setSaturation(20);
                    player.sendMessage(NR1.Prefix + "Du wurdest geheilt");
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 0.2f, 1.2f);
                } else if(args.length == 1) {

                    Player target = Bukkit.getPlayer(args[0]);

                    if(target != null) {
                        target.setFoodLevel(20);
                        target.setHealth(20d);
                        target.setSaturation(20);
                        target.sendMessage(NR1.Prefix + player.getName() + " hat dich geheilt");
                        target.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 0.2f, 1.2f);
                        player.sendMessage("Du hast " + target.getName() + " geheilt");

                    } else
                        player.sendMessage(NR1.Prefix + "§cnicht " + args[0]);
                        player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 0.8f, 1.2f);

                } else
                    player.sendMessage(NR1.Prefix + "§csadge");
                    player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 0.8f, 1.2f);

            } else
                player.sendMessage(NR1.Prefix + "§cNOPE");
                player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 0.8f, 1.2f);
        } else
            sender.sendMessage(NR1.Prefix + "§cDu bist ne Maschine");
        return true;
    }
}
