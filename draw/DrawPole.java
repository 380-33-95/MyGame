package draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.Dvigatel;
import com.mycompany.mygame.MyGdxGame;

public class DrawPole extends MyGdxGame {

    static int color;

    static long CurrentTimeBoolet;

    public static void DrawStartPole() {


        for (int pp = 7; pp <= 76; pp++) {

            if (BlokList.get(pp).getIndex() > 0)

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

            if (CurrentTimeBoolet <= Dvigatel.getTimeBoolet() && BlokList.get(pp).getForse() > 0) {
                TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
                batch.draw(BooletV,
                        BlokList.get(pp).getX(),
                        BlokList.get(pp).getY(),
                        1,
                        1,
                        WIDTH / 7,
                        HEIGHT / 12,
                        1,
                        1,
                        0);
            }
        }


    }


    public static void DrawCiclBoolet(int nc) {

        CurrentTimeBoolet = System.currentTimeMillis();
        Gdx.app.log("current time", "" + CurrentTimeBoolet);
        Gdx.app.log("delta time", "" + (Dvigatel.getTimeBoolet() - CurrentTimeBoolet));

        if (CurrentTimeBoolet <= Dvigatel.getTimeBoolet()) {

            Gdx.app.log("render", "" + BlokList.get(nc).getBooletY());

            DrawPole.DrawStartPole();
/*
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
*/
            //	Gdx.app.log("ink", "" + ink);
        }
        if (CurrentTimeBoolet > Dvigatel.getTimeBoolet()) {
            MyGdxGame.setFlagBoolet(false);

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
}
