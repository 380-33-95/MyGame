package com.mycompany.mygame;

public class FindBuletUron extends Blok {

	public static int ur;

	public static void StartScaner(int nx) {

//		if (BlokList.get(nx).getStorona() == 1) {
//
//
//			while (!(BlokList.get(nx).getStorona() == 2) && nx > 14) {
//				nx -= 7;
//			}
//
//			if (BlokList.get(nx).getStorona() == 2
//					&& BlokList.get(nx).getEffect() == 0) {
//				BlokList.get(nx).setHealth(
//						BlokList.get(nx).getHealth() - 1);
//				if (BlokList.get(nx).getHealth() <= 0) {
//					BoomBlok.StartBoomBlok(nx);
//				}
//			}
//		}


		if (BlokList.get(nx).getStorona() == 2) {

			ur = BlokList.get(nx).getForse();

			while (!(BlokList.get(nx).getStorona() == 1) && nx < 78) {
				nx += 7;

				if (BlokList.get(nx).getStorona() == 1
						&& BlokList.get(nx).getEffect() == 0) {
					System.out.println("Enamy" + nx);
					BlokList.get(nx).setHealth(
							BlokList.get(nx).getHealth() - ur);
					if (BlokList.get(nx).getHealth() <= 0) {
						BoomBlok.StartBoomBlok(nx);
					}
				}

			}
		}

	}

}
