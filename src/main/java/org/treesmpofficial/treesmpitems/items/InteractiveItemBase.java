package org.treesmpofficial.treesmpitems.items;

import org.bukkit.Material;

import java.lang.reflect.Method;

public record InteractiveItemBase(
        String s, String
) {
    private static String name; // Name of the item
    private static String description;

    private static int id;

    public static double damagePercentIncrease = 0;
    public static double healthPercentIncrease = 0;

    private static int maxStack;
    private static int rarity;
    private static Material mat;

    private static Method rightClickExecutor;

    public InteractiveItemBase(String s, String thisIsATestItem, int i, int i1, int i2, Material material, void aVoid) {
    }
}
