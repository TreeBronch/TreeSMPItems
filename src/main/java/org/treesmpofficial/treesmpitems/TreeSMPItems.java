package org.treesmpofficial.treesmpitems;

import org.bukkit.plugin.java.JavaPlugin;
import org.treesmpofficial.treesmpitems.items.ItemRegistry;

public final class TreeSMPItems extends JavaPlugin {

    private ItemRegistry registry;

    public static TreeSMPItems plugin;

    @Override
    public void onEnable() {
        registry = new ItemRegistry();
        registry.init();
        plugin = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
