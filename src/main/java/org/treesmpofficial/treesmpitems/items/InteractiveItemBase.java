package org.treesmpofficial.treesmpitems.items;

import com.google.common.collect.Multimap;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Method;
import java.util.Arrays;

public class InteractiveItemBase {
    private static String name; // Name of the item
    private static String description;

    private static int id;

    public static double damagePercentIncrease = 0;
    public static double healthPercentIncrease = 0;

    private static int maxStack;
    private static int rarity;
    private static Material mat;

    private static Method rightClickExecutor;

    public InteractiveItemBase(String s, String thisIsATestItem, int i, int i1, int i2, Material material) {
    }

    public static void onRightClick(PlayerInteractEvent e) {
        //Print chat message
        Player player = e.getPlayer();
        player.sendMessage("You right clicked the item! Now make a custom one");
    }

    public ItemStack buildItem() {
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
