package com.mycompany.enemy;

import com.mycompany.mygame.Blok;

public class Analiz extends Blok {

	public static int FindVeryForseBlok() {

		int VFB = 0;

		int VeryForse = 0;

		for (int gh = 1; gh <= 6; gh++) {
			if (BlokList.get(gh).getEffect() == 0
					&& BlokList.get(gh).getForse() > VeryForse) {
				VeryForse = BlokList.get(gh).getForse();
				VFB = gh;
			}
		}

		return VFB;
	}


	public static int FindVeryForceEnemy() {

		int VFE = 76;
		int fe = 0;


		for (int de = 7; de <= 76; de++) {
			if (BlokList.get(de).getStorona() == 1
					&& BlokList.get(de).getEffect() == 0
					&& BlokList.get(de).getForse() > fe) {

				fe = BlokList.get(de).getForse();
				VFE = de;


			}
		}

		return VFE;

	}


	public static int SamijBlizkijEnemy() {

		int shortEnemy = 76;

		int hu = 7;

		while (BlokList.get(hu).getStorona() != 1
				&& BlokList.get(hu).getEffect() != 0) {

			if (hu <= 75) {
				hu++;
			} else break;
		}

		return shortEnemy;

	}


	public static int FindZamokMine() {


		int nomMine = 0;
		for (int ds = 1; ds <= 6; ds++) {

			if (BlokList.get(ds).getIndex() == 10) {
				nomMine = ds;
			}

		}

		return nomMine;
	}


	public static boolean FindBoth() {
		boolean kl = false;
		int bv = 1;

		while (bv <= 6) {
			if (BlokList.get(bv).getEffect() == 0) {
				kl = true;
				bv++;
			}
		}
		return kl;
	}


	///
}
