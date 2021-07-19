package net.landofrails.items;

import cam72cam.mod.entity.Player;
import cam72cam.mod.item.ClickResult;
import cam72cam.mod.item.CreativeTab;
import cam72cam.mod.item.CustomItem;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.math.Vec3i;
import cam72cam.mod.util.Facing;
import cam72cam.mod.world.World;
import net.landofrails.ModBlocks;
import net.landofrails.ModTabs;
import net.landofrails.utils.BlockUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TestBlockItem extends CustomItem {
    public TestBlockItem(String modid, String name) {
        super(modid, name);
    }

    @Override
    public List<CreativeTab> getCreativeTabs() {
        return Collections.singletonList(ModTabs.TEST_TAB);
    }

    @Override
    public ClickResult onClickBlock(Player player, World world, Vec3i pos, Player.Hand hand, Facing facing, Vec3d inBlockPos) {
        Optional<Vec3i> target = BlockUtils.canPlaceBlock(world, pos, facing, player);
        if (!target.isPresent()) return ClickResult.REJECTED;

        world.setBlock(target.get(), ModBlocks.TEST_BLOCK);
        return ClickResult.ACCEPTED;
    }
}
