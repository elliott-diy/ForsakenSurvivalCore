package com.forsakensurvival.forsakencore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("forsaken.fly")) {
                if (player.getAllowFlight() == (true)) {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a&l(!) &a You are now flying!"));
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&a&l(!) &a You are no longer flying!"));
                }
            }
            else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&l(!) &4You don't have permission to use this command!"));

            }


        } else {
            System.out.println(ChatColor.RED + "You must be ingame to use this command!");
        }

        return false;
    }






}
