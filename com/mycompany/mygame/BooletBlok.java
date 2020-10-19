package com.mycompany.mygame;

public class BooletBlok extends Blok {

	static boolean bn;

	//TODO cicl
	public static boolean CircleBoolet(int nb) {


		switch (BlokList.get(nb).getStorona()) {


			case 1: {
				if (nb >= 14) {
					//        BlokList.get(nb).setTimeBoolet(DrawPole.CurrentTime + 250);
					BlokList.get(nb).setBooletY(BlokList.get(nb).getBooletY() - 100);
					bn = true;
				} else {
					BlokList.get(nb).setBooletY(0);
					BlokList.get(nb).setTimeBoolet(0);

					bn = false;
				}

				break;
			}


			case 2: {
				if (nb <= 69) {
					//        BlokList.get(nb).setTimeBoolet(DrawPole.CurrentTime + 250);
					BlokList.get(nb).setBooletY(BlokList.get(nb).getBooletY() + 100);
					bn = true;
				} else {
					BlokList.get(nb).setBooletY(0);
					BlokList.get(nb).setTimeBoolet(0);

					bn = false;
				}

				break;
			}


		}

		return bn;
	}


}
