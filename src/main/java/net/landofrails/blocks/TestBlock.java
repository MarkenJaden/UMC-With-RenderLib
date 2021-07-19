package net.landofrails.blocks;

import cam72cam.mod.block.BlockEntity;
import cam72cam.mod.block.BlockTypeEntity;
import net.landofrails.tile.TestBlockTile;

public class TestBlock extends BlockTypeEntity {

    public TestBlock(String modID, String name) {
        super(modID, name);
    }

    @Override
    protected BlockEntity constructBlockEntity() {
        return new TestBlockTile();
    }
}
