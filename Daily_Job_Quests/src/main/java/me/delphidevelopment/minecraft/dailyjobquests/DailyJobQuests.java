package me.delphidevelopment.minecraft.dailyjobquests;

import me.delphidevelopment.minecraft.dailyjobquests.commands.Dailyjobquests;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class DailyJobQuests extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadConfig();
        System.out.println("[DailyJobQuests] Plugin is starting up!");
        getCommand("dailyjobquests").setExecutor(new Dailyjobquests());
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
