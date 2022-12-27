package de.ender.actionbarstats;

import de.ender.core.CConfig;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class onPlayerDamageEntityListener implements Listener {
    @Deprecated
    @EventHandler
    public void onPlayerDamageEntity (EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            //Player hit smthn
            Player p = (Player) event.getDamager();
            p.sendActionBar("§c" + event.getEntity().getName() + String.format(": -%.2fHP ⇨ ", event.getFinalDamage()) + String.format("%.2fHP", ((LivingEntity) event.getEntity()).getHealth()-event.getFinalDamage()));
        }
    }
}
