package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawCanonBoolet extends MyGdxGame {

    static int originX= WIDTH / 7 / 2;
    static int originY= HEIGHT / 12 / 2;
    static  int width=WIDTH / 7;
    static int height=HEIGHT / 12;
    static float rotI=0;

    public static void StartCanonBooletI( float trek) {

        float trekI=trek;

        rotI=rotI+(10*Gdx.graphics.getDeltaTime());

        TextureRegion CanonI = new TextureRegion(atlas, 100, 2400, 600, 100);

        batch.draw(CanonI,
                0,
                50,
               50,//centerRotateX
                0,//centerRotateY
                width,
                height,
                0.5f,
                0.5f*trekI,
                rotI-90,
                false// УГОЛ

        );


    }

}
