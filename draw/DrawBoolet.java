package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawBoolet extends MyGdxGame {

	static int ink = 0;
	static long CurrentTimeBoolet;

	public static void DrawCiclBoolet() {

		//	while (BlokList.get(getCurrentBlok()).getTimeBoolet()>com.badlogic.gdx.utils.TimeUtils.millis()) {

		while (BlokList.get(MyGdxGame.getCurrentBlok()).isFlagBulet()) {
			System.out.print("+");

			TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(BooletV,
					BlokList.get(MyGdxGame.getCurrentBlok()).getX(),
					BlokList.get(MyGdxGame.getCurrentBlok()).getBooletY(),
					1,
					1,
					WIDTH / 7,
					HEIGHT / 12,
					1,
					1,
					0
			);

			BlokList.get(MyGdxGame.getCurrentBlok()).setBooletY(
					(int) ((BlokList.get(MyGdxGame.getCurrentBlok()).getBooletY() - 100)
							* Gdx.graphics.getDeltaTime()));
			if (BlokList.get(MyGdxGame.getCurrentBlok()).getBooletY() <= 100) {
				BlokList.get(getCurrentBlok()).setFlagBulet(false);
			}

		}

		//	}


	}


}
