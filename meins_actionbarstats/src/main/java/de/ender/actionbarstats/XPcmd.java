package de.ender.actionbarstats;

import de.ender.core.CConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class XPcmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Main plugin = Main.getPlugin();
        if(sender instanceof Player) {
            Player p = (Player) sender;
            CConfig cconfig = new CConfig("custom", plugin);
            FileConfiguration config = cconfig.getCustomConfig();
            if (new CConfig("custom", plugin).getCustomConfig().getBoolean("XP.On")) {
                config.set("XP.On", false);
                p.sendMessage("XP-Bar:"+ ChatColor.RED+" OFF");
            } else {
                config.set("XP.On", true);
                p.sendMessage("XP-Bar:"+ ChatColor.GREEN+" ON");
            }
            cconfig.save();
        }
        return false;
    }
}
