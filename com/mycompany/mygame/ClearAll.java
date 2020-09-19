package com.mycompany.mygame;

public class ClearAll extends Blok {

	public static void StartClearAll() {
		for (int n = 0; n <= 83; n++) {
			WorkBlok.ObnulenieKvadratPole(n);
		}
	}
}
