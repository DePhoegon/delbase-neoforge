package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.item.compoundPlans;
import com.dephoegon.delbase.aid.block.item.cutterPlans;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("SameParameterValue")
public class blockCutterPlans {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Delbase.Mod_ID);

    public static final DeferredItem<Item> WALL_PLANS = regPlans("wall_plans", 1);
    public static final DeferredItem<Item> SLAB_PLANS = regPlans("slab_plans", 1);
    public static final DeferredItem<Item> FENCE_PLANS = regPlans("fence_plans", 1);
    public static final DeferredItem<Item> FENCE_GATE_PLANS = regPlans("fence_gate_plans", 1);
    public static final DeferredItem<Item> STAIR_PLANS = regPlans("stair_plans", 1);
    public static final DeferredItem<Item> ARMOR_COMPOUND = regCompound("armor_compound", 64);

    private static @NotNull DeferredItem<Item> regPlans(String name, int stack) { return ITEMS.register(name, () -> new cutterPlans(new Item.Properties().stacksTo(stack))); }
    private static @NotNull DeferredItem<Item> regCompound(String name, int stack) { return ITEMS.register(name, () -> new compoundPlans(new Item.Properties().stacksTo(stack))); }

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}