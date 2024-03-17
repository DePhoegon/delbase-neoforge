package com.dephoegon.delbase.intergration.jei;

import com.dephoegon.delbase.aid.recipe.blockCuttingStationRecipes;
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
import net.minecraft.world.item.crafting.RecipeHolder;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.item.Items.*;

public class blockCutter implements IRecipeCategory<RecipeHolder<blockCuttingStationRecipes>> {
    public final static ResourceLocation UID = new ResourceLocation(MODID, "block_cutting");
    public final static ResourceLocation TEXTURE = new ResourceLocation(MODID, "textures/gui/block_cutting_station_gui_jei.png");
    public  static final RecipeType<RecipeHolder<blockCuttingStationRecipes>> TYPE = RecipeType.createFromVanilla(blockCuttingStationRecipes.Type.INSTANCE);

    private final IDrawable background;
    private final IDrawable icon;

    public blockCutter(@NotNull IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0,0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BLOCK_CUTTING_STATION.get()));
    }
    public @NotNull RecipeType<RecipeHolder<blockCuttingStationRecipes>> getRecipeType() { return TYPE; }
    public @NotNull Component getTitle() { return Component.translatable("station.delbase.block_cutter"); }
    public @NotNull IDrawable getBackground() { return this.background; }
    public @NotNull IDrawable getIcon() { return this.icon; }

    public void setRecipe(@NotNull IRecipeLayoutBuilder builder, @NotNull RecipeHolder<blockCuttingStationRecipes> recipe, @NotNull IFocusGroup iFocusGroup) {
        ItemStack itemStack = recipe.value().getOutput();
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addItemStack(recipe.value().getPlans());
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addItemStack(recipe.value().getInput());
        boolean useStatic = true;
        if (recipe.value().getOutput().getItem().asItem() == DIRT.asItem()) {
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
        if (recipe.value().getOutput().getItem().asItem() == GRASS_BLOCK.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(STICK),
                    new ItemStack(BLACKSTONE),
                    new ItemStack(COBBLED_DEEPSLATE),
                    new ItemStack(COBBLESTONE)
            ));
        }
        if (recipe.value().getOutput().getItem().asItem() == NETHERITE_INGOT.asItem()) {
            useStatic = false;
            builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStacks(List.of(
                    new ItemStack(NETHERITE_INGOT),
                    new ItemStack(DIAMOND)
            ));
        }
        if (useStatic){
            if (recipe.value().getOutput().getItem() instanceof ArmorItem armor) {
                boolean netherrite = armor.getMaterial() == ArmorMaterials.NETHERITE;
                if (netherrite) {
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