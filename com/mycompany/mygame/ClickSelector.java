package com.mycompany.mygame;


public class ClickSelector extends MyGdxGame{


	public static void TouchPressed(int nc) {



		if (getStatusMenu() == 1) { //BOJ


			if ((getNC() >= 78 && getNC() <= 83)//////////////////////////////////////////////////////////////////////////////////////hod igroka
					&& Peremen.isSmenaHoda()
				// && !Vistrel.timerVistrelI.isRunning()
			) {
				HodIgrok.HodIgrokZamok();
			}

			if (getNC() >= 70 && getNC() <= 76
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() == 0
				//   && !Vistrel.timerVistrelI.isRunning()
			) {
            HodIgrok.HodIgrokPole(getNC());
			}

			
			/*
		if (Peremen.isOneClik()==true) {
			Dvigatel.setKli(6);
			Dvigatel.SdvigKletkaI();
		}
		
		Obnulenie.ObnulenieBuferI();
		LoadBufer.LoadBuferI(kod);
		Obnulenie.ObnulenieFinishI();
		Peremen.setKodZamokV(kod-71);		
		 }
				

			 
		 { //pered boj igrok
			Peremen.setKodPole(kod);
			Perebros.PrebrosI();
			Peremen.setOneClik(true);	 
		 }
				 
		 //perenos v pole igrok
		 if(kod>=35 && kod<=62
	//			 && !Vistrel.timerVistrelI.isRunning()
				 && Peremen.buferI[7]==1
				 && Peremen.pole[kod][0]<=0
				 && Dvigatel.getKli()==6
				 )
		 { 
			 
			Peremen.setKodPole(kod);
			Perebros.PrebrosIvPole(kod);
			Peremen.setOneClik(true);	 
		 }
		 
		 */
			/////////////////////////////////////////////////////////////////////hod vrag

			if ((getNC() >= 1 && getNC() <= 6)
					&& (!Peremen.isSmenaHoda())
				//	 && !Vistrel.timerVistrelV.isRunning()
			) {
				HodVrag.HodVragZamok();
			}
			if(getNC()>=7 && getNC()<=13
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() == 0
				//		 && !Vistrel.timerVistrelV.isRunning()
			)

			{ //pered boj vrag
				HodVrag.HodVragPole();
			}

			 /*
		if (Peremen.isOneClik()==true) {
			Dvigatel.setKlv(63);
			Dvigatel.SdvigKletkaV();
		}	
		
		Obnulenie.ObnulenieBuferV();
		LoadBufer.LoadBuferV(kod);
		Obnulenie.ObnulenieFinishV();
					
		 }
				

				 
		 //perenos v pole vrag	
		 if(kod>=7 && kod<=34
				 &&  Peremen.buferV[7]==1
			//	 && !Vistrel.timerVistrelV.isRunning()
				 && Peremen.pole[kod][0]<=0
				 && Dvigatel.getKlv()==70
				 )
		 { 
			
			Peremen.setKodPole(kod);
			Perebros.PrebrosVvPole(kod);
			Peremen.setOneClik(true);	 
		 }
		*/

		}//end BOJ


	}








}/////////////////////////////

