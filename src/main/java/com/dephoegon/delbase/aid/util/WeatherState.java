package com.dephoegon.delbase.aid.util;

import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public enum WeatherState implements StringRepresentable {
    UNAFFECTED("unaffected", 0),
    EXPOSED("exposed",1),
    WEATHERED("weathered", 2),
    OXIDIZED("oxidized", 3);

    public static final Codec<WeatherState> CODEC = StringRepresentable.fromEnum(WeatherState::values);
    private final String name;
    private final int order;

    WeatherState(String oxidizedName, int oxidizationOrder) {
        this.name = oxidizedName;
        this.order = oxidizationOrder;
    }

    public @NotNull String getSerializedName() { return this.name; }
    public int getOrder() { return this.order; }

    public static WeatherState getStateByOrder(int order) {
        return Arrays.stream(values())
                .filter(state -> state.order == order)
                .findFirst()
                .orElse(UNAFFECTED);
    }
}