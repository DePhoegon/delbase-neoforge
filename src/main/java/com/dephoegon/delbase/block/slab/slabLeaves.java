package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.leafSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabLeaves {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OAK_LEAF_SLAB = registerBlock("oak_leaf_slab",
            ()-> new leafSlab(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> SPRUCE_LEAF_SLAB = registerBlock("spruce_leaf_slab",
            ()-> new leafSlab(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> JUNGLE_LEAF_SLAB = registerBlock("jungle_leaf_slab",
            ()-> new leafSlab(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> BIRCH_LEAF_SLAB = registerBlock("birch_leaf_slab",
            ()-> new leafSlab(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> ACACIA_LEAF_SLAB = registerBlock("acacia_leaf_slab",
            ()-> new leafSlab(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> DARK_OAK_LEAF_SLAB = registerBlock("dark_oak_leaf_slab",
            ()-> new leafSlab(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> MANGROVE_LEAF_SLAB = registerBlock("mangrove_leaf_slab",
            ()-> new leafSlab(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<SlabBlock> CHERRY_LEAF_SLAB = registerBlock("cherry_leaf_slab",
            ()-> new leafSlab(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<SlabBlock> AZALEA_LEAF_SLAB = registerBlock("azalea_leaf_slab",
            ()-> new leafSlab(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<SlabBlock> FLOWERING_AZALEA_LEAF_SLAB = registerBlock("flowering_azalea_leaf_slab",
            ()-> new leafSlab(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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