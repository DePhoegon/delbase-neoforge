package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.slots.planSlots.isPlansSlotItem;

public class itemSlot extends SlotItemHandler {
    public itemSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }
    public boolean mayPlace(@NotNull ItemStack itemStack) { return !isPlansSlotItem(itemStack.getItem()); }
}