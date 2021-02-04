package com.forsakensurvival.forsakencore;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("forsaken.gamemode")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&l(!) &aYour gamemode has been set to survival."));
            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l(!) &4You don't have permission to use this command!"));
            }

        } else {
            System.out.print(ChatColor.RED + "You must be ingame to use this command!");
        }

        return false;
    }
}
