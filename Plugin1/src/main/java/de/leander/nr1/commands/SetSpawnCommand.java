package de.leander.nr1.commands;
import de.leander.nr1.NR1;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
public class SetSpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("de.leander.spawn")) {
                if (args.length == 0) {
                    FileConfiguration config = NR1.getPlugin().getConfig();
                    config.set("Spawn.World", player.getWorld().getName());
                    config.set("Spawn.X", player.getLocation().getX());
                    config.set("Spawn.Y", player.getLocation().getY());
                    config.set("Spawn.Z", player.getLocation().getZ());
                    config.set("Spawn.Yaw", player.getLocation().getYaw());
                    config.set("Spawn.Pitch", player.getLocation().getPitch());
                    NR1.plugin.saveConfig();
                    player.sendMessage("Position saved");
                }else player.sendMessage("Not " + args);
            } else player.sendMessage("no");
        }
        return false;
    }
}
