package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.BoomBlok;
import com.mycompany.mygame.MyGdxGame;

public class DrawBoom extends MyGdxGame {


	public static void DrawCiclBoom() {


		for (int pp = 7; pp <= 76; pp++) {
			if (BlokList.get(pp).getKadrBoom() > 0) {

                BlokList.get(pp).PlayMusik(8, 0.5f);


                TextureRegion PoleBoom = new TextureRegion(atlas, BlokList.get(pp).getKadrBoom() * 100, 2300, 100, 100);
                batch.draw(PoleBoom, BlokList.get(pp).getX(), BlokList.get(pp).getY(), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);
                BoomBlok.CircleBoom(pp);
            }

		}

	}
}
