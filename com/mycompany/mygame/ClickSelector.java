package com.mycompany.mygame;


public class ClickSelector extends MyGdxGame{


	public static void TouchPressed(int nc) {



		if (getStatusMenu() == 1) { //BOJ

		//////////////////////////////////////////////////////////////////////////////////////hod igroka

			if ((getNC() >= 78 && getNC() <= 83)
					&& Peremen.isSmenaHoda()
				// && !Vistrel.timerVistrelI.isRunning()
			)
			{
				HodIgrok.HodIgrokZamok();
				Dvigatel.setCiclDvigatelI(false);
				Dvigatel.setCiclDvigatelV(true);
			}

			if (getNC() >= 70 && getNC() <= 76
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() == 0
				//   && !Vistrel.timerVistrelI.isRunning()
			)
			{
            HodIgrok.HodIgrokPole(getNC());
			}

			if (getNC()>=49 && getNC()<=69
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() >0)
			{
				HodIgrok.HodIgrokPole(getNC());
			}


			/////////////////////////////////////////////////////////////////////hod vrag

			if ((getNC() >= 1 && getNC() <= 6)
					&& (!Peremen.isSmenaHoda())
				//	 && !Vistrel.timerVistrelV.isRunning()
			)
			{
				HodVrag.HodVragZamok();
				Dvigatel.setCiclDvigatelV(false);
				Dvigatel.setCiclDvigatelI(true);
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

			if (getNC()>=14 && getNC()<=41
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() >0)
			{
				HodVrag.HodVragPole();
			}

		}//end BOJ


	}









}/////////////////////////////

