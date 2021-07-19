package net.landofrails;

import cam72cam.mod.ModCore;
import cam72cam.mod.ModEvent;
import cam72cam.mod.math.Vec3d;
import cam72cam.mod.render.BlockRender;
import cam72cam.mod.render.ItemRender;
import cam72cam.mod.resource.Identifier;
import friedrichlp.renderlib.model.ModelLoaderProperty;
import friedrichlp.renderlib.tracking.ModelInfo;
import friedrichlp.renderlib.tracking.ModelManager;
import friedrichlp.renderlib.tracking.RenderManager;
import net.landofrails.render.Layers;
import net.landofrails.render.ObjItemRender;
import net.landofrails.render.TestBlockRender;
import net.landofrails.tile.TestBlockTile;
import net.landofrails.utils.IdentifierFileContainer;
import net.landofrails.utils.RenderLibInit;

public class UMCWithRenderLib extends ModCore.Mod {

    public static final String MODID = "umcwithrenderlib";

    public static ModelInfo model;

    @Override
    public String modID() {
        return MODID;
    }

    @Override
    public void commonEvent(ModEvent event) {
        switch (event) {
            case CONSTRUCT:

                RenderLibInit.initRenderLib();

                ModBlocks.register();
                ModItems.register();

                Layers.register();

                RenderManager.update();
                break;
            case INITIALIZE:
                //Do config stuff here
                break;
            case SETUP:
                break;
            case FINALIZE:
                break;
            case START:
                break;
            case RELOAD:
                break;
        }
    }

    @Override
    public void clientEvent(ModEvent event) {
        switch (event) {
            case CONSTRUCT:
                model = ModelManager.registerModel(new IdentifierFileContainer(new Identifier(MODID, "models/block/bluetrashcan.obj")), new ModelLoaderProperty(0));
                RenderManager.update();
                //Block
                BlockRender.register(ModBlocks.TEST_BLOCK, TestBlockRender::render, TestBlockTile.class);
                //Item
                ItemRender.register(ModItems.ITEM_TESTBLOCK, ObjItemRender.getModelFor(new Identifier(MODID, "models/block/bluetrashcan.obj"), new Vec3d(0.5, 0, 0.5), 0.01f));
                break;
            case INITIALIZE:
                break;
            case SETUP:
                break;
            case FINALIZE:
                break;
            case START:
                break;
            case RELOAD:
                break;
        }
    }

    @Override
    public void serverEvent(ModEvent event) {
        switch (event) {
            case CONSTRUCT:
                break;
            case INITIALIZE:
                break;
            case SETUP:
                break;
            case FINALIZE:
                break;
            case START:
                break;
            case RELOAD:
                break;
        }
    }
}
