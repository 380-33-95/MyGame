package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawOblako extends MyGdxGame {

	public static void StartDrawOblako() {

		TextureRegion Oblako =
				new TextureRegion(atlas, 700, 2900, 100, 100);

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
