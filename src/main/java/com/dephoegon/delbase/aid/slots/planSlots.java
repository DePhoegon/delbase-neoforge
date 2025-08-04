package com.dephoegon.delbase.aid.slots;

import com.dephoegon.delbase.aid.block.item.compoundPlans;
import com.dephoegon.delbase.aid.block.item.cutterPlans;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class planSlots extends SlotItemHandler {

    public planSlots(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }
    public static boolean isPlansSlotItem(Item item) { return item instanceof cutterPlans || item instanceof compoundPlans; }
    /**
     * Intended to only be used for checking if an item is a plans item, excluding Compounds used in the planSlots.
     * @return true if the item is a plans item, false otherwise.
     */
    public static boolean isPlansItem(Item item) { return item instanceof cutterPlans; }
    public boolean mayPlace(@NotNull ItemStack itemStack) { return isPlansSlotItem(itemStack.getItem()); }
    public int getMaxStackSize() { return 64; }
}
