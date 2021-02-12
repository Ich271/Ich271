package de.leander.nr1.commands;

import de.leander.nr1.Listeners.Listeners;
import de.leander.nr1.NR1;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EarrapeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("de.leander.NR1.earrape")) {
                if (args.length == 0) {
                    player.playSound(player.getLocation(), Sound.AMBIENT_BASALT_DELTAS_LOOP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_BASALT_DELTAS_ADDITIONS, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_IRON_GOLEM_DAMAGE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_BASALT_DELTAS_MOOD, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_CRIMSON_FOREST_ADDITIONS, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_CAVE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_CRIMSON_FOREST_LOOP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_NETHER_WASTES_ADDITIONS, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_NETHER_WASTES_LOOP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_NETHER_WASTES_MOOD, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_SOUL_SAND_VALLEY_LOOP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_SOUL_SAND_VALLEY_MOOD, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_ENTER, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_EXIT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_LOOP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_BREAK, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_FALL, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_HIT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_PLACE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_STEP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_HIT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_STEP, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_CONDUIT_ACTIVATE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_CONDUIT_AMBIENT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_CONDUIT_AMBIENT_SHORT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_CONDUIT_ATTACK_TARGET, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_CONDUIT_DEACTIVATE, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_FIRE_AMBIENT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.BLOCK_TRIPWIRE_ATTACH, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_DROWNED_HURT_WATER, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_DROWNED_DEATH, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_DROWNED_SHOOT, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_DROWNED_DEATH_WATER, 2.0f, 1.0f);
                    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_STARE, 2.0f, 1.0f);






                } else if(args.length == 1) {

                    Player target = Bukkit.getPlayer(args[0]);

                    if(target != null) {
                        target.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 0.2f, 1.2f);
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




//
//   public NR1() {
//
//       INSTANCE = this;
//
//       this.register();
//   }
//
//
//  private  void register() {
//       getServer().getPluginManager().registerEvents(new Listeners(), this);
//      Bukkit.getPluginCommand( "heal").setExecutor(new HealCommand());
//      Bukkit.getPluginCommand("damage").setExecutor(new DamageCommand());
//      Bukkit.getPluginCommand("earrape").setExecutor(new EarrapeCommand());
//  }
//