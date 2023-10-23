package com.jesper.lobbymanager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class LobbyManagerCommand implements TabExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        if (args.length == 0) {
            sender.sendMessage("you must specify a command");
            return true;
        }

        switch (args[0]) {
            case "list" -> {
                sender.sendMessage("list of worlds");
            }
            case "delete" -> {
                if (args.length == 1) {
                    sender.sendMessage("you must specify a name");
                    return true;
                }
            }
            case "add" -> {
                if (args.length == 1) {
                    sender.sendMessage("you must specify a name");
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            // Tab-complete the subcommands
            completions.add("list");
            completions.add("delete");
            completions.add("add");
        }
        // Filter the completions based on what the player has already typed
        String partial = args[args.length - 1].toLowerCase();
        completions.removeIf(option -> !option.toLowerCase().startsWith(partial));

        return completions;
    }
}
