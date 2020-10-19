package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawBoolet extends MyGdxGame {

	static int ink = 0;
	static long CurrentTimeBoolet;

	public static void DrawCiclBoolet(int nc) {

		CurrentTimeBoolet = System.currentTimeMillis();
		Gdx.app.log("current time", "" + CurrentTimeBoolet);
		Gdx.app.log("delta time", "" + (BlokList.get(nc).getTimeBoolet() - CurrentTimeBoolet));

		if (CurrentTimeBoolet <= BlokList.get(nc).getTimeBoolet()) {

			Gdx.app.log("render", "" + BlokList.get(nc).getBooletY());

			TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(BooletV,
					BlokList.get(nc).getX(),
					BlokList.get(nc).getBooletY(),
					1,
					1,
					WIDTH / 7,
					HEIGHT / 12,
					1,
					1,
					0);
			ink++;
			//	Gdx.app.log("ink", "" + ink);
		}
		if (CurrentTimeBoolet > BlokList.get(nc).getTimeBoolet()) {
			//	MyGdxGame.setFlagBoolet(false);
			ink = 0;
		}
	}


}
