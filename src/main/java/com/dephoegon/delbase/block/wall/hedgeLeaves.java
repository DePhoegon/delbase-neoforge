package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.woodWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class hedgeLeaves {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> OAK_HEDGE = registerBlock("oak_hedge",
            () -> new woodWall(OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> SPRUCE_HEDGE = registerBlock("spruce_hedge",
            () -> new woodWall(SPRUCE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> BIRCH_HEDGE = registerBlock("birch_hedge",
            () -> new woodWall(BIRCH_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> JUNGLE_HEDGE = registerBlock("jungle_hedge",
            () -> new woodWall(JUNGLE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> ACACIA_HEDGE = registerBlock("acacia_hedge",
            () -> new woodWall(ACACIA_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> DARK_OAK_HEDGE = registerBlock("dark_oak_hedge",
            () -> new woodWall(DARK_OAK_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> MANGROVE_HEDGE = registerBlock("mangrove_hedge",
            () -> new woodWall(MANGROVE_LEAVES, SoundType.GRASS, true, null));
    public static final DeferredBlock<WallBlock> CHERRY_HEDGE = registerBlock("cherry_hedge",
            () -> new woodWall(CHERRY_LEAVES, SoundType.CHERRY_LEAVES, true, null));
    public static final DeferredBlock<WallBlock> AZALEA_HEDGE = registerBlock("azalea_hedge",
            () -> new woodWall(AZALEA_LEAVES, SoundType.AZALEA_LEAVES, true, null));
    public static final DeferredBlock<WallBlock> FLOWERING_AZALEA_HEDGE = registerBlock("flowering_azalea_hedge",
            () -> new woodWall(FLOWERING_AZALEA_LEAVES, SoundType.FLOWERING_AZALEA, true, null));

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