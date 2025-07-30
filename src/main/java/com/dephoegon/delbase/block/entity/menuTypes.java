package com.dephoegon.delbase.block.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static com.dephoegon.delbase.Delabse.Mod_ID;

public class menuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, Mod_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<blockCuttingStationMenu>> BLOCK_CUTTING_STATION_MENU =
            MENUS.register("block_cutting_station_menu",
                    () -> new MenuType<>((IContainerFactory<blockCuttingStationMenu>) blockCuttingStationMenu::new)
            );

    public static void registerBlock(IEventBus eventBus) { MENUS.register(eventBus); }
}
