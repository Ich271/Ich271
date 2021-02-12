package de.leander.nr1.Listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

public class OpZombies implements Listener {

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {
        if ((event.getEntityType() == EntityType.ZOMBIE)) {

            Zombie zombie = (Zombie) event.getEntity();
            zombie.setBaby(true);

            ItemStack helmet = new ItemStack(Material.NETHERITE_HELMET);
            helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            zombie.getEquipment().setHelmet(new ItemStack(helmet));
            ItemStack chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
            chestplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            zombie.getEquipment().setChestplate(new ItemStack(chestplate));
            ItemStack leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
            leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            zombie.getEquipment().setLeggings(new ItemStack(leggings));
            ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
            boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
            zombie.getEquipment().setBoots(new ItemStack(boots));
            zombie.addPotionEffect(PotionEffectType.INCREASE_DAMAGE.createEffect(1000000, 2));


            ItemStack netheriteAxe = new ItemStack(Material.NETHERITE_AXE);
            netheriteAxe.addEnchantment(Enchantment.DAMAGE_ALL, 5);
            zombie.getEquipment().setItemInMainHand(new ItemStack(netheriteAxe));
        }
    }
}