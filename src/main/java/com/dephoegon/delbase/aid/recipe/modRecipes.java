package com.dephoegon.delbase.aid.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dephoegon.delbase.delbase.Mod_ID;

public class modRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Mod_ID);

    public static final RegistryObject<RecipeSerializer<blockCuttingStationRecipes>> BLOCK_CUTTING_SERIALIZER =
            SERIALIZERS.register(blockCuttingStationRecipes.Type.ID, () -> blockCuttingStationRecipes.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
