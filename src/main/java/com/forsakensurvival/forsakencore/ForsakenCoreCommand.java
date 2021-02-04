package com.forsakensurvival.forsakencore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ForsakenCoreCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (args.length == 0) {

            } else if (args[0].equalsIgnoreCase("version")) {

            } else if (args[0].equalsIgnoreCase("addons")) {

            }
        }

            return false;
    }
}
