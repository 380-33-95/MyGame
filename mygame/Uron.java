
package com.mycompany.mygame;

public class Uron extends Blok {

	public static boolean UronBasaVrag() {

		int hli = b00.getHealth();
			
			for (int a = 7; a <= 13; a++) {

				if (BlokList.get(a).getStorona() == 1) {
					if (hli- BlokList.get(a).getForse() >= 1) {
						b00.setHealth(hli - BlokList.get(a).getForse());

						BlokList.get(a).PlayMusik(12, 0.5f);
					
				} else {
					b00.setHealth(0);
					KonecBoj.KonecBoj(0);
				}
			}
		}
		return true;

	}


	public static boolean UronBasaIgrok() {

		int hlv = b77.getHealth();
		for (int a = 70; a <= 76; a++) {

			if (BlokList.get(a).getStorona() == 2) {
				if (hlv - BlokList.get(a).getForse() >= 1) {
					b77.setHealth(hlv - BlokList.get(a).getForse());

					BlokList.get(a).PlayMusik(12, 0.5f);

				} else {
					b77.setHealth(0);
					KonecBoj.KonecBoj(1);

				}
			}
		}

		return true;

	}

}
