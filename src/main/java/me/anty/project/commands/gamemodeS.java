package me.anty.project.commands;

import me.anty.project.main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemodeS implements CommandExecutor {


    private final main plugin;

    public gamemodeS(main plugin) {this.plugin = plugin;}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("a-team.gms")){
                if (args.length > 0){
                    Player target = Bukkit.getPlayer(args[0]);

                    try {
                        target.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(target + "" + "dostal gamemode survival");
                    } catch (NullPointerException e){player.sendMessage(target + "" + "neexistuje");}
                }
            }
        }
        return false;
    }
}
