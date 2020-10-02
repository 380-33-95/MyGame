package draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.Dvigatel;
import com.mycompany.mygame.MyGdxGame;

public class DrawPole extends MyGdxGame {

    static int color;

    private static long CurrentTime;

    public static void setCurrentTime(long ct) {
        CurrentTime = ct;
    }

    public static long getCurrentTime() {
        return CurrentTime;
    }


    public static void DrawStartPole() {


        for (int pp = 7; pp <= 76; pp++) {

            if (BlokList.get(pp).getIndex() > 0) {

                if (BlokList.get(pp).getStorona() == 1) {
                    if (BlokList.get(pp).getHealth() <= 0) {
                        color = 0;
                    } else {
                        color = 100;
                    }
                }


                if (BlokList.get(pp).getStorona() == 2) {
                    if (BlokList.get(pp).getHealth() <= 0) {
                        color = 1000;
                    } else {
                        color = 1100;
                    }
                }

                //idex
                TextureRegion PoleIndex = new TextureRegion(atlas, BlokList.get(pp).getIndex() * 100, color, 100, 100);
                batch.draw(PoleIndex, BlokList.get(pp).getX(), BlokList.get(pp).getY(), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);

                //sila
                TextureRegion PoleForse = new TextureRegion(atlas, 1000 + ((BlokList.get(pp).getForse()) * 100), 2700, 100, 100);
                batch.draw(PoleForse, BlokList.get(pp).getX() + 10, BlokList.get(pp).getY(), 1, 1, 30, 30, 1, 1, 0);

                //sdorov
                TextureRegion PoleHealth = new TextureRegion(atlas, ((BlokList.get(pp).getHealth()) * 100), 2700, 100, 100);
                batch.draw(PoleHealth, BlokList.get(pp).getX() + 60, BlokList.get(pp).getY(), 1, 1, 30, 30, 1, 1, 0);


                /////////////bulet
                //    CurrentTime = com.badlogic.gdx.utils.TimeUtils.millis();

                MyGdxGame.setLog("" + BlokList.get(pp).isBulet());

                if (BlokList.get(pp).isBulet()) {

                    MyGdxGame.setLog("bulet render");


                    TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
                    batch.draw(BooletV,
                            BlokList.get(pp).getX(),
                            BlokList.get(pp).getBooletY(),
                            1,
                            1,
                            WIDTH / 7,
                            HEIGHT / 12,
                            1,
                            1,
                            0);


                    while (BlokList.get(pp).getTimeBoolet() > com.badlogic.gdx.utils.TimeUtils.millis()) {

                        Gdx.app.log("* delta=", "" + (BlokList.get(pp).getTimeBoolet() - com.badlogic.gdx.utils.TimeUtils.millis()));

                    }


                    BlokList.get(pp).setBooletY(BlokList.get(Dvigatel.startV).getBooletY() - 100);
                    Gdx.app.log("* bulet y=", "" + BlokList.get(pp).getBooletY());


                    BlokList.get(pp).setTimeBoolet(com.badlogic.gdx.utils.TimeUtils.millis() + 1000);
                    Gdx.app.log("* BlokCurrentTime=", "" + BlokList.get(pp).getTimeBoolet());

                }


            }
        }
    }

    public static void InitialisationCoordinatPole() {

        for (int kp = 7; kp <= 76; kp++) {

            int x, y;
            y = ((kp - 7) / 7) % 10;
            x = (kp - 7) - (y * 7);

            BlokList.get(kp).setX(x * (WIDTH / 7));
            BlokList.get(kp).setY(HEIGHT - (y * (HEIGHT / 12) + (HEIGHT / 12) * 2));

            BlokList.get(kp).setXl(x * (WIDTH / 7));
            BlokList.get(kp).setYl(HEIGHT - (y * (HEIGHT / 12) + (HEIGHT / 12) * 2));

        }
    }


    public static void DrawCiclBoolet(int nc) {

        CurrentTime = com.badlogic.gdx.utils.TimeUtils.millis();
        Gdx.app.log("4) current time Blok", "" + BlokList.get(nc).getTimeBoolet());
        Gdx.app.log("4) current time     ", "" + CurrentTime);

        Gdx.app.log("5) delta time       ", "" + (BlokList.get(nc).getTimeBoolet() - CurrentTime));

        if (CurrentTime <= BlokList.get(nc).getTimeBoolet()) {

            Gdx.app.log("render", "" + BlokList.get(nc).getBooletY());

            TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
            batch.draw(BooletV,
                    0,
                    1000,
                    1,
                    1,
                    WIDTH / 7,
                    HEIGHT / 12,
                    1,
                    1,
                    0);

            //	Gdx.app.log("ink", "" + ink);
        }

    }


}
