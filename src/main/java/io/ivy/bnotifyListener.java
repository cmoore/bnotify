package io.ivy;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class bnotifyListener implements Listener {
    @EventHandler
    public void onServerConnected(final ServerConnectedEvent event) {
        String name = event.getServer().getInfo().getName();
        event.getPlayer().sendMessage(new ComponentBuilder("FARTS INCLAALFJA").create());
        //event.getPlayer().sendMessage(new ComponentBuilder("Welcome to " + event.getServer().getInfo().getName() + "!").color(ChatColor.GREEN).create());
    }
}
