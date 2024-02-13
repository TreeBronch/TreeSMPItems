package org.treesmpofficial.treesmpitems.items;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class Wands {
    public static class WindWand extends InteractiveItemBase {
        public WindWand() {
            super("Wind Wand", "Shoots a gust of wind.\nGust does no damage but launches entities into the opposite direction", 1, 1, 1, Material.STICK);
        }

        public static void onRightClick(PlayerInteractEvent e) {
            Player player = e.getPlayer();
            player.setVelocity(player.getLocation().getDirection().multiply(-2));
        }
    }
    public static class ExplodeyWand extends InteractiveItemBase {
        public ExplodeyWand() {
            super("Explodey Wand", "Shoots a fireball.\nFireball does damage and explodes", 1, 1, 2, Material.STICK);
        }

        public static void onRightClick(PlayerInteractEvent e) {
            Player player = e.getPlayer();
            Fireball fireball = player.launchProjectile(Fireball.class);
            fireball.setIsIncendiary(false);
            fireball.setVelocity(player.getLocation().getDirection().multiply(2));
        }
    }
}
