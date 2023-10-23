package com.jesper.lobbymanager;

import com.onarandombox.MultiverseCore.MultiverseCore;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyManager extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        MultiverseCore core = (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");
        getCommand("lobbymanager").setExecutor(new LobbyManagerCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
