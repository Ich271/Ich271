package de.leander.nr1.Listeners;



import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;



public class Listeners implements Listener {



    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

        if ((event.getEntityType() == EntityType.CREEPER)) {

            Creeper creeper = (Creeper) event.getEntity();
            creeper.setPowered(true);

        } else if((event.getEntityType() == EntityType.SKELETON)) {


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

        } else if((event.getEntityType() == EntityType.ZOMBIE)) {

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


        } else if((event.getEntityType() == EntityType.SPIDER)) {

            Spider spider = (Spider) event.getEntity();



            spider.addPotionEffect(PotionEffectType.INVISIBILITY.createEffect(1000000, 1));




        }


    }
}