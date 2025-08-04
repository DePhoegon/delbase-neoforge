package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.quartzSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabQuartz {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab",
            () -> new quartzSlab(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new quartzSlab(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final DeferredBlock<SlabBlock> QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab",
            () -> new quartzSlab(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR).sound(SoundType.STONE)));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}