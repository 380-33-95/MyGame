
package com.mycompany.mygame;

public class Uron extends Blok{

	public static void UronBasaVrag() {

		int hli=b00.getHealth();
		for (int a=0; a<=6;a++) {
			if(BlokList.get(a).getStorona()==1) {
				if((hli-BlokList.get(a).getForse()>=1)) {

					b00.setHealth(hli-BlokList.get(a).getForse());

				}
		else
				{
					b00.setHealth(0);
					KonecBoj.KonecBojI();//??:::

				}
			}
		}

	}



	public static void UronBasaIgrok() {

		int hlv=b77.getHealth();
		for (int a=63; a<=69;a++) {

			if(BlokList.get(a).getStorona()==2) {
				if (hlv-BlokList.get(a).getForse()>=1) {
					b77.setHealth(hlv-BlokList.get(a).getForse());

				}
				else
				{
					b77.setHealth(0);
					KonecBoj.KonecBojV();

				}
			}
		}


	}

}
