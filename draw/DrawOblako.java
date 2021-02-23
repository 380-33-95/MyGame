package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.TimeUtils;
import com.mycompany.mygame.MyGdxGame;

import java.util.Iterator;

public class DrawOblako extends MyGdxGame {

	public static void spawnCloud() {

		Rectangle clouddrop = new Rectangle();

		clouddrop.y = MathUtils.random(HEIGHT / 12, HEIGHT - (HEIGHT / 12));
		clouddrop.x = WIDTH - (WIDTH / 7);

		clouddrop.width = MathUtils.random(10, 100);
		clouddrop.height = MathUtils.random(10, 100);
		clouddrops.add(clouddrop);
		lastDropTime = TimeUtils.millis();

	}

	public static void StartDrawOblako() {

		for (Rectangle raindrop : clouddrops) {
			batch.draw(dropImage, raindrop.x, raindrop.y, raindrop.width, raindrop.height);
		}

		if (TimeUtils.millis() - lastDropTime > 2000) spawnCloud();

		Iterator<Rectangle> iter = clouddrops.iterator();
		while (iter.hasNext()) {
			Rectangle raindrop = iter.next();
			raindrop.x -= 50 * Gdx.graphics.getDeltaTime();

			if (raindrop.x + raindrop.width < 0) {
				iter.remove();
			}
		}


	}

}
