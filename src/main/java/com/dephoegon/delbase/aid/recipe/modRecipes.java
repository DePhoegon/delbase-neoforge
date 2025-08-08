package com.dephoegon.delbase.aid.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.dephoegon.delbase.Delbase.Mod_ID;

public class modRecipes {
    public static final String blockCutterRecipeName = "block_cutting";
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, Mod_ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, Mod_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<blockCutterRecipe>> BLOCK_CUTTER_SERIALIZER = RECIPE_SERIALIZERS.register(blockCutterRecipeName, blockCutterRecipe.Serializer::new); // Use the constant

    public static final DeferredHolder<RecipeType<?>, RecipeType<blockCutterRecipe>> BLOCK_CUTTER_TYPE = RECIPE_TYPES.register(blockCutterRecipeName, () -> new RecipeType<>() {
                @Override
                public String toString() { return blockCutterRecipeName; } // Use the constant
            });

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}