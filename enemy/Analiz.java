package com.mycompany.enemy;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;

public class Analiz extends Blok {


	public static Blok BlokListGet(int kj) {
		Blok df = null;
		df = BlokList.get(kj);
		return df;
	}


	public static boolean ProverkaPole() {
		boolean lk = false;

		for (int dc = 14; dc <= 76; dc++) {

			if (BlokListGet(dc).getStorona() == 1) {
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
			if (BlokListGet(gh).getEffect() == 0
					&& BlokListGet(gh).getForse() > VeryForse) {
				VeryForse = BlokListGet(gh).getForse();
				gv = gh;
			}
		}

		System.out.println("very forse= " + gv);
		if (gv > 0 && gv <= 6) {
			ClickSelector.TouchPressed(gv);
		}
		return gv;
	}


	public static int SamijBlizkijEnemy(int hud) {


		boolean sm = false;

		while (hud <= 76 && !sm) {

			hud++;
			if (BlokListGet(hud).getStorona() == 1
					&& BlokListGet(hud).getEffect() == 0) {
				sm = true;
			}
		}
		return hud;
	}


	public static boolean PererbrosVpole(int hu) {

		boolean sm = false;

		int hup = 0;

		if (hu >= 14 && hu <= 76) { //ishem kuda stavit naprotiv

			while (hu >= 14) {
				hu = hu - 7;
			}

			if (BlokListGet(hu).getIndex() == 0) //proverjem ne sanjat li kvadrat
			{
				ClickSelector.TouchPressed(hu);
			} else {
				if (SamijBlizkijEnemy(hu + 1) > 0) {
					SamijBlizkijEnemy(hu + 1);
				} else {

					if (HodEffect()) {
					}

				}
			}

		}
		return sm;
	}


	public static boolean FindZamokMine() {

		boolean estmina = false;

		int nomMine = 0;
		for (int ds = 1; ds <= 6; ds++) {

			if (BlokListGet(ds).getIndex() == 6) {
				nomMine = ds;
				System.out.println("find mina " + nomMine);
			}

		}

		if (nomMine > 0 && nomMine <= 6) {
			ClickSelector.TouchPressed(nomMine);
			estmina = true;
		}


		return estmina;
	}


	public static boolean PerebrosMina(int ft) {

		System.out.println("Perebros mina");
		boolean sp = false;

		if (ft >= 42 && ft <= 76) {
			while (ft <= 41 && ft >= 35) {
				ft = ft - 7;
			}
			if (BlokListGet(ft).getIndex() == 0) {
				ClickSelector.TouchPressed(ft);
				sp = true;
			}
		}


		if (ft >= 14 && ft <= 41) { //ishem kuda stavit naprotiv

			ft = ft - 7;

			if (BlokListGet(ft).getIndex() == 0) {
				ClickSelector.TouchPressed(ft);
				sp = true;
			}

		}
		return sp;
	}

	public static boolean HodEffect() {
		boolean he = false;
		boolean hv = false;

		int le = 0;
		int lv = 0;

		while (!he) {
			le++;
			if (BlokListGet(le).getEffect() >= 6 && BlokListGet(le).getEffect() <= 11) {
				he = true;
				ClickSelector.TouchPressed(le);

			}

		}
		while (!hv) {
			lv = MathUtils.random(14, 41);
			if (BlokListGet(lv).getIndex() == 0) {
				ClickSelector.TouchPressed(lv);
				hv = true;
			}
		}

		return he;
	}


	///
}
