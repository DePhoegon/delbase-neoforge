package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.DEEPSLATE;
import static net.minecraft.world.level.block.Blocks.STONE;

public class wallStones {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE).sound(SoundType.DEEPSLATE), false, 0, 0, null));

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