package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.modExtensions.woodStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairStrippedWood {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> STRIPPED_SPRUCE_WOOD_STAIR = registerBlock("stripped_spruce_wood_stair",
            () -> new woodStair(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_ACACIA_WOOD_STAIR = registerBlock("stripped_acacia_wood_stair",
            () -> new woodStair(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_OAK_WOOD_STAIR = registerBlock("stripped_oak_wood_stair",
            () -> new woodStair(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_DARK_OAK_WOOD_STAIR = registerBlock("stripped_dark_oak_wood_stair",
            () -> new woodStair(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_JUNGLE_WOOD_STAIR = registerBlock("stripped_jungle_wood_stair",
            () -> new woodStair(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_BIRCH_WOOD_STAIR = registerBlock("stripped_birch_wood_stair",
            () -> new woodStair(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_HYPHAE_STAIR = registerBlock("stripped_warped_hyphae_stair",
            () -> new woodStair(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_HYPHAE_STAIR = registerBlock("stripped_crimson_hyphae_stair",
            () -> new woodStair(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<StairBlock> STRIPPED_SPRUCE_LOG_STAIR = registerBlock("stripped_spruce_log_stair",
            () -> new woodStair(STRIPPED_SPRUCE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_ACACIA_LOG_STAIR = registerBlock("stripped_acacia_log_stair",
            () -> new woodStair(STRIPPED_ACACIA_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_OAK_LOG_STAIR = registerBlock("stripped_oak_log_stair",
            () -> new woodStair(STRIPPED_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_DARK_OAK_LOG_STAIR = registerBlock("stripped_dark_oak_log_stair",
            () -> new woodStair(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_JUNGLE_LOG_STAIR = registerBlock("stripped_jungle_log_stair",
            () -> new woodStair(STRIPPED_JUNGLE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_BIRCH_LOG_STAIR = registerBlock("stripped_birch_log_stair",
            () -> new woodStair(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_WARPED_STEM_STAIR = registerBlock("stripped_warped_stem_stair",
            () -> new woodStair(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<StairBlock> STRIPPED_CRIMSON_STEM_STAIR = registerBlock("stripped_crimson_stem_stair",
            () -> new woodStair(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<StairBlock> STRIPPED_MANGROVE_WOOD_STAIR = registerBlock("stripped_mangrove_wood_stair",
            () -> new woodStair(MANGROVE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_MANGROVE_LOG_STAIR = registerBlock("stripped_mangrove_log_stair",
            () -> new woodStair(MANGROVE_WOOD, SoundType.WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_CHERRY_WOOD_STAIR = registerBlock("stripped_cherry_wood_stair",
            () -> new woodStair(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_CHERRY_LOG_STAIR = registerBlock("stripped_cherry_log_stair",
            () -> new woodStair(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 5001);
    public static final DeferredBlock<StairBlock> STRIPPED_BAMBOO_BLOCK_STAIR = registerBlock("stripped_bamboo_block_stair",
            () -> new woodStair(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, null), 5001);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    @SuppressWarnings("SameParameterValue")
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}