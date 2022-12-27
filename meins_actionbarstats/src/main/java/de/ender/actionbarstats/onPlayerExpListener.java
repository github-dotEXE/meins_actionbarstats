package de.ender.actionbarstats;

import de.ender.core.CConfig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

public class onPlayerExpListener implements Listener {
    @Deprecated
    @EventHandler
    public void onPlayerExp(PlayerExpChangeEvent event) {
        if(new CConfig("custom", Main.getPlugin()).getCustomConfig().getBoolean("XP.On")) {
            Player p = event.getPlayer();
            p.sendActionBar("§a+" + event.getAmount() + "XP");
        }
    }
}
