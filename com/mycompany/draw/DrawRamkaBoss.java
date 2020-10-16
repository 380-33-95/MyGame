package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;

public class DrawRamkaBoss extends MyGdxGame {

    public static void RamkaStartBoss(){


        if(!Peremen.isSmenaHoda()){

            TextureRegion RamkaBoss = new TextureRegion(atlas, 0, Peremen.HodIgrok, 100, 100);
            batch.draw(RamkaBoss, 0, HEIGHT-HEIGHT/12, 1, 1, WIDTH/7, HEIGHT/12, 1, 1, 0);
        }
        else{
            TextureRegion RamkaBoss = new TextureRegion(atlas, 0, Peremen.HodVrag,
                    100, 100);

            batch.draw(RamkaBoss, 0, 0,
                    1, 1,
                    WIDTH / 7,
                    HEIGHT / 12,
                    1, 1, 0);
        }

    }


}
