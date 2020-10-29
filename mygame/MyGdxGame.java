package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;
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

import static com.mycompany.mygame.JustTouched.IfJustTouched;


public class MyGdxGame extends Blok implements ApplicationListener {

    public static OrthographicCamera camera;
    public static SpriteBatch batch;


    public static Texture atlas;

    public static BitmapFont TextLog;

    private static String Log;

    public static void setLog(String str) {
        Log = "" + str;
    }

    public static String getLog() {
        return Log;
    }

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

    private static int NextBlok;

    public static int getNextBlok() {
        return NextBlok;
    }

    public static void setNextBlok(int nextBlok) {
        NextBlok = nextBlok;
    }


    public static int massivBulet[][] = new int[83][2];

    public static int ciclMassivBulet = -1;

    public static boolean isVistrel() {
        return vistrel;
    }

    public static void setVistrel(boolean vistrel) {
        MyGdxGame.vistrel = vistrel;
    }

    private static boolean vistrel;

    public static boolean isScanerBulet() {
        return ScanerBulet;
    }

    public static void setScanerBulet(boolean scanerBulet) {
        ScanerBulet = scanerBulet;
    }

    private static boolean ScanerBulet;

    public static int ciclScaner;


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


                if (isScanerBulet()) {

                    ciclScaner = -1;
                    System.out.println("2");

                    for (int ib = 7; ib <= 76; ib++) {

                        if (BlokList.get(ib).getStorona() == 1 && BlokList.get(ib).isFlagBulet()) {
                            ciclScaner++;
                            massivBulet[ciclScaner][0] = BlokList.get(ib).getX();
                            massivBulet[ciclScaner][1] = BlokList.get(ib).getY();
                            BlokList.get(ib).setFlagBulet(false);

                            setVistrel(true);
                            System.out.println(ciclScaner + " [0]=" + massivBulet[ciclScaner][0] + " [1]=" + massivBulet[ciclScaner][1]);
                        }
                        ciclMassivBulet = ciclScaner;
                    }
                    setScanerBulet(false);
                }

                //  System.out.println(isVistrel());

                if (isVistrel()) {

                    if (ciclMassivBulet > -1 && ciclMassivBulet < 77) {

                        massivBulet[ciclMassivBulet][1] = (int) (massivBulet[ciclMassivBulet][1] + (50 + Gdx.graphics.getDeltaTime()));
                        TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
                        batch.draw(BooletV,
                                massivBulet[ciclMassivBulet][0],
                                massivBulet[ciclMassivBulet][1],
                                1,
                                1,
                                WIDTH / 7,
                                HEIGHT / 12,
                                1,
                                1,
                                0
                        );
                        System.out.println("y=" + massivBulet[ciclMassivBulet][1]);
                        if (massivBulet[ciclMassivBulet][1] >= 1000) {
                            ciclMassivBulet--;
                            System.out.println("->" + ciclMassivBulet);
                        }
                    }


                    if (ciclMassivBulet < 0) {
                        System.out.println("->");
                        setVistrel(false);
                    }
                }


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
