package de.leander.nr1.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class ChatClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (sender.hasPermission("de.leander.cc")) {
                if (args.length == 0) {
                    for(int i = 0; i <=150; i++)
                        Bukkit.broadcastMessage(" ");
                            Bukkit.broadcastMessage("Chat cleared");
                } else sender.sendMessage("Not" + args);
            } else sender.sendMessage("nö")
        ;return false;
    }
}
