package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawBossVrag extends MyGdxGame {

    public static void BossVrag() {


        if (b00.getHealth() >= 0 && b00.getHealth() <= 9) {

            TextureRegion BossVrag = new TextureRegion(atlas, b00.getHealth() * 100, 2700, 100, 100);

            batch.draw(BossVrag, 5,
                    HEIGHT - (HEIGHT / 12),
                    1, 1,
                    WIDTH / 7,
                    HEIGHT / 12,
                    1, 1, 0);

        }

        if (b00.getHealth() >= 10 && b00.getHealth() <= 99) {

            TextureRegion CifraV1 = new TextureRegion(atlas, (b00.getHealth() / 10) * 100, 2700, 100, 100);

            batch.draw(CifraV1, //textura
                    5, //raspologenie po X
                    HEIGHT - (HEIGHT / 12), //raspologenie po Y
                    1, 1, // szatie
                    WIDTH / 14, // shirina
                    HEIGHT / 12, //visota
                    1, 1, 0); //povorot

            TextureRegion CifraV2 = new TextureRegion(atlas, (b00.getHealth() % 10) * 100, 2700, 100, 100);

            batch.draw(CifraV2, //textura
                    50, //raspologenie po X
                    HEIGHT - (HEIGHT / 12), //raspologenie po Y
                    1, 1, // szatie
                    WIDTH / 14, // shirina
                    HEIGHT / 12,//visota
                    1, 1, 0); //povorot

        }

        if (b00.getHealth() <= -1 && b00.getHealth() >= -9) {

            TextureRegion BossVragMinus = new TextureRegion(atlas, -b00.getHealth() * 100, 2800, 100, 100);

            batch.draw(BossVragMinus, 5,
                    HEIGHT - (HEIGHT / 12),
                    1, 1,
                    WIDTH / 7,
                    HEIGHT / 12,
                    1, 1, 0);

        }


    }

}
