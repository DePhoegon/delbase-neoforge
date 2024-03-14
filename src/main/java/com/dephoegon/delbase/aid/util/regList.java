package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.block.general.ash;
import com.dephoegon.delbase.block.general.misc;
import net.neoforged.bus.api.IEventBus;

public class regList {
    public static void firstList(IEventBus eventBus) {
        // Aid

        // Special Blocks
        misc.register(eventBus);
        // Sand

        // SandStone

        // Stripped Woods

    }
    public static void listOrder(IEventBus eventBus) {
        //Items

        //Pillars

        //Standard Blocks

        //Gravity Blocks

        //Slabs

        //Stairs

        //Walls

        //Fences

        // Specials
        ash.register(eventBus);

        //Special

    }
}
