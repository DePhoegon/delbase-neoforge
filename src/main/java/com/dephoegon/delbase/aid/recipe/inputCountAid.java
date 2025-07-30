package com.dephoegon.delbase.aid.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.Ingredient;

public record inputCountAid(Ingredient ingredient, int count) {
    public static final MapCodec<inputCountAid> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("item").forGetter(inputCountAid::ingredient),
            Codec.INT.optionalFieldOf("count", 1).forGetter(inputCountAid::count)
    ).apply(instance, inputCountAid::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, Integer> INT_CODEC = StreamCodec.of(RegistryFriendlyByteBuf::writeVarInt, RegistryFriendlyByteBuf::readVarInt);

    public static final StreamCodec<RegistryFriendlyByteBuf, inputCountAid> STREAM_CODEC = StreamCodec.composite(Ingredient.CONTENTS_STREAM_CODEC, inputCountAid::ingredient, INT_CODEC, inputCountAid::count, inputCountAid::new);
}
