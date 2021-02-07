package com.forsakensurvival.forsakencore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MaintenanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("forsaken.maintenance")) {
                if (args.length == 0) {
                    player.sendMessage("Please use this command in the right way, I'm to lazy to create a help menu");
                    return true;
                }
                if (args[0].equalsIgnoreCase("activate")) {
                    Bukkit.getServer().setWhitelist(true);
                    for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                        if (!p.isOp() && !p.isWhitelisted()) {
                            p.kickPlayer("Server is now in mainteance mode.");
                        }
                    }
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&l(!) &aMaintenance mode has been enabled!"));
                    return true;
                }
                if (args[0].equalsIgnoreCase("deactivate")) {
                    Bukkit.getServer().setWhitelist(false);
                    player.sendMessage("Mainteance mode is now deactivated.");
                    return true;
                }
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l(!) &4You don't have permission to use this command!"));
            }
        }



        return false;
    }
}
