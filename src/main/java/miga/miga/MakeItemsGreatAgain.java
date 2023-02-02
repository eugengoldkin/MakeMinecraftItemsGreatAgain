package miga.miga;


import org.bukkit.plugin.java.JavaPlugin;

public final class MakeItemsGreatAgain extends JavaPlugin {

    @Override
    public void onEnable() {

        Recipes.addBuddingAmethystRecipe(this);
        Recipes.addEnchantedGoldenAppleRecipe(this);
        Recipes.addAmethystShardRecipe(this);
        Recipes.addNetherQuartzRecipe(this);
        Recipes.addSlowArrow(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
