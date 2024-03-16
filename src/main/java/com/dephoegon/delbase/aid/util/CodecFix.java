package com.dephoegon.delbase.aid.util;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import java.util.Optional;

public final class CodecFix {
    private CodecFix() {}

    public static final Codec<ItemStack> OPTIONAL_ITEM_STACK_CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(ItemStack::getItem),
                Codec.intRange(1,64).optionalFieldOf("count", 1).forGetter(ItemStack::getCount),
                CompoundTag.CODEC.optionalFieldOf("tag").forGetter((stack) -> {
                    return Optional.ofNullable(stack.getTag());
                })).apply(instance, CodecFix::createItemStackFix);
    });
    public static final Codec<ItemStack> ITEM_STACK_CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(ItemStack::getItem),
                Codec.intRange(1, 64).fieldOf("count").forGetter(ItemStack::getCount),
                CompoundTag.CODEC.optionalFieldOf("tag").forGetter((stack) -> {
                    return Optional.ofNullable(stack.getTag());
                })).apply(instance, CodecFix::createItemStackFix);
    });
    public static final Codec<ItemStack> SINGLE_ITEM_STACK_CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(ItemStack::getItem),
                Codec.intRange(1, 64).optionalFieldOf("hidden", 1).forGetter(ItemStack::getCount),
                CompoundTag.CODEC.optionalFieldOf("tag").forGetter((stack) -> {
                    return Optional.ofNullable(stack.getTag());
                })).apply(instance, CodecFix::createItemStackFix);
    });

    private static ItemStack createItemStackFix(ItemLike item, int count, Optional<CompoundTag> nbt) {
        ItemStack itemStack = new ItemStack(item, count);
        nbt.ifPresent(itemStack::setTag);
        return itemStack;
    }
}