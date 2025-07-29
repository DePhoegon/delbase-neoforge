package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.terracottaStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairTerracotta {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIR = registerBlock("white_terracotta_stair",
            ()-> new terracottaStair(WHITE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIR = registerBlock("orange_terracotta_stair",
            ()-> new terracottaStair(ORANGE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIR = registerBlock("magenta_terracotta_stair",
            ()-> new terracottaStair(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIR = registerBlock("light_blue_terracotta_stair",
            ()-> new terracottaStair(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIR = registerBlock("yellow_terracotta_stair",
            ()-> new terracottaStair(YELLOW_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIR = registerBlock("lime_terracotta_stair",
            ()-> new terracottaStair(LIME_TERRACOTTA));
    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIR = registerBlock("pink_terracotta_stair",
            ()-> new terracottaStair(PINK_TERRACOTTA));
    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIR = registerBlock("gray_terracotta_stair",
            ()-> new terracottaStair(GRAY_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIR = registerBlock("light_gray_terracotta_stair",
            ()-> new terracottaStair(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIR = registerBlock("cyan_terracotta_stair",
            ()-> new terracottaStair(CYAN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIR = registerBlock("purple_terracotta_stair",
            ()-> new terracottaStair(PURPLE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIR = registerBlock("blue_terracotta_stair",
            ()-> new terracottaStair(BLUE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIR = registerBlock("brown_terracotta_stair",
            ()-> new terracottaStair(BROWN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIR = registerBlock("green_terracotta_stair",
            ()-> new terracottaStair(GREEN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIR = registerBlock("red_terracotta_stair",
            ()-> new terracottaStair(RED_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIR = registerBlock("black_terracotta_stair",
            ()-> new terracottaStair(BLACK_TERRACOTTA));
    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIR = registerBlock("terracotta_stair",
            ()-> new terracottaStair(TERRACOTTA));

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