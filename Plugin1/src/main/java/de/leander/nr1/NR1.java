package de.leander.nr1;
import de.leander.nr1.Listeners.*;
import de.leander.nr1.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;
public final class NR1 extends JavaPlugin {
    public static  String Prefix = "§aPlugin §7§o";
    public static NR1 plugin;
    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(Prefix + text);
    }
    @Override
    public void onEnable() {
        plugin = this;
        log(" Enabled");
        PluginManager pluginManager = Bukkit.getPluginManager();
        MuteCommand muteCommand = new MuteCommand();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new OpCreeper(), this);
        pluginManager.registerEvents(new OpSkeletons(), this);
        pluginManager.registerEvents(new OpZombies(), this);
        pluginManager.registerEvents(new JumpDeath(), this);
        pluginManager.registerEvents(new DamageHit(), this);
        pluginManager.registerEvents(muteCommand, this);
        pluginManager.registerEvents(new Ez(), this);
        pluginManager.registerEvents(new NoDead(), this);
        pluginManager.registerEvents(new SoupAir(), this);
        pluginManager.registerEvents(new SoupBlock(), this);
        Objects.requireNonNull(getCommand("bp")).setExecutor(new BpCommand());
        Objects.requireNonNull(getCommand("damage")).setExecutor(new DamageCommand());
        Objects.requireNonNull(getCommand("heal")).setExecutor(new HealCommand());
        Objects.requireNonNull(getCommand("setSpawn")).setExecutor(new SetSpawnCommand());
        Objects.requireNonNull(getCommand("Spawn")).setExecutor(new Spawncommand());
        Objects.requireNonNull(getCommand("countdown")).setExecutor(new PartyCommand());
        Objects.requireNonNull(getCommand("ChatClear")).setExecutor(new ChatClear());
        Objects.requireNonNull(getCommand("mute")).setExecutor(muteCommand);
    }
    public static NR1 getPlugin() {
        return plugin;
    }
    @Override
    public void onDisable() {
        log(" Disabled");
    }
}
