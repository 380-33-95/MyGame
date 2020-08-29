
package com.mycompany.mygame;

import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodIgrok extends ClickSelector {


   public static void HodIgrokZamok() {

	   WorkBlok.ObnulenieBufer();

	   LoadBufer.LoadVBufer(getNC());

	   WorkBlok.ObnulenieFinishI();

	   Peremen.setKodZamok(getNC());

	   if (Dvigatel.StartCiclIgrok) {
		   Dvigatel.startI = 13;
		   Dvigatel.StartCiclPoleIgrok();
		   Dvigatel.StartCiclIgrok=false;
		   Dvigatel.startCiclVrag=true;

	   }
   }

   public static void HodIgrokPole(){

        System.out.println("------------------------HodIgrokPole()");
     
	    WorkBlok.LoadPoleBlok();

	    WorkBlok.ObnulenieBufer();

		ObnulenieKvadratZamok(Peremen.getKodZamok());

		WorkBlok.SdvigZamokI();

		Peremen.setSmenaHoda(false);


   }

   }
