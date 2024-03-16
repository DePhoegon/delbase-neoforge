package com.dephoegon.delbase.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.delbase.MODID;

public class blockCutterPlans {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> WALL_PLANS = register("wall_plans", 1);
    public static final DeferredItem<Item> SLAB_PLANS = register("slab_plans", 1);
    public static final DeferredItem<Item> FENCE_PLANS = register("fence_plans", 1);
    public static final DeferredItem<Item> FENCE_GATE_PLANS = register("fence_gate_plans", 1);
    public static final DeferredItem<Item> STAIR_PLANS = register("stair_plans", 1);
    public static final DeferredItem<Item> ARMOR_COMPOUND = register("armor_compound", 64);

    private static @NotNull DeferredItem<Item> register(String name, int stack) { return ITEMS.register(name, () -> new Item(new Item.Properties().stacksTo(stack))); }
    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}