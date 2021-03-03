package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawCanonBoolet extends MyGdxGame {

    static int originX= WIDTH / 7 / 2;
    static int originY= HEIGHT / 12 / 2;
    static  int width=WIDTH / 7;
    static int height=HEIGHT / 12;


    public static void StartCanonBooletI( float rotI, float trek) {

        float trekI=trek;

        TextureRegion CanonI = new TextureRegion(atlas, 100, 2400, 600, 100);

        batch.draw(CanonI,
                0,
                50,
               50,//centerRotateX
                0,//centerRotateY
                width,
                trekI,
                0.5f,
                1,
                rotI-90,
                false// УГОЛ
        );


    }

    public static void StartCanonBooletV( float rotI, float trek) {

        float trekI=trek;

        TextureRegion CanonV = new TextureRegion(atlas, 100, 2400, 600, 100);

        batch.draw(CanonV,
                0,
                HEIGHT - (HEIGHT / 12),
                0,//centerRotateX
                HEIGHT - (HEIGHT / 12),//centerRotateY
                width,
                trekI,
                0.5f,
                1,
                rotI-90,
                true// УГОЛ
        );


    }

}
