package org.treesmpofficial.treesmpitems.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.treesmpofficial.treesmpitems.items.ItemRegistry;

public class RightClickEvent implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        ItemStack item = e.getItem();
        if (item == null) return;
        if (ItemRegistry.interactiveItems.values().contains(item)) {
            ItemRegistry.interactiveItems.forEach((k, v) -> {
                if (v.equals(item)) {
                    k.onRightClick(e);
                }
            });
        }
    }
}
