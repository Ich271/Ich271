package de.leander.nr1.Listeners;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import java.util.Random;
public class Ez implements Listener {
    Random roller = new Random();
    int variant;

    @EventHandler
    public void PlayerSendsEz(AsyncPlayerChatEvent event) {
        if (event.getMessage().equals("Ez")) {
            variant = 1 + roller.nextInt(3);
            if (variant == 0)
                event.setMessage("Sucks to suck");
            if (variant == 1)
                event.setMessage("Purple is for sure bluer than green");
            if (variant == 2)
                event.setMessage("I am new at this game pls teach me how to play");
            if (variant == 3)
                event.setMessage("You are a great person! Do you want to play some Bedwars with me?");
        }
    }
}
