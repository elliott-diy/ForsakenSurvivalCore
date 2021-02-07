package com.forsakensurvival.forsakencore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForsakenCore extends JavaPlugin {
    private PluginDescriptionFile pluginInfo = getDescription();
    private String pluginVer = pluginInfo.getVersion();
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("===========================");
        System.out.println(ChatColor.GREEN + "ForsakenCore has started!");
        System.out.println("Build: " + pluginVer);
        System.out.println("Author: " + ChatColor.GOLD + "Duplexes");
        System.out.println("===========================");
        getCommand("forsakencore").setExecutor(new ForsakenCoreCommand());
        // Gamemode commands
        getCommand("gmc").setExecutor(new gmcCommand());
        getCommand("gms").setExecutor(new gmsCommand());
        getCommand("gma").setExecutor(new gmaCommand());
        getCommand("gmsp").setExecutor(new gmspCommand());
        // Moderation Commands
        //getCommand("").setExecutor(new VanishCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        //getCommand("").setExecutor(new TempMuteCommand())
        //getCommand("").setExecutor(new MuteCommand());
        //getCommand("").setExecutor(new UnMuteCommand());
        getCommand("maintenance").setExecutor(new MaintenanceCommand());
        // Basic Chat Commands
        //getCommand("").setExecutor(new DiscordCommand());
        //getCommand("").setExecutor(new WebsiteCommand());
        //getCommand("").setExecutor(new RulesCommand());
        //getCommand("").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("===========================");
        System.out.println(ChatColor.RED + "ForsakenCore has stopped.");
        System.out.println("Build: " + pluginVer);
        System.out.println("Author: " + ChatColor.GOLD + "Duplexes");
        System.out.println("===========================");
    }
}
