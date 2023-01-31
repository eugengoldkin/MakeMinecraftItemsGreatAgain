package miga.miga;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

public final class MakeItemsGreatAgain extends JavaPlugin {

    @Override
    public void onEnable() {

        Recipes.addBuddingAmethystRecipe(this);
        Recipes.addEnchantedGoldenAppleRecipe(this);
        Recipes.addAmethystShard(this);
        Recipes.addNetherQuartz(this);

        //ItemStack specialPotion = new ItemStack(Material.POTION,1);
        //PotionMeta itemMeta = (PotionMeta) specialPotion.getItemMeta();
        //itemMeta.addCustomEffect(potionEffect, true);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
