package com.mycompany.enemy;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;

public class Analiz extends Blok {


	public static boolean ProverkaPole() {
		boolean lk = false;

		for (int dc = 14; dc <= 76; dc++) {
			if (BlokList.get(dc).getStorona() == 1) {
				lk = true;
				System.out.println("enemy =" + dc);
			}
		}
		System.out.println("pole =" + lk);
		return lk;
	}


	public static int FindVeryForseBlok() {

		int gv = 0;

		int VeryForse = 0;

		for (int gh = 1; gh <= 6; gh++) {
			if (BlokList.get(gh).getEffect() == 0
					&& BlokList.get(gh).getForse() > VeryForse) {
				VeryForse = BlokList.get(gh).getForse();
				gv = gh;
			}
		}

		System.out.println("very forse= " + gv);
		if (gv > 0 && gv <= 6) {
			ClickSelector.TouchPressed(gv);
		}
		return gv;
	}


	public static boolean SamijBlizkijEnemy(int hud) {


		boolean sm = false;

		int hu = hud;
		int hup = 0;

		while (hu <= 76 && !sm) {

			hu++;
			if (BlokList.get(hu).getStorona() == 1
					&& BlokList.get(hu).getEffect() == 0) {
				sm = true;
				System.out.println("find enemy =" + hu);
			}
		}
		if (hu > 13 && hu <= 76) {
			hup = hu;
			while (hup >= 13) {
				hup = hup - 7;
				System.out.println("next>>" + hup);
			}

			if (BlokList.get(hup).getIndex() == 0) {
				ClickSelector.TouchPressed(hup);
			} else {
				if (SamijBlizkijEnemy(hu - 1)) {
					SamijBlizkijEnemy(hu - 1);
				} else {

					if (HodEffect()) {

					}
				}
			}

		}
		return sm;
	}


	public static int FindZamokMine() {

		int nomMine = 0;
		for (int ds = 1; ds <= 6; ds++) {

			if (BlokList.get(ds).getIndex() == 6) {
				nomMine = ds;
			}

		}
		if (nomMine > 0 && nomMine <= 6) {
			ClickSelector.TouchPressed(nomMine);
		}

		return nomMine;
	}


	public static boolean HodEffect() {
		boolean he = false;
		boolean hv = false;

		int le = 0;
		int lv = 0;

		while (!he) {
			le++;
			if (BlokList.get(le).getEffect() >= 6 && BlokList.get(le).getEffect() <= 11) {
				he = true;
				ClickSelector.TouchPressed(le);

			}

		}
		while (!hv) {
			lv = MathUtils.random(14, 41);
			if (BlokList.get(lv).getIndex() == 0) {
				ClickSelector.TouchPressed(lv);
				hv = true;
			}
		}

		return he;
	}


	///
}
