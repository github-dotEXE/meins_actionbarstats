package de.ender.actionbarstats;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class onPlayerDamageListener implements Listener {
    @Deprecated
    @EventHandler
    public void onPlayerDamageEntity (EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            p.sendActionBar("§4"+event.getCause().name()+String.format(": -%.2fHP ⇨ ", (event.getFinalDamage())) + String.format("%.2fHP", p.getHealth()- event.getFinalDamage()));
        }
    }
}
