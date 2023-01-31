package miga.miga;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

public class Recipes {

    public static void addBuddingAmethystRecipe(Plugin plugin){

        ShapedRecipe buddingAmethystRecipe = new ShapedRecipe(
                new NamespacedKey(plugin,"buddingAmethyst"),
                new ItemStack(Material.BUDDING_AMETHYST, 1));

        buddingAmethystRecipe.shape("ABA", "BCB", "ABA");

        buddingAmethystRecipe.setIngredient('A', Material.AMETHYST_BLOCK);
        buddingAmethystRecipe.setIngredient('B', Material.CALCITE);
        buddingAmethystRecipe.setIngredient('C', Material.DIAMOND_BLOCK);

        Bukkit.addRecipe(buddingAmethystRecipe);
    }

    public static void addEnchantedGoldenAppleRecipe(Plugin plugin){

        ShapedRecipe enchantedGoldenAppleRecipe = new ShapedRecipe(
                new NamespacedKey(plugin,"enchantedGoldenApple"),
                new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));

        enchantedGoldenAppleRecipe.shape("AAA", "ABA", "AAA");

        enchantedGoldenAppleRecipe.setIngredient('A', Material.GOLD_BLOCK);
        enchantedGoldenAppleRecipe.setIngredient('B', Material.GOLDEN_APPLE);

        Bukkit.addRecipe(enchantedGoldenAppleRecipe);
    }

    public static void addAmethystShard(Plugin plugin){

        ShapelessRecipe amethystShardRecipe = new ShapelessRecipe(
                new NamespacedKey(plugin,"amethystShard"),
                new ItemStack(Material.AMETHYST_SHARD, 4));

        amethystShardRecipe.addIngredient(Material.AMETHYST_BLOCK);

        Bukkit.addRecipe(amethystShardRecipe);
    }

    public static void addNetherQuartz(Plugin plugin){

        ShapelessRecipe netherQuartzRecipe = new ShapelessRecipe(
                new NamespacedKey(plugin,"netherQuartz"),
                new ItemStack(Material.QUARTZ, 4));

        netherQuartzRecipe.addIngredient(Material.QUARTZ_BLOCK);

        Bukkit.addRecipe(netherQuartzRecipe);
    }


}
