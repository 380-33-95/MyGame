
package com.mycompany.mygame;

public class Uron extends Blok {

	public static boolean UronBasaVrag() {

		int hli = b00.getHealth();
		for (Blok qe : BlokList.subList(7, 13)) {
			if (qe.getStorona() == 1) {
				b00.setHealth((hli - qe.getForse()) >= 1 ? (hli - qe.getForse()) : 0);
				if (b00.getHealth() > 0) {
					qe.PlayMusik(12, 0.5f);
					//		MetodObject();
				} else {
					b00.setHealth(0);
					KonecBoj.KonecBoj(0);//??:::
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
