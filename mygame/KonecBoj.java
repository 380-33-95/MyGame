package com.mycompany.mygame;

import static com.mycompany.mygame.Blok.BlokList;

public class KonecBoj {

	public static void KonecBojI1() {
		Peremen.setWin(0);
		ClearEnemy();
	}


	public static void KonecBojV1() {
		Peremen.setWin(200);
		ClearEnemy();
	}

	public static void KonecBoj(int p) {
		if (p == 0) {
			Peremen.setWin(0);
		} else if (p == 1) {
			Peremen.setWin(200);
		}
		ClearEnemy();
	}

	public static void ClearEnemy() {
		int nv;

//		if (Peremen.getWin() > 0) {
//            nv = 1;
//        } else {
//            nv = 2;
//        }
//		for (int nk = 7; nk <= 76; nk++) {
//			if (BlokList.get(nk).getStorona() == nv) {
//				BoomBlok.StartBoomBlok(nk);
//			}
//		}
		nv = Peremen.getWin() > 0 ? 1 : 2;
		for (Blok df : BlokList.subList(7, 76)) {

			if (df.getStorona() == nv) {
				BoomBlok.StartBoomBlok(BlokList.indexOf(df));
			}
		}

		//	MyGdxGame.setStatusMenu(2);
		GameEnd.StartPausaEnd();
	}


}
