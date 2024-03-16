package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class planSlots extends SlotItemHandler {

    public planSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    private static @NotNull ArrayList<Item> setPlansOnlyArray(){
        ArrayList<Item> tempArray = new ArrayList<>();
        tempArray.add(WALL_PLANS.get().asItem());
        tempArray.add(FENCE_PLANS.get().asItem());
        tempArray.add(FENCE_GATE_PLANS.get().asItem());
        tempArray.add(SLAB_PLANS.get().asItem());
        tempArray.add(STAIR_PLANS.get().asItem());
        return tempArray;
    }

    @Contract("_ -> param1")
    private static @NotNull ArrayList<Item> setFullArray(@NotNull ArrayList<Item> list) {
        list.add(ARMOR_COMPOUND.get().asItem());
        return list;
    }
    public static @NotNull ArrayList<Item> getFullPlanSlotArray() {
        return setFullArray(setPlansOnlyArray());
    }
    public static boolean isPlansSlotItem(Item item) {
        return getFullPlanSlotArray().contains(item);
    }
    @Override
    public boolean mayPlace(@NotNull ItemStack itemStack) {
        return isPlansSlotItem(itemStack.getItem());
    }
    @Override
    public int getMaxStackSize() {
        return 64;
    }
}
