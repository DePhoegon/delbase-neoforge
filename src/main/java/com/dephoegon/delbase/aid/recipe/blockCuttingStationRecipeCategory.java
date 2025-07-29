package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.integration.jeiDelbaseModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.List;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.delbase.Mod_ID;
import static net.minecraft.world.item.Items.*;

public class blockCuttingStationRecipeCategory implements IRecipeCategory<blockCuttingStationRecipes> {
    public final static ResourceLocation UID = new ResourceLocation(Mod_ID, "block_cutting");
    public final static ResourceLocation TEXTURE = new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public blockCuttingStationRecipeCategory(@NotNull IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BLOCK_CUTTING_STATION.get()));
    }
    public @NotNull RecipeType<blockCuttingStationRecipes> getRecipeType() { return jeiDelbaseModPlugin.BLOCK_CUTTING_STATION_RECIPE; }
    public @NotNull Component getTitle() { return Component.literal("Block Cutting Station"); }
    public @NotNull IDrawable getBackground() { return this.background; }
    public @NotNull IDrawable getIcon() { return this.icon; }
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull blockCuttingStationRecipes recipe, @Nonnull IFocusGroup focusGroup) {
        ItemStack itemStack = recipe.getResultItem();
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addItemStack(recipe.getInput());
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addItemStack(recipe.getPlans());
        boolean useStatic = true;
        if (recipe.getResultItem().getItem().asItem() == DIRT.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(STICK),
                    new ItemStack(ACACIA_PLANKS),
                    new ItemStack(DARK_OAK_PLANKS),
                    new ItemStack(JUNGLE_PLANKS),
                    new ItemStack(BIRCH_PLANKS),
                    new ItemStack(SPRUCE_PLANKS),
                    new ItemStack(CRIMSON_PLANKS),
                    new ItemStack(WARPED_PLANKS),
                    new ItemStack(OAK_PLANKS)
            ));
        }
        if (recipe.getResultItem().getItem().asItem() == GRASS_BLOCK.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(STICK),
                    new ItemStack(BLACKSTONE),
                    new ItemStack(COBBLED_DEEPSLATE),
                    new ItemStack(COBBLESTONE)
            ));
        }
        if (recipe.getResultItem().getItem().asItem() == NETHERITE_INGOT.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(NETHERITE_INGOT),
                    new ItemStack(DIAMOND)
            ));
        }

        if (useStatic){
            if (recipe.getResultItem().getItem() instanceof ArmorItem armor) {
                boolean netherite = armor.getMaterial() == ArmorMaterials.NETHERITE;
                if (netherite) {
                    builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                        new ItemStack(NETHERITE_INGOT),
                        new ItemStack(DIAMOND)
                    ));
                } else {
                    builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60)
                            .addItemStack(itemStack);
                }
            } else {
                builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60)
                        .addItemStack(itemStack);
            }
        }
    }
}