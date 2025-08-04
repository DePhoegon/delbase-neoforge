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

import static com.dephoegon.delbase.block.stair.stairStrippedWood.*;
import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairWood {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> SPRUCE_WOOD_STAIR = registerBlock("spruce_wood_stair",
            () -> new woodStair(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> ACACIA_WOOD_STAIR = registerBlock("acacia_wood_stair",
            () -> new woodStair(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> OAK_WOOD_STAIR = registerBlock("oak_wood_stair",
            () -> new woodStair(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> DARK_OAK_WOOD_STAIR = registerBlock("dark_oak_wood_stair",
            () -> new woodStair(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> JUNGLE_WOOD_STAIR = registerBlock("jungle_wood_stair",
            () -> new woodStair(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> BIRCH_WOOD_STAIR = registerBlock("birch_wood_stair",
            () -> new woodStair(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> WARPED_HYPHAE_STAIR = registerBlock("warped_hyphae_stair",
            () -> new woodStair(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_HYPHAE_STAIR.get().defaultBlockState()));
    public static final DeferredBlock<StairBlock> CRIMSON_HYPHAE_STAIR = registerBlock("crimson_hyphae_stair",
            () -> new woodStair(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_HYPHAE_STAIR.get().defaultBlockState()));
    public static final DeferredBlock<StairBlock> SPRUCE_LOG_STAIR = registerBlock("spruce_log_stair",
            () -> new woodStair(SPRUCE_WOOD, SoundType.WOOD, true, STRIPPED_SPRUCE_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> ACACIA_LOG_STAIR = registerBlock("acacia_log_stair",
            () -> new woodStair(ACACIA_WOOD, SoundType.WOOD, true, STRIPPED_ACACIA_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> OAK_LOG_STAIR = registerBlock("oak_log_stair",
            () -> new woodStair(OAK_WOOD, SoundType.WOOD, true, STRIPPED_OAK_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> DARK_OAK_LOG_STAIR = registerBlock("dark_oak_log_stair",
            () -> new woodStair(DARK_OAK_WOOD, SoundType.WOOD, true, STRIPPED_DARK_OAK_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> JUNGLE_LOG_STAIR = registerBlock("jungle_log_stair",
            () -> new woodStair(JUNGLE_WOOD, SoundType.WOOD, true, STRIPPED_JUNGLE_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> BIRCH_LOG_STAIR = registerBlock("birch_log_stair",
            () -> new woodStair(BIRCH_WOOD, SoundType.WOOD, true, STRIPPED_BIRCH_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> WARPED_STEM_STAIR = registerBlock("warped_stem_stair",
            () -> new woodStair(WARPED_HYPHAE, SoundType.WOOD, false, STRIPPED_WARPED_STEM_STAIR.get().defaultBlockState()));
    public static final DeferredBlock<StairBlock> CRIMSON_STEM_STAIR = registerBlock("crimson_stem_stair",
            () -> new woodStair(CRIMSON_HYPHAE, SoundType.WOOD, false, STRIPPED_CRIMSON_STEM_STAIR.get().defaultBlockState()));
    public static final DeferredBlock<StairBlock> MANGROVE_WOOD_STAIR = registerBlock("mangrove_wood_stair",
            () -> new woodStair(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> MANGROVE_LOG_STAIR = registerBlock("mangrove_log_stair",
            () -> new woodStair(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> CHERRY_WOOD_STAIR = registerBlock("cherry_wood_stair",
            () -> new woodStair(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_WOOD_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> CHEERY_LOG_STAIR = registerBlock("cherry_log_stair",
            () -> new woodStair(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_STAIR.get().defaultBlockState()), 5001);
    public static final DeferredBlock<StairBlock> BAMBOO_BLOCK_STAIR = registerBlock("bamboo_block_stair",
            () -> new woodStair(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_BLOCK_STAIR.get().defaultBlockState()), 5001);

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