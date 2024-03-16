package com.dephoegon.delbase.item;

import com.dephoegon.delbase.aid.block.item.blockDye;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.MODID;

public class shiftingDyes {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> CLEANSE_SHIFT_DYE = register("cleanse_shift_dye", DyeColor.WHITE);
    public static final DeferredItem<Item> RED_SHIFT_DYE = register("red_shift_dye", DyeColor.RED);
    public static final DeferredItem<Item> BLOOD_SHIFT_DYE = register("blood_shift_dye", DyeColor.RED);
    public static final DeferredItem<Item> WHITE_SHIFT_DYE = register("white_shift_dye", DyeColor.WHITE);
    public static final DeferredItem<Item> ORANGE_SHIFT_DYE = register("orange_shift_dye", DyeColor.ORANGE);
    public static final DeferredItem<Item> MAGENTA_SHIFT_DYE = register("magenta_shift_dye", DyeColor.MAGENTA);
    public static final DeferredItem<Item> LIGHT_BLUE_SHIFT_DYE = register("light_blue_shift_dye", DyeColor.LIGHT_BLUE);
    public static final DeferredItem<Item> YELLOW_SHIFT_DYE = register("yellow_shift_dye", DyeColor.YELLOW);
    public static final DeferredItem<Item> LIME_SHIFT_DYE = register("lime_shift_dye", DyeColor.LIME);
    public static final DeferredItem<Item> PINK_SHIFT_DYE = register("pink_shift_dye", DyeColor.PINK);
    public static final DeferredItem<Item> GRAY_SHIFT_DYE = register("gray_shift_dye", DyeColor.GRAY);
    public static final DeferredItem<Item> LIGHT_GRAY_SHIFT_DYE = register("light_gray_shift_dye", DyeColor.LIGHT_GRAY);
    public static final DeferredItem<Item> CYAN_SHIFT_DYE = register("cyan_shift_dye", DyeColor.CYAN);
    public static final DeferredItem<Item> PURPLE_SHIFT_DYE = register("purple_shift_dye", DyeColor.PURPLE);
    public static final DeferredItem<Item> BLUE_SHIFT_DYE = register("purple_shift_dye", DyeColor.BLUE);
    public static final DeferredItem<Item> GREEN_SHIFT_DYE = register("green_shift_dye", DyeColor.GREEN);
    public static final DeferredItem<Item> BROWN_SHIFT_DYE = register("brown_shift_dye", DyeColor.BROWN);
    public static final DeferredItem<Item> BLACK_SHIFT_DYE = register("black_shift_dye", DyeColor.BLACK);

    private static @NotNull DeferredItem<Item> register(String name, DyeColor color) {
        return ITEMS.register(name, () -> new blockDye(color, new Item.Properties().stacksTo(64),
                "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    }
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}