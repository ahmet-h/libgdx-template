package com.gdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.GL20;

public class GdxGame implements ApplicationListener {

    public static final float DELTA = 1f / 60;

    private float accumulator = 0;

    @Override
    public void create() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
    }

    @Override
    public void render() {
        accumulator += Gdx.graphics.getRawDeltaTime();

        while(accumulator >= DELTA) {
            update();
            accumulator -= DELTA;
        }

        final float alpha = accumulator / DELTA;
        draw(alpha);
    }

    private void update() {

    }

    private void draw(float alpha) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    private class InputHandler extends InputAdapter {
        @Override
        public boolean touchDown(int deviceX, int deviceY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchUp(int deviceX, int deviceY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchDragged(int deviceX, int deviceY, int pointer) {
            return false;
        }
    }

}
