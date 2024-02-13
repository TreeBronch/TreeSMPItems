package org.treesmpofficial.treesmpitems.items;

import org.bukkit.Material;

public class Totems {
    public static class PowerTotem extends PassiveItemBase {
        public PowerTotem() {
            super("Power Totem", "Increases damage by 50%\nDecreases health by 50%", 1, 1, 1, Material.TOTEM_OF_UNDYING);
            this.damagePercentIncrease = 0.5;
            this.healthPercentIncrease = -0.5;
        }
    }

    public static class HealthTotem extends PassiveItemBase{
        public HealthTotem() {
            super("Health Totem", "Increases health by 40%", 1, 1, 2, Material.TOTEM_OF_UNDYING);
            this.damagePercentIncrease = 0;
            this.healthPercentIncrease = 0.4;
        }
    }
}