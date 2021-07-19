package net.landofrails.tile;

import cam72cam.mod.block.BlockEntity;
import cam72cam.mod.item.ItemStack;
import net.landofrails.ModItems;

public class TestBlockTile extends BlockEntity {

    public TestBlockTile() {
    }

    @Override
    public ItemStack onPick() {
        return new ItemStack(ModItems.ITEM_TESTBLOCK, 1);
    }

    @Override
    public void onBreak() {
        super.onBreak();
    }
}
