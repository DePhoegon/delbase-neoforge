package com.dephoegon.delbase.aid.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.neoforged.neoforge.common.util.Lazy;
import org.lwjgl.glfw.GLFW;

import static com.dephoegon.delbase.aid.event.KeyBindManager.tooltipCtrl;
import static com.dephoegon.delbase.aid.event.KeyBindManager.tooltipShift;
import static com.mojang.blaze3d.platform.InputConstants.isKeyDown;

public class kb {
    private static boolean LShift() { return isKB_KeyBindDown(tooltipShift); }
    private static boolean RShift() { return keyCheck(GLFW.GLFW_KEY_RIGHT_SHIFT); }
    private static boolean LCtrl() { return isKB_KeyBindDown(tooltipCtrl); }
    private static boolean RCtrl() { return keyCheck(GLFW.GLFW_KEY_RIGHT_CONTROL); }
    public static boolean HShift() { return isKeyBindDefault(tooltipShift) ? LShift() || RShift() : LShift(); }
    public static boolean HCtrl() { return isKeyBindDefault(tooltipCtrl) ? LCtrl() || RCtrl() : LCtrl(); }

    public static boolean isKB_KeyBindDown(Lazy<KeyMapping> mapping) {
        if (mapping == null) { return false; }
        InputConstants.Key key = mapping.get().getKey();
        int Keycode = key.getValue();
        return keyCheck(key.getType(), Keycode);
    }
    private static boolean keyCheck(int Keycode) { return keyCheck(InputConstants.Type.KEYSYM, Keycode); }
    public static boolean keyCheck(InputConstants.Type type, int Keycode) {
        if (type != InputConstants.Type.KEYSYM) { return false; }
        return isKeyDown(Minecraft.getInstance().getWindow().getWindow(), Keycode);
    }
    public static boolean isKeyBindDefault(Lazy<KeyMapping> mapping) {
        if (mapping != null) { return mapping.get().isDefault(); }
        return false;
    }
}