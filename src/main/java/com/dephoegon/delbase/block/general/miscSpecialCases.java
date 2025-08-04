package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.axisBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.genBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;
import static net.minecraft.world.level.block.Blocks.STONE;

public class miscSpecialCases {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<Block> HARDENED_OAK_PLANKS = registerBlock("hardened_oak_planks",
            () -> new genBlock(BlockBehaviour.Properties.ofFullCopy(STONE).sound(SoundType.STONE),
                     "", "", "", false, 0, 0));
    public static final DeferredBlock<RotatedPillarBlock> ASH_BLOCK = registerBlock("ash_block",
            ()-> new axisBlock(BlockBehaviour.Properties.ofFullCopy(OAK_PLANKS).sound(SoundType.WOOD),
                    "","","", false, 0, 0),16000);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    @SuppressWarnings("SameParameterValue")
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
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
}
