package com.dephoegon.delbase.aid.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import org.jetbrains.annotations.NotNull;

public record blockCutterRecipeInput(ItemStack input, ItemStack plans) implements RecipeInput {

    public blockCutterRecipeInput {
        if (input == null || plans == null) { throw new IllegalArgumentException("Input and plans cannot be null"); }
    }
    public @NotNull ItemStack getItem(int index) {
        return switch (index) {
            case 0 -> input;
            case 1 -> plans;
            default -> ItemStack.EMPTY;
        };
    }
    public int size() { return 2; }
}
