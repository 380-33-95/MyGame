package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;

public class DrawSelectLevel extends MyGdxGame {


    public static void DrawRunSelectLevel() {

        TextureRegion SelectLevel = new TextureRegion(atlas, 800, Peremen.getMenuSt(), WIDTH, HEIGHT);

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



