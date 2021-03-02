package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawTarget extends MyGdxGame {

    public static void StartTarget(int x, int y) {


                TextureRegion PodsvetkaTarget = new TextureRegion(atlas, 200, 2900, 100, 100);

                batch.draw(PodsvetkaTarget, x-50,  y-50, 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);


    }

}
