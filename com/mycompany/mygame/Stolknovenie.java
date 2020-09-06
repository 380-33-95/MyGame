package com.mycompany.mygame;

public class Stolknovenie {

static 	int b, bb;

	public static void StolknoveniePole(int pp) {

		System.out.println("----------------------");

		switch (Blok.BlokList.get(pp).getStorona()) {

			case 1: {

				b = pp;
				bb = b - 7;

				System.out.println("ataka blok" + b + " na blok" + bb);
break;
			}

			case 2: {

				b = pp;
				bb = b + 7;

				System.out.println("ataka blok" + b + " na blok" + bb);
break;
			}

		}


	//	System.out.println("blok1 " + b1 + " blok2 " + b2);



				Blok.BlokList.get(b).setHealth(
					Blok.BlokList.get(b).getHealth()-
					Blok.BlokList.get(bb).getForse());

				Blok.BlokList.get(bb).setHealth(
						Blok.BlokList.get(bb).getHealth()-
						Blok.BlokList.get(b).getForse()
				);

				if (Blok.BlokList.get(b).getHealth()<=0){
					WorkBlok.ObnulenieKvadratPole(b);
				}

				if (Blok.BlokList.get(bb).getHealth()<=0){
				 WorkBlok.ObnulenieKvadratPole( bb);
				}



		}


	

}
