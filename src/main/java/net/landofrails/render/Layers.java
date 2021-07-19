package net.landofrails.render;

import friedrichlp.renderlib.render.ViewBoxes;
import friedrichlp.renderlib.tracking.RenderLayer;
import friedrichlp.renderlib.tracking.RenderManager;

public class Layers {
    public static RenderLayer MAIN = RenderManager.addRenderLayer(ViewBoxes.ALWAYS);

    public static void register() {
        
    }
}
