package de.leander.nr1.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import java.util.ArrayList;
public class MuteCommand implements CommandExecutor, Listener {
    private ArrayList<String> mutedPlayers = new ArrayList<>();
    @EventHandler
    public void playerSends(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if(mutedPlayers.contains(player.getName())) {
            player.sendMessage("You are muted");
            event.setCancelled(true);
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("de.leander.mute")) {
            if(args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                if(target != null) {
                    if(!mutedPlayers.contains(target.getName())) {
                        mutedPlayers.add(target.getName());
                        Bukkit.broadcastMessage("the idiot " + target + " got muted");
                        target.sendMessage("And there it ends...");
                    }else {
                        mutedPlayers.remove(target.getName());
                        sender.sendMessage("You have done it! Live with it");
                    }
                }else sender.sendMessage("The player " + args + "isn´t online");
            }else sender.sendMessage("player not found");
        } else sender.sendMessage("no");
        return false;
    }
}
