package de.ender.actionbarstats;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class onPlayerRegenListener implements Listener {
    @Deprecated
    @EventHandler
    public void onPlayerRegen (EntityRegainHealthEvent event) {
        if(event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            p.sendActionBar(String.format("§6+%.2fHP ⇨ ", event.getAmount()) + String.format("%.2fHP", p.getHealth()+event.getAmount()));
        }
    }
}
