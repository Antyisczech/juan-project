package me.anty.project;

import me.anty.project.commands.gamemodeC;
import me.anty.project.commands.gamemodeS;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("gmc").setExecutor(new gamemodeC(this));
        getCommand("gms").setExecutor(new gamemodeS(this));

        System.out.print("Plugin zapnut");

    }

    @Override
    public void onDisable() {
        System.out.print("Plugin vypnut");
    }
}
