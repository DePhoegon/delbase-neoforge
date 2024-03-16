package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.woodSlab;
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

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabStrippedWood {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> STRIPPED_SPRUCE_WOOD_SLAB = register("stripped_spruce_wood_slab",
            () -> new woodSlab(STRIPPED_SPRUCE_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_SPRUCE_LOG_SLAB = register("stripped_spruce_log_slab",
            () -> new woodSlab(STRIPPED_SPRUCE_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_OAK_WOOD_SLAB = register("stripped_oak_wood_slab",
            () -> new woodSlab(STRIPPED_OAK_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_OAK_LOG_SLAB = register("stripped_oak_log_slab",
            () -> new woodSlab(STRIPPED_OAK_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_hyphae_slab",
            () -> new woodSlab(STRIPPED_WARPED_HYPHAE, SoundType.WOOD, false, null));
    public static final DeferredBlock<SlabBlock> STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_stem_slab",
            () -> new woodSlab(STRIPPED_WARPED_HYPHAE, SoundType.WOOD,false, null));
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_hyphae_slab",
            () -> new woodSlab(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD,false, null));
    public static final DeferredBlock<SlabBlock> STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_stem_slab",
            () -> new woodSlab(STRIPPED_CRIMSON_HYPHAE, SoundType.WOOD,false, null));
    public static final DeferredBlock<SlabBlock> STRIPPED_DARK_OAK_WOOD_SLAB = register("stripped_dark_oak_wood_slab",
            () -> new woodSlab(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_DARK_OAK_LOG_SLAB = register("stripped_dark_oak_log_slab",
            () -> new woodSlab(STRIPPED_DARK_OAK_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_ACACIA_WOOD_SLAB = register("stripped_acacia_wood_slab",
            () -> new woodSlab(STRIPPED_ACACIA_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_ACACIA_LOG_SLAB = register("stripped_acacia_log_slab",
            () -> new woodSlab(STRIPPED_ACACIA_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_JUNGLE_WOOD_SLAB = register("stripped_jungle_wood_slab",
            () -> new woodSlab(STRIPPED_JUNGLE_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_JUNGLE_LOG_SLAB = register("stripped_jungle_log_slab",
            () -> new woodSlab(STRIPPED_JUNGLE_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_BIRCH_WOOD_SLAB = register("stripped_birch_wood_slab",
            () -> new woodSlab(STRIPPED_BIRCH_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_BIRCH_LOG_SLAB = register("stripped_birch_log_slab",
            () -> new woodSlab(STRIPPED_BIRCH_WOOD, SoundType.WOOD,true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_MANGROVE_WOOD_SLAB = register("stripped_mangrove_wood_slab",
            () -> new woodSlab(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_MANGROVE_LOG_SLAB = register("stripped_mangrove_log_slab",
            () -> new woodSlab(STRIPPED_BIRCH_WOOD, SoundType.WOOD, true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_CHERRY_WOOD_SLAB = register("stripped_cherry_wood_slab",
            () -> new woodSlab(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_CHERRY_LOG_SLAB = register("stripped_cherry_log_slab",
            () -> new woodSlab(STRIPPED_CHERRY_WOOD, SoundType.CHERRY_WOOD, true, null), 3001);
    public static final DeferredBlock<SlabBlock> STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab",
            () -> new woodSlab(BAMBOO_PLANKS, SoundType.BAMBOO_WOOD, true, null), 3001);

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}