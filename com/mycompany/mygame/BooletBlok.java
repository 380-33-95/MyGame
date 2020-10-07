package com.mycompany.mygame;

import draw.DrawPole;


public class BooletBlok extends Blok {


	//TODO cicl
	public static void CircleBoolet(int nb) {

		switch (BlokList.get(nb).getStorona()) {


			case 1: {
				if (nb >= 14) {
					BlokList.get(nb).setTimeBoolet(DrawPole.CurrentTime + 100);
					BlokList.get(nb).setBooletY(BlokList.get(nb).getBooletY() - 100);

				} else {
					BlokList.get(nb).setBooletY(0);
					BlokList.get(nb).setTimeBoolet(0);
					MyGdxGame.setFlagBoolet(false);
				}

				break;
			}


			case 2: {
				if (nb <= 69) {
					BlokList.get(nb).setTimeBoolet(DrawPole.CurrentTime + 100);
					BlokList.get(nb).setBooletY(BlokList.get(nb).getBooletY() + 100);

				} else {
					BlokList.get(nb).setBooletY(0);
					BlokList.get(nb).setTimeBoolet(0);
					MyGdxGame.setFlagBoolet(false);
				}

				break;
			}


		}


	}

}