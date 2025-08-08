package com.dephoegon.delbase.block.entity.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.slots.planSlots.isPlansSlotItem;
import static com.dephoegon.delbase.item.blockCutterPlans.*;
import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;

public class blockCutterScreen extends AbstractContainerScreen<blockCuttingMenu> {
    private static final ResourceLocation EMPTY_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_empty.png");
    private static final ResourceLocation COMPOUND_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_compound.png");
    private static final ResourceLocation PLANS_WALL_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_wall.png");
    private static final ResourceLocation PLANS_SLAB_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_slab.png");
    private static final ResourceLocation PLANS_STAIR_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_stair.png");
    private static final ResourceLocation PLANS_FENCE_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_fence.png");
    private static final ResourceLocation PLANS_FENCE_GATE_TEXTURE =
            fromNamespaceAndPath(Mod_ID, "textures/gui/block_cutting_station_gui_fence_gate.png");

    public blockCutterScreen(blockCuttingMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }

    @Override
    protected void renderBg(@NotNull GuiGraphics pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);

        // Get the item from the specific block entity instance through the menu
        Item item = menu.getBlockEntity().getPlanSlotItem().getItem();

        ResourceLocation TEXTURE = EMPTY_TEXTURE;
        if (isPlansSlotItem(item, minecraft != null ? minecraft.level : null)) {
            if (item == WALL_PLANS.get().asItem()) { TEXTURE = PLANS_WALL_TEXTURE; }
            if (item == FENCE_GATE_PLANS.get().asItem()) { TEXTURE = PLANS_FENCE_GATE_TEXTURE; }
            if (item == FENCE_PLANS.get().asItem()) { TEXTURE = PLANS_FENCE_TEXTURE; }
            if (item == SLAB_PLANS.get().asItem()) { TEXTURE = PLANS_SLAB_TEXTURE; }
            if (item == STAIR_PLANS.get().asItem()) { TEXTURE = PLANS_STAIR_TEXTURE; }
            if (item == ARMOR_COMPOUND.get().asItem()) { TEXTURE = COMPOUND_TEXTURE; }
        } // default texture is EMPTY_TEXTURE
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        pPoseStack.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
        if (menu.isCrafting()) { pPoseStack.blit(TEXTURE, x+102, y+41, 176, 0,8, menu.getScaledProgress()); }
    }
    @Override
    public void render(@NotNull GuiGraphics pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack, mouseX, mouseY, delta);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }
}
