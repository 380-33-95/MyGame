package com.mycompany.mygame;

public class LoadBufer extends Blok {
	

	public static void LoadVBufer(int kzv){


		Blok.bufer.setForse(BlokList.get(kzv).getForse());
        Blok.bufer.setHealth(BlokList.get(kzv).getHealth());
        Blok.bufer.setStorona(BlokList.get(kzv).getStorona());
        Blok.bufer.setIndex(BlokList.get(kzv).getIndex());
        Blok.bufer.setEffect(BlokList.get(kzv).getEffect());
        Blok.bufer.setX(BlokList.get(kzv).getX());
        Blok.bufer.setY(BlokList.get(kzv).getY());


        Peremen.setKodZamok(kzv);

//		System.out.println();
//
//		System.out.printf("KLETKA %s -> index=%d health=%d forse=%d effect=%d storona=%d",
//				" buffer",
//				BlokList.get(84).getIndex(),
//				BlokList.get(84).getHealth(),
//				BlokList.get(84).getForse(),
//				BlokList.get(84).getEffect(),
//				BlokList.get(84).getStorona()
//		);
//
//		System.out.println();
    }
}
