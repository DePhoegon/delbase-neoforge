package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.aid.slots.itemSlot;
import com.dephoegon.delbase.aid.slots.planSlots;
import com.dephoegon.delbase.aid.slots.resultSlots;
import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.block.entity.blocks.blockCuttingStation.*;
import static com.dephoegon.delbase.block.general.machineBlocks.BLOCK_CUTTING_STATION;
import static net.minecraftforge.common.capabilities.ForgeCapabilities.ITEM_HANDLER;

public class blockCuttingStationMenu extends AbstractContainerMenu {
    private final blockCuttingStation blockEntity;
    private final Level level;
    private final ContainerData data;
    public blockCuttingStationMenu(int pContainerId, Inventory inv, @NotNull FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }
    public blockCuttingStationMenu
            (int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), pContainerId);
        checkContainerSize(inv, blockCuttingStationSlotCount);
        blockEntity = ((blockCuttingStation) entity);
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(ITEM_HANDLER).ifPresent(handler -> {
            this.addSlot(new itemSlot(handler, inputSlot, 57, 18));
            this.addSlot(new planSlots(handler, planSlot, 103, 18));
            this.addSlot(new resultSlots(handler, outputSlot, 80, 60));

        });
        addDataSlots(data);
    }
    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressArrowSize = 26;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_ROW_COUNT =3;
    private static final int PLAYER_COLUMN_COUNT =HOTBAR_SLOT_COUNT;
    private static final int PLAYER_SLOT_COUNT = PLAYER_ROW_COUNT*PLAYER_COLUMN_COUNT;
    private static final int VANILLA_SLOT_COUNT = PLAYER_SLOT_COUNT+HOTBAR_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = blockCuttingStationSlotCount;

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        //noinspection ConstantConditions
        if (sourceSlot == null || !sourceSlot.hasItem()) {
            return ItemStack.EMPTY;
        }
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.ofFullCopy();

        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Delbase (BlockCuttingScreen) - Invalid SlotIndex: "+index);
            return ItemStack.EMPTY;
        }
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, BLOCK_CUTTING_STATION.get());
    }
    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }
    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i =0; i<9;++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }
}
