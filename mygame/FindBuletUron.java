package com.mycompany.mygame;

import com.mycompany.draw.DrawBoolet;

public class FindBuletUron extends DrawBoolet {


	public static void StartScaner(int ib) {

		if (BlokList.get(ib).getStorona() == 2) {

			fv = true;

			for (int aq = ib; aq <= 77; aq += 7) {

				if (BlokList.get(aq).getStorona() == 1
						&& fv
						&& (BlokList.get(aq).getEffect() == 0
						|| BlokList.get(aq).getEffect() == 7)) {
					massivBulet[ciclScaner][3] = aq;

					BlokList.get(aq).setHealth(
							BlokList.get(aq).getHealth() -
									BlokList.get(ib).getForse()
					);

					fv = false;

					if (BlokList.get(aq).getHealth() <= 0) {
						BoomBlok.StartBoomBlok(aq);
					}
				}
			}

		}


		if (BlokList.get(ib).getStorona() == 1) {

			fi = true;

			for (int aq = ib; aq >= 8; aq -= 7) {

				if (BlokList.get(aq).getStorona() == 2
						&& fi
						&& (BlokList.get(aq).getEffect() == 0
						|| BlokList.get(aq).getEffect() == 7)) {
					massivBulet[ciclScaner][3] = aq;

					BlokList.get(aq).setHealth(
							BlokList.get(aq).getHealth() -
									BlokList.get(ib).getForse()
					);

					fi = false;

					if (BlokList.get(aq).getHealth() <= 0) {
						BoomBlok.StartBoomBlok(aq);
					}
				}
			}

		}


	}

}