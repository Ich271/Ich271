package de.leander.nr1.commands;

import de.leander.nr1.NR1;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PartyCommand implements CommandExecutor {

    private int taskID;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NR1.getPlugin(), new Runnable() {

                int coutdown = 5;

                @Override
                public void run() {
                    if (coutdown <= 0) {
                        Bukkit.broadcastMessage("The countdown ran out");
                        Bukkit.getScheduler().cancelTask(taskID);
                        return;
                    }
                    Bukkit.broadcastMessage("Only " + coutdown + " seconds");
                    coutdown--;
                }
            }, 0, 20);

        }

        return false;
    }
}

