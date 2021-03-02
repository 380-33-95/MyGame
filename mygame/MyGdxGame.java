package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.mycompany.draw.DrawBoolet;
import com.mycompany.draw.DrawBoom;
import com.mycompany.draw.DrawBossIgrok;
import com.mycompany.draw.DrawBossVrag;
import com.mycompany.draw.DrawEnd;
import com.mycompany.draw.DrawGame;
import com.mycompany.draw.DrawOblako;
import com.mycompany.draw.DrawPervijHod;
import com.mycompany.draw.DrawPole;
import com.mycompany.draw.DrawRamkaBoss;
import com.mycompany.draw.DrawSelectLevel;
import com.mycompany.draw.DrawSmenaHoda;
import com.mycompany.draw.DrawStart;
import com.mycompany.draw.DrawTarget;
import com.mycompany.draw.DrawTower;
import com.mycompany.draw.DrawTutorials;
import com.mycompany.draw.DrawZamokIgrok;
import com.mycompany.draw.DrawZamokVrag;
import com.mycompany.tower.TowerCanon;

import static com.mycompany.mygame.JustTouched.IfJustTouched;
import static com.mycompany.mygame.MyMusik.MapSound;
import static com.mycompany.tower.TowerCanon.getCatetX;
import static com.mycompany.tower.TowerCanon.getCatetY;
import static com.mycompany.tower.TowerCanon.getXtarget;
import static com.mycompany.tower.TowerCanon.getYtarget;


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

    private static int StatusMenu; //0-start; 1-select level; 2-game; 3- finish; 4 - tutorials;

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

    private static String NameLevel;

    public static String getNameLevel() {
        return NameLevel;
    }

    public static void setNameLevel(String nameLevel) {
        NameLevel = nameLevel;
    }

    ///////////////////////////

    public static Array<Rectangle> clouddrops;
    public static long lastDropTime;
    public static TextureRegion dropImage;

    ////////////////////////////


    private static boolean SmenaHoda; //true - igrok; false - vrag;

    public static boolean isSmenaHoda() {
        //System.out.println("isHod="+SmenaHoda);
        return SmenaHoda;
    }

    public static void setSmenaHoda(boolean smenaHoda) {
        SmenaHoda = smenaHoda;

    }

    ///////////////////////////////////////////////


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
///////////////////////
        dropImage = new TextureRegion(atlas, 703, 2903, 90, 90);

        clouddrops = new Array<Rectangle>();
        DrawOblako.spawnCloud();
////////////////////////////

    }

    ////////////////////////////
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

                MapSound.get(2).stop();
                MapSound.get(0).play();
                MapSound.get(0).setLooping(true);

                DrawStart.DrawRunStart();


                if (Gdx.input.justTouched()) {

                    IfJustTouched();

                }

                if (getNC() >= 30 && getNC() <= 32) {
                    setNC(0);
                    setStatusMenu(1);
                }

                if (getNC() >= 44 && getNC() <= 46) {
                    setNC(0);
                    setStatusMenu(4);
                }


                break;

            }


            case 1: {


                DrawSelectLevel.DrawRunSelectLevel();

                if (Gdx.input.justTouched()) {

                    IfJustTouched();

                }

                //level 1
                if (getNC() == 8 || getNC() == 9 ||
                        getNC() == 15 || getNC() == 16 ||
                        getNC() == 22 || getNC() == 23
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level1.txt");

                            LoadLevel.ReadFile(getNameLevel());

                    }

                //level 2
                if (getNC() == 11 || getNC() == 12 ||
                        getNC() == 18 || getNC() == 19 ||
                        getNC() == 25 || getNC() == 26
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level2.txt");

                        LoadLevel.ReadFile(getNameLevel());

                }


                //level 3
                if (getNC() == 36 || getNC() == 37 ||
                        getNC() == 43 || getNC() == 44 ||
                        getNC() == 50 || getNC() == 51
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level3.txt");

                        LoadLevel.ReadFile(getNameLevel());

                }

                //level 4
                if (getNC() == 39 || getNC() == 40 ||
                        getNC() == 46 || getNC() == 47 ||
                        getNC() == 53 || getNC() == 54
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level4.txt");

                   LoadLevel.ReadFile(getNameLevel());

                }


                //level 5
                if (getNC() == 64 || getNC() == 65 ||
                        getNC() == 71 || getNC() == 72 ||
                        getNC() == 77 || getNC() == 78
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level5.txt");

                        LoadLevel.ReadFile(getNameLevel());

                }


                //level 6
                if (getNC() == 67 || getNC() == 68 ||
                        getNC() == 74 || getNC() == 75 ||
                        getNC() == 83 || getNC() == 84
                ) {
                    ClearStart.NewStart();
                    setStatusMenu(2);
                    setNameLevel("level6.txt");

                        LoadLevel.ReadFile(getNameLevel());

                }

                break;
            }


            case 2: {

                MapSound.get(0).stop();

                MapSound.get(2).play();
                MapSound.get(2).setVolume(0.10f);
                MapSound.get(2).setLooping(true);

                DrawGame.DrGame();

                DrawBossVrag.BossVrag();

                DrawBossIgrok.BossIgrok();

                //TODO DRAW TOWER

              DrawTower.StartDrawTowerI((float) TowerCanon.getUgolSinI());

              DrawTower.StartDrawTowerV((float) TowerCanon.getUgolSinV());


                ///////////////

                DrawRamkaBoss.RamkaStartBoss();

                DrawZamokVrag.ZamokStartVrag();

                DrawZamokIgrok.ZamokStartIgrok();

                DrawPole.DrawStartPole();

                DrawBoom.DrawCiclBoom();

                DrawSmenaHoda.StartDrawSmenaHoda();

                DrawOblako.StartDrawOblako();


                if (GameFirstHod.myTimerTask.isScheduled()) {
                    DrawPervijHod.PervijStartHod();
                }

                DrawBoolet.StartDrawBulet();

                //TODO ramka target
                DrawTarget.StartTarget(getXtarget(),getYtarget());


                if (Gdx.input.justTouched()) {

                    ClickSelector.TouchPressed(IfJustTouched());

                    GameInfo.InfoKletka();
                }

                break;
            }

            case 3: {

                MapSound.get(1).stop();
                MapSound.get(2).play();
                MapSound.get(2).setLooping(true);

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

            case 4: {
                DrawTutorials.StartDrawTutorials();

                if (Gdx.input.justTouched()) {

                    IfJustTouched();

                }

                if (getNC() >= 72 && getNC() <= 74) {
                    setNC(0);
                    setStatusMenu(0);
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

        //    ClearStart.NewStart();
        Gdx.app.exit();

    }


    @Override
    public void dispose() {

        batch.dispose();
        atlas.dispose();

    }


}
