package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.woodSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.block.slab.slabStrippedWood.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabWood {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            () -> new woodSlab(SPRUCE_WOOD, SoundType.WOOD,true, STRIPPED_SPRUCE_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab",
            () -> new woodSlab(SPRUCE_WOOD, SoundType.WOOD,true, STRIPPED_SPRUCE_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            () -> new woodSlab(OAK_WOOD, SoundType.WOOD,true, STRIPPED_OAK_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> OAK_LOG_SLAB = registerBlock("oak_log_slab",
            () -> new woodSlab(OAK_WOOD, SoundType.WOOD,true, STRIPPED_OAK_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            () -> new woodSlab(WARPED_HYPHAE, SoundType.WOOD,false, STRIPPED_WARPED_HYPHAE_SLAB.get().defaultBlockState()));
    public static final DeferredBlock<SlabBlock> WARPED_STEM_SLAB = registerBlock("warped_stem_slab",
            () -> new woodSlab(WARPED_HYPHAE, SoundType.WOOD,false, STRIPPED_WARPED_STEM_SLAB.get().defaultBlockState()));
    public static final DeferredBlock<SlabBlock> CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            () -> new woodSlab(CRIMSON_HYPHAE, SoundType.WOOD,false, STRIPPED_CRIMSON_HYPHAE_SLAB.get().defaultBlockState()));
    public static final DeferredBlock<SlabBlock> CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab",
            () -> new woodSlab(CRIMSON_HYPHAE, SoundType.WOOD,false, STRIPPED_CRIMSON_STEM_SLAB.get().defaultBlockState()));
    public static final DeferredBlock<SlabBlock> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            () -> new woodSlab(DARK_OAK_WOOD, SoundType.WOOD,true, STRIPPED_DARK_OAK_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab",
            () -> new woodSlab(DARK_OAK_WOOD, SoundType.WOOD,true, STRIPPED_DARK_OAK_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            () -> new woodSlab(ACACIA_WOOD, SoundType.WOOD,true, STRIPPED_ACACIA_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> ACACIA_LOG_SLAB = registerBlock("acacia_log_slab",
            () -> new woodSlab(ACACIA_WOOD, SoundType.WOOD,true, STRIPPED_ACACIA_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            () -> new woodSlab(JUNGLE_WOOD, SoundType.WOOD,true, STRIPPED_JUNGLE_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab",
            () -> new woodSlab(JUNGLE_WOOD, SoundType.WOOD,true, STRIPPED_JUNGLE_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            () -> new woodSlab(BIRCH_WOOD, SoundType.WOOD,true, STRIPPED_BIRCH_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> BIRCH_LOG_SLAB = registerBlock("birch_log_slab",
            () -> new woodSlab(BIRCH_WOOD, SoundType.WOOD,true, STRIPPED_BIRCH_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            () -> new woodSlab(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab",
            () -> new woodSlab(MANGROVE_WOOD, SoundType.WOOD, true, STRIPPED_MANGROVE_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            () -> new woodSlab(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_WOOD_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> CHERRY_LOG_SLAB = registerBlock("cherry_log_slab",
            () -> new woodSlab(CHERRY_WOOD, SoundType.CHERRY_WOOD, true, STRIPPED_CHERRY_LOG_SLAB.get().defaultBlockState()), 3001);
    public static final DeferredBlock<SlabBlock> BAMBOO_BLOCK_SLAB = registerBlock("bamboo_block_slab",
            () -> new woodSlab(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, STRIPPED_BAMBOO_BLOCK_SLAB.get().defaultBlockState()), 3001);

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