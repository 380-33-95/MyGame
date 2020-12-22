package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.TimeUtils;
import com.mycompany.mygame.MyGdxGame;

public class DrawOblako extends MyGdxGame {

	private void spawnCloud() {
		Rectangle clouddrop = new Rectangle();
		clouddrop.x = MathUtils.random(0, WIDTH - 64);
		clouddrop.y = HEIGHT - 100;
		clouddrop.width = 64;
		clouddrop.height = 64;
		clouddrops.add(clouddrop);
		lastDropTime = TimeUtils.nanoTime();
	}

	public static void StartDrawOblako() {

		TextureRegion Oblako = new TextureRegion(atlas, 700, 2900, 100, 100);

		batch.draw(Oblako,
				500,
				500,
				1,
				1,
				WIDTH / 7,
				HEIGHT / 12,
				1,
				1,
				0);

	}

}
