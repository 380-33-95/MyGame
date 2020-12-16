package com.mycompany.mygame;

public class Stolknovenie {

static 	int b, bb;

	public static void StolknoveniePole(int pp) {

		MyMusik.MapSound.get(11).play();

		switch (Blok.BlokList.get(pp).getStorona()) {

			case 1: {

				b = pp;
				bb = b - 7;

				break;
			}

			case 2: {

				b = pp;
				bb = b + 7;

				break;
			}

		}

		Blok.BlokList.get(b).setHealth(
				Blok.BlokList.get(b).getHealth() -
						Blok.BlokList.get(bb).getForse());

		Blok.BlokList.get(bb).setHealth(
				Blok.BlokList.get(bb).getHealth() -
						Blok.BlokList.get(b).getForse()
		);

		if (Blok.BlokList.get(b).getHealth() <= 0) {
			BoomBlok.StartBoomBlok(b);

		}

		if (Blok.BlokList.get(bb).getHealth() <= 0) {
			BoomBlok.StartBoomBlok(bb);
		}


	}


	

}
