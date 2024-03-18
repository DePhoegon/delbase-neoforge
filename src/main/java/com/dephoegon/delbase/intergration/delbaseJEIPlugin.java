package com.dephoegon.delbase.intergration;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
import com.dephoegon.delbase.intergration.jei.blockCutter;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.aid.recipe.modRecipes.BLOCK_CUTTER_TYPE;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.delbase.MODID;

@JeiPlugin
public class delbaseJEIPlugin implements IModPlugin {
    public static final RecipeType<blockCuttingStationRecipes> BLOCK_CUTTING_STATION_RECIPE = RecipeType.create(MODID, blockCuttingStationRecipes.ID, blockCuttingStationRecipes.class);
    @Override
    public @NotNull ResourceLocation getPluginUid() { return new ResourceLocation(MODID, "jei_plugin"); }
    public void registerCategories(@NotNull IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new blockCutter(registration.getJeiHelpers().getGuiHelper()));
    }
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        assert Minecraft.getInstance().level != null;
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        registration.addRecipes(blockCutter.TYPE, recipeManager.getAllRecipesFor(BLOCK_CUTTER_TYPE.get()));
    }
    public void registerRecipeCatalysts(@NotNull IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(BLOCK_CUTTING_STATION.get()), BLOCK_CUTTING_STATION_RECIPE);
    }
}