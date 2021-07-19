package net.landofrails;

import cam72cam.mod.item.CreativeTab;
import cam72cam.mod.item.ItemStack;

public class ModTabs {
    private ModTabs() {
    }

    public static final CreativeTab TEST_TAB;

    static {
        TEST_TAB = new CreativeTab(UMCWithRenderLib.MODID + ".test", () -> new ItemStack(ModItems.ITEM_TESTBLOCK, 1));
    }
}
