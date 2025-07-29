package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.leafStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairLeaves {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> OAK_LEAF_STAIR = registerBlock("oak_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> SPRUCE_LEAF_STAIR = registerBlock("spruce_leaf_stair",
            ()-> new leafStair(SPRUCE_STAIRS, SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> JUNGLE_LEAF_STAIR = registerBlock("jungle_leaf_stair",
            ()-> new leafStair(JUNGLE_STAIRS, JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> BIRCH_LEAF_STAIR = registerBlock("birch_leaf_stair",
            ()-> new leafStair(BIRCH_STAIRS, BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> ACACIA_LEAF_STAIR = registerBlock("acacia_leaf_stair",
            ()-> new leafStair(ACACIA_STAIRS, ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> DARK_OAK_LEAF_STAIR = registerBlock("dark_oak_leaf_stair",
            ()-> new leafStair(DARK_OAK_STAIRS, DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> MANGROVE_LEAF_STAIR = registerBlock("mangrove_leaf_stair",
            ()-> new leafStair(MANGROVE_STAIRS, MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<StairBlock> CHERRY_LEAF_STAIR = registerBlock("cherry_leaf_stair",
            ()-> new leafStair(CHERRY_STAIRS, CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<StairBlock> AZALEA_LEAF_STAIR = registerBlock("azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<StairBlock> FLOWERING_AZALEA_LEAF_STAIR = registerBlock("flowering_azalea_leaf_stair",
            ()-> new leafStair(OAK_STAIRS, FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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