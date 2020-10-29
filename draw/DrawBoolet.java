package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawBoolet extends MyGdxGame {

	public static int[][] massivBulet = new int[83][2];

	public static int ciclMassivBuletV = 100;
	public static int ciclMassivBuletI = 100;


	public static void BuletStartVrag() {
		if (ciclMassivBuletV == 100) {
			ciclMassivBuletV = -1;
			for (int vb = 7; vb <= 76; vb++) {

				if (BlokList.get(vb).getStorona() == 1 && BlokList.get(vb).isFlagBulet()) {
					ciclMassivBuletV++;
					massivBulet[ciclMassivBuletV][0] = BlokList.get(vb).getX();
					massivBulet[ciclMassivBuletV][1] = BlokList.get(vb).getY();
					BlokList.get(vb).setFlagBulet(false);
				}
			}
			ciclMassivBuletV = 0;
		}

		if (massivBulet[ciclMassivBuletV][0] > 0 && massivBulet[ciclMassivBuletV][1] > 0) {
			TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(BooletV,
					massivBulet[ciclMassivBuletV][0],
					massivBulet[ciclMassivBuletV][1],
					1,
					1,
					WIDTH / 7,
					HEIGHT / 12,
					1,
					1,
					0
			);
		}

		massivBulet[ciclMassivBuletV][1] = (int) (massivBulet[ciclMassivBuletV][1] - (50 + Gdx.graphics.getDeltaTime()));

		if (massivBulet[ciclMassivBuletV][1] <= 100) {
			if (ciclMassivBuletV < 77) {
				massivBulet[ciclMassivBuletV][0] = 0;
				massivBulet[ciclMassivBuletV][1] = 0;
				ciclMassivBuletV++;

			} else {
				ciclMassivBuletV = 100;
			}
		}

	}


	public static void BuletStartIgrok() {

		if (ciclMassivBuletI == 100) {
			ciclMassivBuletI = -1;
			for (int vb = 7; vb <= 76; vb++) {

				if (BlokList.get(vb).getStorona() == 1 && BlokList.get(vb).isFlagBulet()) {
					ciclMassivBuletI++;
					massivBulet[ciclMassivBuletI][0] = BlokList.get(vb).getX();
					massivBulet[ciclMassivBuletI][1] = BlokList.get(vb).getY();
					BlokList.get(vb).setFlagBulet(false);
				}
			}
			ciclMassivBuletI = 0;
		}

		if (massivBulet[ciclMassivBuletI][0] > 0 && massivBulet[ciclMassivBuletI][1] > 0) {
			TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(BooletV,
					massivBulet[ciclMassivBuletI][0],
					massivBulet[ciclMassivBuletI][1],
					1,
					1,
					WIDTH / 7,
					HEIGHT / 12,
					1,
					1,
					0
			);
		}

		massivBulet[ciclMassivBuletI][1] = (int) (massivBulet[ciclMassivBuletI][1] + (50 + Gdx.graphics.getDeltaTime()));

		if (massivBulet[ciclMassivBuletI][1] <= 100) {
			if (ciclMassivBuletI < 77) {
				massivBulet[ciclMassivBuletI][0] = 0;
				massivBulet[ciclMassivBuletI][1] = 0;
				ciclMassivBuletI++;

			} else {
				ciclMassivBuletI = 100;
			}
		}
	}
	
	
	


}
