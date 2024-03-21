package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.aid.block.item.compoundPlans;
import com.dephoegon.delbase.aid.block.item.cutterPlans;
import com.dephoegon.delbase.aid.util.CodecFix;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.inputSlot;
import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.planSlot;
import static com.dephoegon.delbase.delbase.MODID;

public class blockCuttingStationRecipes implements Recipe<SimpleContainer> {
    public static final String ID = "block_cutting";
    private final ItemStack output;
    private final ItemStack input;
    private final ItemStack plans;
    private Map<RecipeType<?>, Map<ResourceLocation, RecipeHolder<?>>> recipes = ImmutableMap.of();
    public blockCuttingStationRecipes(ItemStack output, ItemStack input, ItemStack plans) {
        this.output = output;
        this.input = input;
        this.plans = plans;
    }
    public ItemStack getOutput() { return output.copy(); }
    public ItemStack getPlans() { return plans; }
    public ItemStack getInput() { return input; }
    private @NotNull ItemStack getDefault(@NotNull ItemStack input) { return input.getItem().getDefaultInstance(); }
    @Override
    public boolean matches(@NotNull SimpleContainer pContainer, @NotNull Level pLevel) {
        if (getInput().equals(ItemStack.EMPTY) || getPlans().equals(ItemStack.EMPTY)) { return false; }
        boolean inputs = getDefault(getInput()).toString().equals(getDefault(pContainer.getItem(inputSlot)).toString());
        boolean outputs = false;
        boolean hold = false;
        if (inputs) { outputs = getDefault(getPlans()).toString().equals(getDefault(pContainer.getItem(planSlot)).toString()); }
        if (inputs && outputs) {
            int planSlots = getPlans().getItem() instanceof compoundPlans ? getPlans().getCount() : 1;
            hold = planSlots <= pContainer.getItem(planSlot).getCount() && getInput().getCount() <= pContainer.getItem(inputSlot).getCount();
        }
        return hold;
    }
    public @NotNull ItemStack assemble(@NotNull SimpleContainer pContainer, @NotNull RegistryAccess pRegistryAccess) { return output.copy(); }
    public boolean canCraftInDimensions(int pWidth, int pHeight) { return true; }
    public @NotNull ItemStack getResultItem(@NotNull RegistryAccess pRegistryAccess) {
        return output.copy();
    }
    public @NotNull RecipeSerializer<?> getSerializer() {
        return modRecipes.BLOCK_CUTTER_SERIALIZER.get();
    }
    public @NotNull RecipeType<?> getType() {
        return modRecipes.BLOCK_CUTTER_TYPE.get();
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
            if (plans.getItem() instanceof cutterPlans) { plans.setCount(1); }
            return new blockCuttingStationRecipes(output, input, plans);
        }
        public void toNetwork(final @NotNull FriendlyByteBuf pBuffer, final @NotNull blockCuttingStationRecipes pRecipe) {
            pBuffer.writeItem(pRecipe.output);
            if (pRecipe.input.getItem() instanceof cutterPlans) { pRecipe.input.setCount(1); }
            pBuffer.writeItem(pRecipe.input);
            pBuffer.writeItem(pRecipe.plans);
        }
    }
}