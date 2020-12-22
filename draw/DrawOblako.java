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

		clouddrop.width = 64;
		clouddrop.height = 64;
		clouddrops.add(clouddrop);
		lastDropTime = TimeUtils.nanoTime();
	}

	public static void StartDrawOblako() {

		//////////////////////////////////////

		for (Rectangle raindrop : clouddrops) {
			batch.draw(dropImage, raindrop.x, raindrop.y);
		}

		if (TimeUtils.nanoTime() - lastDropTime > 2000000000) spawnCloud();

		// движение капли, удаляем все капли выходящие за границы экрана
		// или те, что попали в ведро. Воспроизведение звукового эффекта
		// при попадании.
		Iterator<Rectangle> iter = clouddrops.iterator();
		while (iter.hasNext()) {
			Rectangle raindrop = iter.next();
			raindrop.x -= 50 * Gdx.graphics.getDeltaTime();
			if (raindrop.x + 64 < 0) iter.remove();
		}

		///////////////////////////////////////

	}

}
