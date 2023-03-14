package me.anty.project;

import me.anty.project.commands.gamemodeC;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("gmc").setExecutor(new gamemodeC(this));

        System.out.print("Plugin zapnut");

    }

    @Override
    public void onDisable() {
        System.out.print("Plugin vypnut");
    }
}
