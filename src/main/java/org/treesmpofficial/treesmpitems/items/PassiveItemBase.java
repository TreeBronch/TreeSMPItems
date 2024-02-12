package org.treesmpofficial.treesmpitems.items;

import com.google.common.collect.Multimap;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class PassiveItemBase {
    private String name; // Name of the item
    private String description;

    private int id;

    public double damagePercentIncrease = 0;
    public double healthPercentIncrease = 0;

    private int maxStack;
    private int rarity;
    private Material mat;

    public PassiveItemBase(String name, String description, int maxStack, int rarity, int id, Material mat) {
        this.name = name;
        this.description = description;
        this.maxStack = maxStack;
        this.rarity = rarity;
        this.id = id;
        this.mat = mat;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public int getRarity() {
        return rarity;
    }

    public int getId() {
        return id;
    }

    public ItemStack buildItem(){
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(description));
        meta.setAttributeModifiers((Multimap<Attribute, AttributeModifier>) Arrays.asList(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attack_damage", damagePercentIncrease, AttributeModifier.Operation.MULTIPLY_SCALAR_1)));
        meta.setAttributeModifiers((Multimap<Attribute, AttributeModifier>) Arrays.asList(Attribute.GENERIC_MAX_HEALTH, new AttributeModifier("generic.max_health", healthPercentIncrease, AttributeModifier.Operation.MULTIPLY_SCALAR_1)));
        item.setItemMeta(meta);
        return item;
    }
}
