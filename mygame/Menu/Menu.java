package com.mycompany.mygame.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mycompany.mygame.MyGdxGame;

/**
 * Created by Catfish on 10.10.2016.
 */

public class Menu implements Screen {

    final MyGdxGame game;
    OrthographicCamera camera;
    SpriteBatch batch;
    BitmapFont font;
    Texture bgImage;
    Buttons buttons;


    public Menu(final MyGdxGame myGdxGame) {
        game = myGdxGame;

        batch = new SpriteBatch();
        font = new BitmapFont();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        createBackground();
        buttons = new Buttons(game);
        Gdx.input.setInputProcessor(buttons);
    }

    private void createBackground() {
        bgImage = new Texture("background.jpg");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(bgImage, 0, 0);
        font.draw(batch, "Welcome to Assassin's creed!", 100, 450);
        font.draw(batch, "On stage, press ESCAPE to return to the menu", 100, 425);
        batch.end();

        buttons.draw();
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
    public void hide() {
    }

    @Override
    public void dispose() {
        font.dispose();
        batch.dispose();
        bgImage.dispose();
    }
}
