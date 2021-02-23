package com.mycompany.mygame;


public class ClickSelector extends MyGdxGame{


	public static void TouchPressed(int nc) {

setNC(nc);

		if (getStatusMenu() == 2) { //BOJ

			//////////////////////////////////////////////////////////////////////////////////////hod igroka

			if ((getNC() >= 78 && getNC() <= 83)
                    && isSmenaHoda()

			) {
				HodIgrok.HodIgrokZamok();
			}

			if (getNC() >= 70 && getNC() <= 76
					& bufer.getIndex() > 0
					& BlokList.get(getNC()).getIndex() == 0
					& bufer.getEffect() == 0
					& bufer.getStorona()==1

            )
			{
					HodIgrok.HodIgrokPole();
			}

			if (getNC()>=42 && getNC()<=69
					&& bufer.getIndex() > 0
					&& BlokList.get(getNC()).getIndex() == 0
					&& bufer.getEffect() >0
					&& bufer.getStorona()==1
			)
			{
					HodIgrok.HodIgrokPole();
			}


			/////////////////////////////////////////////////////////////////////hod vrag


			if ((getNC() >= 1 && getNC() <= 6)
                    && (!isSmenaHoda())

            ) {
           //     System.out.println("HodVrag.HodVragZamok();");
                HodVrag.HodVragZamok();
            }

			if (getNC() >= 7 && getNC() <= 13
                    && bufer.getIndex() > 0
                    && BlokList.get(getNC()).getIndex() == 0
                    && bufer.getEffect() == 0
                    && bufer.getStorona() == 2

            ) { //pered boj vrag
                HodVrag.HodVragPole();
            }

            if (getNC() >= 14 && getNC() <= 41
                    && bufer.getIndex() > 0
                    && BlokList.get(getNC()).getIndex() == 0
                    && bufer.getEffect() > 0
                    && bufer.getStorona() == 2) {
                HodVrag.HodVragPole();
            }

        }//end BOJ

		if (getStatusMenu() == 3) {
			if (getNC() > 0) {
				setStatusMenu(0);
				ClearStart.NewStart();
			}
		}


    }









}/////////////////////////////

