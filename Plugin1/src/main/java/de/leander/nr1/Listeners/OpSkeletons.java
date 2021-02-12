package de.leander.nr1.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

public class OpSkeletons implements Listener {

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {
        if ((event.getEntityType() == EntityType.SKELETON)) {


            Skeleton skeleton = (Skeleton) event.getEntity();
            ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
            helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

            ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

            ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

            ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
            boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

            skeleton.getEquipment().setHelmet(new ItemStack(helmet));
            skeleton.getEquipment().setChestplate(new ItemStack(chestplate));
            skeleton.getEquipment().setLeggings(new ItemStack(leggings));
            skeleton.getEquipment().setBoots(new ItemStack(boots));


            ItemStack punchPow = new ItemStack(Material.BOW);
            punchPow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
            skeleton.getEquipment().setItemInMainHand(new ItemStack(punchPow));

        }
    }
}
