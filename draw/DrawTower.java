package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawTower extends MyGdxGame {


    public static void StartDrawTowerI() {

        TextureRegion IgrokCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(IgrokCanon,
                0,
                0,
                1, 1,
                WIDTH / 7,
                HEIGHT / 12,
                1, 1, 0);

    }


    public static void StartDrawTowerV() {

        TextureRegion VragCanon = new TextureRegion(atlas, 0, 2400, 100, 100);

        batch.draw(VragCanon,
                0,
                0,
                1, 1,
                WIDTH / 7,
                HEIGHT / 12,
                1, 1, 0);

    }

    ///////////////end class
}
