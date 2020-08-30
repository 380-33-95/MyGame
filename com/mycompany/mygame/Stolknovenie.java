package com.mycompany.mygame;

public class Stolknovenie {

static 	int b, bb;

	public static <objekt> void StolknoveniePole(int pp) {

	//	objekt OB1= (objekt) Blok.BlokList.get(b);

	//	objekt OB2= (objekt) Blok.BlokList.get(bb);

		Blok b1, b2;

		System.out.println("----------------------");

		switch (Blok.BlokList.get(pp).getStorona()) {

			case 1: {

				b = pp;
				bb = b + 7;

				System.out.println("ataka blok" + b + " na blok" + bb);

			}

			case 2: {

				b = pp;
				bb = b - 7;

				System.out.println("ataka blok" + b + " na blok" + bb);

			}

		}


	//	switch (Blok.BlokList.get(pp).getStorona()) {

		b1 = Blok.BlokList.get(b); //napadajushij
		b2 = Blok.BlokList.get(bb);

		System.out.println("blok1 " + b1 + " blok2 " + b2);



				b1.setHealth(
					b1.getHealth()-b2.getForse()
				);

				b2.setHealth(
						b2.getHealth()-b1.getForse()
				);

				if (b1.getHealth()<=0){
					b1.setIndex(0);
				}

				if (b2.getHealth()<=0){
					b2.setIndex(0);
				}




		System.out.println("======blok1 " + b1.getHealth() + " blok2  " + b2.getHealth());

		}


	

}
