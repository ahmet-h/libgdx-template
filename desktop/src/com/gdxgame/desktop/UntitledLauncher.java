package com.gdxgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdxgame.GdxGame;

public class UntitledLauncher {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Untitled Game";
        cfg.width = 800;
        cfg.height = 480;
        cfg.resizable = false;
//        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
//        cfg.width = screenDimension.width;
//        cfg.height = screenDimension.height;
//        cfg.fullscreen = true;
//        cfg.vSyncEnabled = true;
//        cfg.useGL30 = true;
        new LwjglApplication(new GdxGame(), cfg);
    }

}
