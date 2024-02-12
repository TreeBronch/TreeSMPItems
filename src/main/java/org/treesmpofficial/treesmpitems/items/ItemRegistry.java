package org.treesmpofficial.treesmpitems.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemRegistry {

    public MethodHolder methodHolder;


    public List<ItemStack> items = new ArrayList<>();

    public void init() {
        methodHolder = new MethodHolder();
        items.add(new PassiveItemBase("Test Item", "This is a test item", 64, 1, 0, Material.DIAMOND).buildItem());
        items.add(new InteractiveItemBase("Test Item 2", "This is a test item", 64, 1, 1, Material.DIAMOND, methodHolder.testAbility(null)).buildItem());
    }

    public ItemStack getItem(String name) {
        for (ItemStack item : items) {
            if (Objects.requireNonNull(item.getItemMeta()).getDisplayName().equals(name)) {
                return item;
            }
        }
        return null;
    }

}
