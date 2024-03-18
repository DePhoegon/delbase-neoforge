package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.util.CodecFix;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.inputSlot;
import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.planSlot;
import static com.dephoegon.delbase.delbase.MODID;

public class blockCuttingStationRecipes implements Recipe<SimpleContainer> {
    public static final String ID = "block_cutting";
    private final ItemStack output;
    private final ItemStack input;
    private final ItemStack plans;
    public blockCuttingStationRecipes(ItemStack output, ItemStack input, ItemStack plans) {
        this.output = output;
        this.input = input;
        this.plans = plans;
    }
    public ItemStack getOutput() {
        return output;
    }
    public ItemStack getPlans() { return plans; }
    public ItemStack getInput() { return input; }
    private @NotNull ItemStack getDefault(@NotNull ItemStack input) { return input.getItem().getDefaultInstance(); }
    @Override
    public boolean matches(@NotNull SimpleContainer pContainer, @NotNull Level pLevel) {
        if (getInput().equals(ItemStack.EMPTY) || getPlans().equals(ItemStack.EMPTY)) { return false; }
        return getDefault(getInput()).equals(pContainer.getItem(inputSlot).getItem().getDefaultInstance()) && getDefault(getPlans()).equals(pContainer.getItem(planSlot).getItem().getDefaultInstance());
    }
    public @NotNull ItemStack assemble(@NotNull SimpleContainer pContainer, @NotNull RegistryAccess pRegistryAccess) { return output.copy(); }
    public boolean canCraftInDimensions(int pWidth, int pHeight) { return true; }
    public @NotNull ItemStack getResultItem(@NotNull RegistryAccess pRegistryAccess) {
        return output.copy();
    }
    public @NotNull RecipeSerializer<?> getSerializer() {
        return blockCuttingStationRecipes.Serializer.INSTANCE;
    }
    public  @NotNull RecipeType<?> getType() {
        return blockCuttingStationRecipes.Type.INSTANCE;
    }
    public boolean isSpecial() { return true; }
    public static final class Type implements RecipeType<blockCuttingStationRecipes> {
        private Type() {}
        public static final blockCuttingStationRecipes.Type INSTANCE = new Type();
        public static final String ID = blockCuttingStationRecipes.ID;
    }
    public static class Serializer implements RecipeSerializer<blockCuttingStationRecipes> {
        public static final blockCuttingStationRecipes.Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(MODID, blockCuttingStationRecipes.ID);
        private final Codec<blockCuttingStationRecipes> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
                        CodecFix.ITEM_STACK_CODEC.fieldOf("output").forGetter((recipe) -> recipe.output),
                        CodecFix.OPTIONAL_ITEM_STACK_CODEC.fieldOf("input").forGetter((recipe) -> recipe.input),
                        CodecFix.SINGLE_ITEM_STACK_CODEC.fieldOf("plans").forGetter((recipe) -> recipe.plans)).
                apply(instance, blockCuttingStationRecipes::new));
        public @NotNull Codec<blockCuttingStationRecipes> codec() { return CODEC; }
        public @NotNull blockCuttingStationRecipes fromNetwork(final @NotNull FriendlyByteBuf pBuffer) {
            final ItemStack output = pBuffer.readItem();
            final ItemStack input = pBuffer.readItem();
            final ItemStack plans = pBuffer.readItem();
            return new blockCuttingStationRecipes(output, input, plans);
        }
        public void toNetwork(final @NotNull FriendlyByteBuf pBuffer, final @NotNull blockCuttingStationRecipes pRecipe) {
            pBuffer.writeItem(pRecipe.output);
            pBuffer.writeItem(pRecipe.input);
            pBuffer.writeItem(pRecipe.plans);
        }
    }
}