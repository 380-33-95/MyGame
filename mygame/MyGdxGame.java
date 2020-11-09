package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mycompany.draw.DrawBoolet;
import com.mycompany.draw.DrawBoom;
import com.mycompany.draw.DrawBossIgrok;
import com.mycompany.draw.DrawBossVrag;
import com.mycompany.draw.DrawEnd;
import com.mycompany.draw.DrawGame;
import com.mycompany.draw.DrawPervijHod;
import com.mycompany.draw.DrawPole;
import com.mycompany.draw.DrawRamkaBoss;
import com.mycompany.draw.DrawStart;
import com.mycompany.draw.DrawZamokIgrok;
import com.mycompany.draw.DrawZamokVrag;
import com.mycompany.draw.LoadLevel;
import com.mycompany.mygame.Menu.Buttons;
import com.mycompany.mygame.Menu.Menu;

import java.io.FileReader;

import static com.mycompany.mygame.JustTouched.IfJustTouched;


public class MyGdxGame extends Blok implements ApplicationListener {

    public static OrthographicCamera camera;
    public static SpriteBatch batch;


    public static Texture atlas;

    public static BitmapFont TextLog;


    static int TouchX2;
    static int TouchY2;


    protected final static int HEIGHT = 1200;
    protected final static int WIDTH = 700;


    public static int getStatusMenu() {
        return StatusMenu;
    }

    public static void setStatusMenu(int statusMenu) {
        StatusMenu = statusMenu;
    }

    private static int StatusMenu; //0-start; 1-game; 2- finish;

    public static int getNC() {
        return NC;
    }

    public static void setNC(int nc) {
        NC = nc;
    }

    private static int NC;

    static Vector3 Touch = new Vector3();

    public static int shirKnopki = (WIDTH / 7) * 3;
    public static int visKnopki = (HEIGHT / 12);

    public static String textString;

    public Menu menu;

    Buttons buttons;

    Texture bgImage;

    FileReader fileReader;


    static {  //////////////initialisation

        Test.TestTest();
        setStatusMenu(0);

        TouchX2 = 0;
        TouchY2 = 0;


    }


    @Override
    public void create() {

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);

        batch = new SpriteBatch();
        atlas = new Texture("atlas.png");

        textString = Gdx.files.internal("level1.txt").readString();

    }

    private void createBackground() {
        bgImage = new Texture("background.jpg");

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        batch.setProjectionMatrix(camera.combined);


        batch.begin();


        switch (getStatusMenu()) {

            case 0: {


                DrawStart.DrawRunStart();

                if (Gdx.input.justTouched()) {

                    IfJustTouched();

                }

                if (getNC() >= 30 && getNC() <= 32) {
                    setNC(0);
                    ClearStart.NewStart();

                    setStatusMenu(1);
                }

                if (getNC() >= 51 && getNC() <= 53) {

                    ///////
                    setNC(100);
                    LoadLevel.ReadFile(textString);
                    ///////

                }
                break;


            }

            case 1: {

                DrawGame.DrGame();

                DrawBossVrag.BossVrag();

                DrawBossIgrok.BossIgrok();

                DrawRamkaBoss.RamkaStartBoss();

                DrawZamokVrag.ZamokStartVrag();

                DrawZamokIgrok.ZamokStartIgrok();

                DrawPole.DrawStartPole();

                DrawBoom.DrawCiclBoom();


                if (GameFirstHod.myTimerTask.isScheduled()) {
                    DrawPervijHod.PervijStartHod();
                }

                //////////////////////////////////////////////////////
                DrawBoolet.StartDrawBulet();
                ////////////////////////////////////////////////////////////////////////////

                if (Gdx.input.justTouched()) {

                    ClickSelector.TouchPressed(

                            IfJustTouched()
                    );

                    GameInfo.InfoKletka();
                }

                break;
            }

            case 2: {
                if (!GameEnd.pausaEnd.isScheduled()) {

                    //TODO smena sastavki
                    DrawEnd.DrawEndGame();
                }
                if (!GameEnd.noviStart.isScheduled()) {
                    if (getNC() > 0) {
                        setStatusMenu(0);
                    }
                }
                break;
            }

        }


        batch.end();


    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }


    @Override
    public void dispose() {

        batch.dispose();
        atlas.dispose();


    }


}
