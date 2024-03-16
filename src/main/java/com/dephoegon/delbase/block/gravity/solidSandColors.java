package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class solidSandColors {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_SOLID_SAND = register("solid_sand",
            () -> new solidSandBlock(14406560, SAND, "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_RED_SOLID_SAND = register("red_solid_sand",
            () -> new solidSandBlock(11098145, RED_SAND, "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLOOD_SOLID_SAND = register("blood_solid_sand",
            () -> new solidSandBlock(0xff0000, BLOOD_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> WHITE_SOLID_SAND = register("white_solid_sand",
            () -> new solidSandBlock(0xffffff, WHITE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> ORANGE_SOLID_SAND = register("orange_solid_sand",
            () -> new solidSandBlock(0xffa500, ORANGE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> MAGENTA_SOLID_SAND = register("magenta_solid_sand",
            () -> new solidSandBlock(0xff00ff, MAGENTA_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_BLUE_SOLID_SAND = register("light_blue_solid_sand",
            () -> new solidSandBlock(0xadd8e6, LIGHT_BLUE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> YELLOW_SOLID_SAND = register("yellow_solid_sand",
            () -> new solidSandBlock(0xffff00, YELLOW_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIME_SOLID_SAND = register("lime_solid_sand",
            () -> new solidSandBlock(0x00ff00, LIME_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> PINK_SOLID_SAND = register("pink_solid_sand",
            () -> new solidSandBlock(0xffc0cb, PINK_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> GRAY_SOLID_SAND = register("gray_solid_sand",
            () -> new solidSandBlock(0x808080, GRAY_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_GRAY_SOLID_SAND = register("light_gray_solid_sand",
            () -> new solidSandBlock(0xd3d3d3, LIGHT_GRAY_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> CYAN_SOLID_SAND = register("cyan_solid_sand",
            () -> new solidSandBlock(0x00ffff, CYAN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> PURPLE_SOLID_SAND = register("purple_solid_sand",
            () -> new solidSandBlock(0x800080, PURPLE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLUE_SOLID_SAND = register("blue_solid_sand",
            () -> new solidSandBlock(0x0000ff, BLUE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> GREEN_SOLID_SAND = register("green_solid_sand",
            () -> new solidSandBlock(0x008000, GREEN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BROWN_SOLID_SAND = register("brown_solid_sand",
            () -> new solidSandBlock(0x714e32, BROWN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLACK_SOLID_SAND = register("black_solid_sand",
            () -> new solidSandBlock(0x000000, BLACK_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));

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