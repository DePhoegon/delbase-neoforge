package com.dephoegon.delbase.aid.slots;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class resultSlots extends SlotItemHandler {
    public resultSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }
    public boolean mayPlace(@NotNull ItemStack itemStack) { return false; }
    public int getMaxStackSize() { return 64; }
}
