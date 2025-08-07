package com.dephoegon.delbase.aid.recipe;

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
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.recipe.modRecipes.blockCutterRecipeName;
import static com.dephoegon.delbase.block.entity.base.machineBlocks.BLOCK_CUTTING_STATION;
import static net.minecraft.world.item.Items.*;

public class blockCuttingStationRecipeCategory_JEI implements IRecipeCategory<blockCutterRecipe> {
    public final static ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(Mod_ID, blockCutterRecipeName);
    public final static ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_jei.png");

    public static final RecipeType<blockCutterRecipe> RECIPE_TYPE = new RecipeType<>(UID, blockCutterRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public blockCuttingStationRecipeCategory_JEI(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BLOCK_CUTTING_STATION.get()));
    }
    public @NotNull RecipeType<blockCutterRecipe> getRecipeType() { return RECIPE_TYPE; }
    public @NotNull Component getTitle() { return Component.translatable("gui.delbase.block_cutter"); }
    @SuppressWarnings("removal")
    public @NotNull IDrawable getBackground() { return this.background; }
    public @Nullable IDrawable getIcon() { return this.icon; }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, blockCutterRecipe recipe, @NotNull IFocusGroup focuses) {
        ItemStack resultItem = recipe.getResultItem(null);
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().getFirst());
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(recipe.getIngredients().get(1));
        boolean useStatic = true;
        if (resultItem.getItem().asItem() == DIRT.asItem()) {
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
        if (resultItem.getItem().asItem() == GRASS_BLOCK.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(STICK),
                    new ItemStack(BLACKSTONE),
                    new ItemStack(COBBLED_DEEPSLATE),
                    new ItemStack(COBBLESTONE)
            ));
        }
        if (resultItem.getItem().asItem() == NETHERITE_INGOT.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(NETHERITE_INGOT),
                    new ItemStack(DIAMOND)
            ));
        }

        if (useStatic){
            if (resultItem.getItem() instanceof ArmorItem armor) {
                boolean netherite = armor.getMaterial() == ArmorMaterials.NETHERITE;
                if (netherite) {
                    builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                            new ItemStack(NETHERITE_INGOT),
                            new ItemStack(DIAMOND)
                    ));
                } else {
                    builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60)
                            .addItemStack(resultItem);
                }
            } else {
                builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60)
                        .addItemStack(resultItem);
            }
        }
    }
}
