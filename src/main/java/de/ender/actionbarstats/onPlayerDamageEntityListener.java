package de.ender.actionbarstats;

import org.bukkit.entity.Entity;
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
            Entity entity = event.getEntity();
            if(!(entity instanceof LivingEntity)) return;
            LivingEntity livingEntity = (LivingEntity) event.getEntity();
            double FDamage = event.getFinalDamage();
            p.sendActionBar("§c" + entity.getName() + String.format(": -%.2fHP ⇨ ", FDamage) + String.format("%.2fHP", livingEntity.getHealth()-FDamage));
        }
    }
}
