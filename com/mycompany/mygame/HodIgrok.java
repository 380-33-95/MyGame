
package com.mycompany.mygame;

import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodIgrok extends ClickSelector {


   public static void HodIgrokZamok(){

	   WorkBlok.ObnulenieBufer();

	   LoadBufer.LoadVBufer(getNC());

	   WorkBlok.ObnulenieFinishI();

	   Peremen.setKodZamok(getNC());


if (Dvigatel.isCiclDvigatelI()) {
	Dvigatel.setKli(15);
	Dvigatel.CiclSdvigI();
}
	   Peremen.setOneClik(false);
	 
   }

   public static void HodIgrokPole(int kod){
	   
       System.out.println("------------------------HodIgrokPole()");
     
		   Peremen.setOneClik(true);

		   WorkBlok.LoadPoleBlok();

		   ObnulenieKvadratZamok(Peremen.getKodZamok());

		   WorkBlok.SdvigZamokI();

		   Peremen.setSmenaHoda(false);
   }

   public static void DvigatelIgrok(int nc){


    }
}
