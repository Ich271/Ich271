package de.leander.nr1.commands;
import de.leander.nr1.NR1;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import java.util.Objects;
public class Spawncommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("de.leander.spawn")) {
                if (args.length == 0) {
                    FileConfiguration config = NR1.getPlugin().getConfig();
                    World world = Bukkit.getWorld(Objects.requireNonNull(config.getString("Spawn.World")));
                    double x = config.getDouble("Spawn.X");
                    double y = config.getDouble("Spawn.Y");
                    double z = config.getDouble("Spawn.Z");
                    float yaw = (float) config.getDouble("Spawn.Yaw");
                    float pitch = (float) config.getDouble("Spawn.Pitch");
                    Location location = new Location(world, x, y, z, yaw , pitch);
                    player.teleport(location);
                }else player.sendMessage("not " + args);
            } else player.sendMessage("no");
        }
        return false;
    }
}
