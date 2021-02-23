package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.Dvigatel;
import com.mycompany.mygame.MyGdxGame;


public class DrawSmenaHoda extends MyGdxGame {

	public static int CircleSun;

	public static boolean sun;

	public static void StartDrawSmenaHoda() {


		TextureRegion SunSmenaHoda =
				new TextureRegion(atlas, (sun ? 600 : 500), 2900, 100, 100);

		batch.draw(SunSmenaHoda,
				CircleSun,
				(HEIGHT / 2 - (
						(HEIGHT / 12) / 2)
						+
						(100 *
								(int) Math.sin(CircleSun)
						)
				),
				1,
				1,
				WIDTH / 7,
				HEIGHT / 12,
				1,
				1,
				0);

		if (sun) {
			if (CircleSun < WIDTH - (WIDTH / 7)) {
				CircleSun += (1 + Gdx.graphics.getDeltaTime() / 2);
			}

			if (CircleSun >= WIDTH - WIDTH / 7) {
                sun = false;


                //	Peremen.setSmenaHoda(!Peremen.isSmenaHoda());

                if (isSmenaHoda()) {
                    Dvigatel.StartCiclPoleIgrok();
                }
                if (!isSmenaHoda()) {
                    Dvigatel.StartCiclPoleVrag();
                }


                CircleSun = WIDTH - WIDTH / 7;
            }
		}


		if (!sun) {

			if (CircleSun >= 0) {

				CircleSun -= (1 + Gdx.graphics.getDeltaTime() / 2);
			}

			if (CircleSun <= 0) {
				sun = true;
				//		Peremen.setSmenaHoda(!Peremen.isSmenaHoda());
				CircleSun = 0;
			}

		}

	}
}
