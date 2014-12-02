package io.ivy;

import net.md_5.bungee.api.plugin.Plugin;

public class bnotify extends Plugin {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new bnotifyListener());
    }
}
