package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawSelectLevel extends MyGdxGame {


    public static void DrawRunSelectLevel() {

        TextureRegion SelectLevel = new TextureRegion(atlas, 3600, 4400, WIDTH, HEIGHT);

        batch.draw(SelectLevel,
                0,
                0,
                1,
                1,
                WIDTH,
                HEIGHT,
                1,
                1,
                0);


    }


}



