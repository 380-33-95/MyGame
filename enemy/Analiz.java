package com.mycompany.enemy;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;

public class Analiz extends Blok {

	public static int getRealyBlok() {
		return realyBlok;
	}

	public static void setRealyBlok(int realyBlok1) {
		realyBlok = realyBlok1;
	}

	private static int realyBlok;


	public static Blok BlokListGet(int kj) {
		Blok df = null;
		df = BlokList.get(kj);
		return df;
	}

	//////////////////////////////////////////////////
	public static boolean ProverkaPole() {
		boolean lk = false;

		for (Blok dc : BlokList.subList(14, 67)) {
			if (dc.getStorona() == 1) {
				lk = true;
			}
		}

		System.out.println("pole =" + lk);
		return lk;
	}


	/////////////////////////////////////////////////////
	public static int FindVeryForseBlok() {

		int gv = 0;

		int VeryForse = 0;

		for (Blok gh : BlokList.subList(1, 6)) {
			if (gh.getEffect() == 0
					&& gh.getForse() > VeryForse) {
				VeryForse = gh.getForse();
				gv = BlokList.indexOf(gh);
			}

			System.out.println("very forse= " + gv);
			if (VeryForse > 0) {
				ClickSelector.TouchPressed(gv);
			}

		}
		return gv;
	}

	////////////////////////////////////////////////////////
	public static int Enemy(int hud) {

		boolean sm = false;

		while (!sm && hud <= 76) {
			hud++;
			if (BlokListGet(hud).getStorona() == 1
					&& BlokListGet(hud).getEffect() == 0) {
				sm = true;
			}
		}

		if (!sm) {
			hud = 0;
		}

		return hud;
	}

	//////////////////////////////////////////////////////
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
				if (Enemy(hu + 1) > 0) {
					Enemy(hu + 1);
				} else {

					if (HodEffect()) {
					}

				}
			}

		}
		return sm;
	}

	//////////////////////////////////////////////////////////
	public static boolean FindZamokMine() {

		boolean estmina = false;

		int nomMine = 0;

		for (Blok hj : BlokList.subList(1, 6)) {
			if (hj.getIndex() == 6) {
				nomMine = BlokList.indexOf(hj);
				System.out.println("find mina " + nomMine);
			}
		}


		if (nomMine > 0 && nomMine <= 6) {
			ClickSelector.TouchPressed(nomMine);
			estmina = true;
		}

		return estmina;
	}


	///////////////////////////////////////////////////////////
	public static boolean VerefyMinaOfKurs(int le) {
		boolean gr = true;

		while (gr && le >= 14) {
			le = le - 7;
			if (BlokListGet(le).getIndex() == 6) {
				gr = false;
			}
		}

		return gr;

	}


	////////////////////////////////////////////////////
	public static boolean PerebrosMina(int ft) {

		System.out.println("Perebros mina");
		boolean sp = false;

		if (ft >= 42 && ft <= 76) {
			while (ft >= 42) {
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


	////////////////////////////////////////////
	public static boolean HodEffect() {
		System.out.println("hod effect");
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