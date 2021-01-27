package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawTower extends MyGdxGame {

    public static void StartDrawTowerI(int rotI) {

        TextureRegion IgrokCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(IgrokCanon,
                0,
                0,
                (WIDTH / 7) / 2,//centerRotateX
                (HEIGHT / 12) / 2,//centerRotateY
                WIDTH / 7,
                HEIGHT / 12,
                0.5f,
                0.5f,
                rotI,
                true// УГОЛ

        );


    }


    public static void StartDrawTowerV(int rotV) {

        TextureRegion VragCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(VragCanon,
                0,
                HEIGHT - (HEIGHT / 12),
                (WIDTH / 7) / 2,//centerRotateX
                (HEIGHT / 12) / 2,//centerRotateY
                WIDTH / 7,
                HEIGHT / 12,
                0.5f,
                0.5f,
                rotV,
                false);// УГОЛ

    }

    ///////////////end class
}
