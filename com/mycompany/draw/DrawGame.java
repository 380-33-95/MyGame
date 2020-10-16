package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;


public class DrawGame extends MyGdxGame {


  public static void  DrGame(){
        {

            TextureRegion ZastavkaGame = new TextureRegion(atlas, 0, Peremen.getBoj(), WIDTH , HEIGHT);
            batch.draw(ZastavkaGame, 0,0, 1, 1, WIDTH, HEIGHT,1,1,0);

            TextureRegion KrepostIgrok = new TextureRegion(atlas, 0, 2605,  700, 90);
            batch.draw(KrepostIgrok, 0,HEIGHT/12, 1, 1, WIDTH ,HEIGHT/24, 1, 1,0);

            TextureRegion KrepostVrag = new TextureRegion(atlas, 0, 2505,  700, 90);
            batch.draw(KrepostVrag, WIDTH,HEIGHT-(HEIGHT/12), 1, 1, WIDTH ,HEIGHT/24, 1, 1, 180);
        }
    }

}
