package io.ivy;

import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

public class bnotifyListener extends Plugin implements Listener {
    @EventHandler
    public void onServerConnected(final ServerConnectedEvent event) {
        String name = event.getPlayer().getName();
        
        getProxy().getPlayers().stream().forEach( (player) -> {
        	if (!name.equals(player.getName())) {
        		player.sendMessage( new ComponentBuilder(name + " connected.").create());
        	}
        });
    }
}
