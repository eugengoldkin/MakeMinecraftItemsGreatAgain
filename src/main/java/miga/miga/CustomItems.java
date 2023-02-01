package miga.miga;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;


public class CustomItems {

    public static ItemStack getSlowArrow(int amount){
        ItemStack slowArrow = new ItemStack(Material.ARROW, amount);
        PotionMeta potionMeta = (PotionMeta) slowArrow.getItemMeta();
        if(potionMeta != null){
            PotionEffect slowEffect = new PotionEffect(
                    PotionEffectType.SLOW,200, 3, false, false, true);
            potionMeta.addCustomEffect(slowEffect,true);
            PotionData potionData = new PotionData(PotionType.SLOWNESS, true, true);
            potionMeta.setBasePotionData(potionData);
        }
        slowArrow.setItemMeta(potionMeta);
        return slowArrow;
    }

}
