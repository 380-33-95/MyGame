package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawBossIgrok extends MyGdxGame {

    public static void BossIgrok(){

        if (b77.getHealth() >= 0 && b77.getHealth() <= 9) {

            TextureRegion BossIgrok = new TextureRegion(atlas, b77.getHealth() * 100, 2700, 100, 100);

            batch.draw(BossIgrok,
                    0,
                    0,
                    1, 1,
                    WIDTH/7,
                    HEIGHT/12,
                    1, 1, 0);

        }
        if (b77.getHealth() >= 10 && b77.getHealth() <= 99) {

            TextureRegion CifraI1 = new TextureRegion(atlas, (b77.getHealth() / 10) * 100, 2700, 100, 100);

            batch.draw(CifraI1, //textura
                    5, //raspologenie po X
                    5, //raspologenie po Y
                    1, 1, // szatie
                    WIDTH/14, // shirina
                    HEIGHT/12, //visota
                    1, 1, 0); //povorot

            TextureRegion CifraI2 = new TextureRegion(atlas, (b77.getHealth() % 10) * 100, 2700, 100, 100);

            batch.draw(CifraI2, //textura
                    50, //raspologenie po X
                    5, //raspologenie po Y
                    1, 1, // szatie
                    WIDTH/14, // shirina
                    HEIGHT/12, //visota
                    1, 1, 0); //povorot

        }

        if (b77.getHealth() <= -1 && b77.getHealth() >= -9) {

            TextureRegion BossIgrokMinus = new TextureRegion(atlas, -b77.getHealth() * 100, 2800, 100, 100);

            batch.draw(BossIgrokMinus,
                    5,
                    5,
                    1, 1,
                    WIDTH/7,
                    HEIGHT/12,
                    1, 1, 0);
        }

    }

}
