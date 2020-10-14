
package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;




public class JustTouched extends MyGdxGame{

    static int RjadX, RjadY;
    static  int nc=0;

    public  static int IfJustTouched() {


        if (Gdx.input.justTouched()) {

            Touch.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(Touch);

            if ((Touch.x != TouchX2) & (Touch.y != TouchY2)) {
                TouchX2 = (int) Touch.x;
                TouchY2 = (int) Touch.y;

                TouchY2 = HEIGHT - TouchY2;

                RjadY = (TouchY2 / (HEIGHT / 12));

                RjadX = (TouchX2 / (WIDTH / 7));

            }
        else
            {
                Touch.set(0, 0, 0);
                TouchX2 = 0;
                TouchY2 = 0;
            }

    nc = ((RjadY * 7) + RjadX);
    MyGdxGame.setNC(nc);

            System.out.println(" Touch=> " + nc);

        }

        return nc;

    }

}/////////////////////////
