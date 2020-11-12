package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawTutorials extends MyGdxGame {

    public static void StartDrawTutorials() {

        TextureRegion DrawTutorials = new TextureRegion(atlas, 3600, 3100, WIDTH, HEIGHT);

        TextureRegion buttonGoStart = new TextureRegion(atlas, 800, 3000, 300, 100);


        batch.draw(DrawTutorials,
                0,
                0,
                1,
                1,
                WIDTH,
                HEIGHT,
                1,
                1,
                0);

        batch.draw(buttonGoStart, (WIDTH / 7) * 2, (HEIGHT / 12) * 1, 1, 1, shirKnopki, visKnopki, 1, 1, 0);


    }
}
