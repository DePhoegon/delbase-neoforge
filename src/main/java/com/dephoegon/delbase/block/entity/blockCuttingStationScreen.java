package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.block.entity.blocks.blockCuttingStation;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.slots.planSlots.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static com.dephoegon.delbase.item.blockCutterPlans.*;

public class blockCuttingStationScreen extends AbstractContainerScreen<blockCuttingStationMenu> {
    private static final ResourceLocation EMPTY_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_empty.png");
    private static final ResourceLocation COMPOUND_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_compound.png");
    private static final ResourceLocation PLANS_WALL_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_wall.png");
    private static final ResourceLocation PLANS_SLAB_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_slab.png");
    private static final ResourceLocation PLANS_STAIR_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_stair.png");
    private static final ResourceLocation PLANS_FENCE_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_fence.png");
    private static final ResourceLocation PLANS_FENCE_GATE_TEXTURE =
            new ResourceLocation(Mod_ID, "textures/gui/block_cutting_station_gui_fence_gate.png");
    public blockCuttingStationScreen(blockCuttingStationMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(@NotNull GuiGraphics pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        //Item item = blockCuttingStation.iHandler.getStackInSlot(planSlot).getItem();
        Item item = blockCuttingStation.getPlanSlotItem();
        ResourceLocation TEXTURE = null;
        if (isPlansSlotItem(item)) {
                if (item == WALL_PLANS.get().asItem()) { TEXTURE = PLANS_WALL_TEXTURE; }
                if (item == FENCE_GATE_PLANS.get().asItem()) { TEXTURE = PLANS_FENCE_GATE_TEXTURE; }
                if (item == FENCE_PLANS.get().asItem()) { TEXTURE = PLANS_FENCE_TEXTURE; }
                if (item == SLAB_PLANS.get().asItem()) { TEXTURE = PLANS_SLAB_TEXTURE; }
                if (item == STAIR_PLANS.get().asItem()) { TEXTURE = PLANS_STAIR_TEXTURE; }
                if (item == ARMOR_COMPOUND.get().asItem()) { TEXTURE = COMPOUND_TEXTURE; }
        } else {
            //RenderSystem.setShaderTexture(0, EMPTY_TEXTURE);
            TEXTURE = EMPTY_TEXTURE;
        }
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        TEXTURE = TEXTURE != null ? TEXTURE : EMPTY_TEXTURE;
        pPoseStack.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
        if (menu.isCrafting()) {
            pPoseStack.blit(TEXTURE, x+102, y+41, 176, 0,8, menu.getScaledProgress());
        }
    }
    @Override
    public void render(@NotNull GuiGraphics pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
