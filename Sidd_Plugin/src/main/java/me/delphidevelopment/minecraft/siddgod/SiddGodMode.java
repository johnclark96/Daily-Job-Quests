package me.delphidevelopment.minecraft.siddgod;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SiddGodMode extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Sidds Plugin is loading!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[SiddPlugin] " + ChatColor.YELLOW + "Now Loading Sidds GodMode into the server!");
    }
}
