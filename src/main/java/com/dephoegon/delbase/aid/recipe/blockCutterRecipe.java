package com.dephoegon.delbase.aid.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record blockCutterRecipe(inputCountAid inputItem, inputCountAid planItem, ItemStack output) implements Recipe<blockCutterRecipeInput> {

    public @NotNull NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.create();
        ingredients.add(inputItem.ingredient());
        ingredients.add(planItem.ingredient());
        return ingredients;
    }

    public boolean matches(@NotNull blockCutterRecipeInput input, Level level) {
        if (level.isClientSide()) { return false; }
        return inputItem.ingredient().test(input.getItem(0)) &&
                input.getItem(0).getCount() >= inputItem.count() &&
                planItem.ingredient().test(input.getItem(1)) &&
                input.getItem(1).getCount() >= planItem.count();
    }

    public @NotNull ItemStack assemble(@NotNull blockCutterRecipeInput input, HolderLookup.@NotNull Provider registries) { return output.copy(); }
    public boolean canCraftInDimensions(int width, int height) { return true; }
    public @NotNull ItemStack getResultItem(HolderLookup.@Nullable Provider registries) { return output; }
    public int getInputCount() { return inputItem.count(); }
    public int getPlanCount() { return planItem.count(); }
    public @NotNull RecipeSerializer<?> getSerializer() { return modRecipes.BLOCK_CUTTER_SERIALIZER.get(); }
    public @NotNull RecipeType<?> getType() { return modRecipes.BLOCK_CUTTER_TYPE.get(); }

    public static class Serializer implements RecipeSerializer<blockCutterRecipe> {
        public static final String ID = "block_cutter_recipe";
        public static final MapCodec<blockCutterRecipe> CODEC = RecordCodecBuilder
                .mapCodec(instance -> instance
                        .group(
                            inputCountAid.CODEC.fieldOf("input").forGetter(blockCutterRecipe::inputItem),
                            inputCountAid.CODEC.fieldOf("plans").forGetter(blockCutterRecipe::planItem),
                            ItemStack.CODEC.fieldOf("output").forGetter(blockCutterRecipe::output)
                        ).apply(instance, blockCutterRecipe::new)
                );

        public static final StreamCodec<RegistryFriendlyByteBuf, blockCutterRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        inputCountAid.STREAM_CODEC, blockCutterRecipe::inputItem,
                        inputCountAid.STREAM_CODEC, blockCutterRecipe::planItem,
                        ItemStack.STREAM_CODEC, blockCutterRecipe::output,
                        blockCutterRecipe::new
                );

        @Override
        public @NotNull MapCodec<blockCutterRecipe> codec() { return CODEC; }
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, blockCutterRecipe> streamCodec() { return STREAM_CODEC; }
    }
}