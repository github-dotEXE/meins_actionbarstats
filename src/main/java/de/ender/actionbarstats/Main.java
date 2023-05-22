package de.ender.actionbarstats;

import de.ender.core.CConfig;
import de.ender.core.Log;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static Main plugin;
    @Override
    public void onEnable() {
        Log.log(ChatColor.GREEN + "Enabling Meins HC");

        plugin = this;

        getCommand("xpbar").setExecutor(new XPcmd());
        new CConfig("custom", plugin);

        Bukkit.getPluginManager().registerEvents(new onPlayerExpListener(), this);
        Bukkit.getPluginManager().registerEvents(new onPlayerRegenListener(), this);
        Bukkit.getPluginManager().registerEvents(new onPlayerDamageEntityListener(), this);
        Bukkit.getPluginManager().registerEvents(new onPlayerDamageListener(), this);
    }

    @Override
    public void onDisable() {
        Log.log(ChatColor.GREEN + "Disabling Meins HC");

    }

    public static Main getPlugin() {
        return plugin;

    }

}