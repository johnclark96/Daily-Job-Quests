package me.delphidevelopment.minecraft.dailyjobquests.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Dailyjobquests implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            if(sender instanceof Player){
                Player player = (Player) sender;
                String pluginname = "Daily Job Quests ";
                String version = "v1.0.0-SNAPSHOT";

                sender.sendMessage(" ");
                sender.sendMessage( ChatColor.YELLOW +  "|" + ChatColor.DARK_GRAY + "==========" + ChatColor.AQUA + "[" + ChatColor.GOLD + " The New World " + ChatColor.AQUA + "]" + ChatColor.DARK_GRAY + "==========" + ChatColor.YELLOW + "|");
                sender.sendMessage(" ");
                sender.sendMessage("You are currently using " + ChatColor.GOLD + pluginname + ChatColor.BOLD + ChatColor.AQUA + version);
                sender.sendMessage(" ");
                sender.sendMessage(" This is the Help Menu ");
                sender.sendMessage(" ");
                sender.sendMessage(" This is still very much in development! Thank you for your support");
                sender.sendMessage("|===================================|");
                return true;
            }
        }
        return true;
    }
}
