package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawTower extends MyGdxGame {

   static int originX= WIDTH / 7 / 2;
   static int originY= HEIGHT / 12 / 2;
   static  int width=WIDTH / 7;
   static int height=HEIGHT / 12;

    public static void StartDrawTowerI(float rotI) {

        TextureRegion IgrokCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(IgrokCanon,
                0,
                0,
                originX,//centerRotateX
                originY,//centerRotateY
                width,
                height,
                0.5f,
                0.5f,
                rotI-90,
                false// УГОЛ

        );


    }


    public static void StartDrawTowerV(float rotV) {

        TextureRegion VragCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(VragCanon,
                0,
                HEIGHT - (HEIGHT / 12),
                originX,//centerRotateX
                originY,//centerRotateY
                width,
                height,
                0.5f,
                0.5f,
                90-rotV,
               true);// УГОЛ

    }

    ///////////////end class
}
