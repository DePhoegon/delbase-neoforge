package com.dephoegon.delbase.aid.recipe;

import com.dephoegon.delbase.delbase;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class modRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, delbase.MODID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPE_DEFERRED_REGISTER = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, delbase.MODID);

    public static final Supplier<RecipeSerializer<blockCuttingStationRecipes>> BLOCK_CUTTER_SERIALIZER = RECIPE_SERIALIZERS.register(blockCuttingStationRecipes.Serializer.ID, () -> blockCuttingStationRecipes.Serializer.INSTANCE);
    public static final Supplier<RecipeType<blockCuttingStationRecipes>> BLOCK_CUTTER_TYPE = RECIPE_TYPE_DEFERRED_REGISTER.register(blockCuttingStationRecipes.Type.ID, () -> blockCuttingStationRecipes.Type.INSTANCE);

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPE_DEFERRED_REGISTER.register(eventBus);
    }
}
