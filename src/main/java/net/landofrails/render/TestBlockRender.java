package net.landofrails.render;

import cam72cam.mod.render.GlobalRender;
import cam72cam.mod.render.StandardModel;
import friedrichlp.renderlib.library.RenderMode;
import friedrichlp.renderlib.math.TVector3;
import friedrichlp.renderlib.tracking.RenderManager;
import friedrichlp.renderlib.tracking.RenderObject;
import net.landofrails.UMCWithRenderLib;
import net.landofrails.tile.TestBlockTile;

public class TestBlockRender {
    public static StandardModel render(TestBlockTile ts) {
        return new StandardModel().addCustom(partialTicks -> renderStuff(ts, partialTicks));
    }

    private static RenderObject object;

    private static void renderStuff(TestBlockTile ts, float partialTicks) {
        try {
            if (object == null) {
                object = Layers.MAIN.addRenderObject(UMCWithRenderLib.model);
            }
            RenderManager.setCameraPos(TVector3.create((float) GlobalRender.getCameraPos(partialTicks).x, (float) GlobalRender.getCameraPos(partialTicks).y, (float) GlobalRender.getCameraPos(partialTicks).z));
            RenderManager.setRenderDistance(GlobalRender.getRenderDistance());

            object.transform.setScale(0.1f, 0.1f, 0.1f);

            RenderManager.render(Layers.MAIN, RenderMode.USE_CUSTOM_MATS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
