package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.block.entity.menuTypes;
import com.dephoegon.delbase.block.entity.modBlockEntities;
import net.neoforged.bus.api.IEventBus;

public class regList {
    public static void firstList(IEventBus eventBus) {
        // aid, set blockArray

        // Blocks needing to be registered before the rest of the mod blocks
        // Mod Centric

        // Sand

        // Sandstone

        // Stripped Wood

    }
    public static void listOrder(IEventBus eventBus) {
        // Items

        // Pillars

        // Gravity Blocks, Sands

        // Slabs

        // Stairs

        // Walls

        // Fences

        // Special blocks
        modBlockEntities.registerBlockEntities(eventBus);

        // Special
        menuTypes.registerMenus(eventBus);
        // recipes ->
    }

}