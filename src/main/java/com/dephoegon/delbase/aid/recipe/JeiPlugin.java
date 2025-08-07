package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.entity.screen.blockCutterScreen;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@mezz.jei.api.JeiPlugin
public class JeiPlugin implements IModPlugin {
    @Override
    public @NotNull ResourceLocation getPluginUid() { return ResourceLocation.fromNamespaceAndPath(Delbase.Mod_ID, "jei_plugin"); }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) { registration.addRecipeCategories(new blockCuttingStationRecipeCategory_JEI(registration.getJeiHelpers().getGuiHelper())); }

    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        assert Minecraft.getInstance().level != null;
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<blockCutterRecipe> recipes = recipeManager.getAllRecipesFor(modRecipes.BLOCK_CUTTER_TYPE.get()).stream().map(RecipeHolder::value).toList();

        registration.addRecipes(blockCuttingStationRecipeCategory_JEI.RECIPE_TYPE, recipes);
    }

    @Override
    public void registerGuiHandlers(@NotNull IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(blockCutterScreen.class, 103, 40, 20, 20, blockCuttingStationRecipeCategory_JEI.RECIPE_TYPE);
    }
}
