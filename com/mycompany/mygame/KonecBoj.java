package com.mycompany.mygame;

public class KonecBoj {
	
	public static void KonecBojI() {
		Peremen.setWin(0);
		ClearEnemy();
	}


	public static void KonecBojV() {
		Peremen.setWin(200);
		ClearEnemy();
	}

	public static void ClearEnemy() {
		int nv;
		if (Peremen.getWin() > 0) {
			nv = 1;
		} else {
			nv = 2;
		}
		for (int nk = 7; nk <= 76; nk++) {
			if (Blok.BlokList.get(nk).getStorona() == nv) {
				BoomBlok.StartBoomBlok(nk);

			}
		}

		//	MyGdxGame.setStatusMenu(2);
		GameEnd.StartPausaEnd();
	}


}
