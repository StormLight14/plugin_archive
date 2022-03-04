package me.stormlight.bullycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Bully implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length > 1) {
                Player msgPlayer = Bukkit.getPlayer(args[0]);
                for (int i=0;i<21;i++) {
                    Objects.requireNonNull(msgPlayer).sendMessage(ChatColor.DARK_RED + "Imagine being " + args[1] + " LOL couldn't be meeee");
                }

            } else {
                player.sendMessage(ChatColor.RED + "Correct usage: /bully (player) (word) (number)");
            }

        }

        return true;
    }
}
