package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.BoomBlok;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;


public class DrawBoolet extends MyGdxGame {

	public static int massivBulet[][] = new int[83][4];

	public static int ciclMassivBulet = -1;

	public static boolean isVistrel() {
		return vistrel;
	}

	public static void setVistrel(boolean vistrel) {
		DrawBoolet.vistrel = vistrel;
	}

	private static boolean vistrel;

	public static boolean isScanerBulet() {
		return ScanerBulet;
	}

	public static void setScanerBulet(boolean scanerBulet) {
		ScanerBulet = scanerBulet;
	}

	private static boolean ScanerBulet;

	public static int ciclScaner;


	public static void StartDrawBulet() {

		if (isScanerBulet()) {

			ciclScaner = -1;

			for (int ns = 7; ns <= 76; ns++) {

				if (BlokList.get(ns).getStorona() == (Peremen.isSmenaHoda() ? 1 : 2) && BlokList.get(ns).isFlagBulet()) {
					ciclScaner++;
					massivBulet[ciclScaner][0] = BlokList.get(ns).getX();
					massivBulet[ciclScaner][1] = BlokList.get(ns).getY();
					massivBulet[ciclScaner][2] = ns;
					BlokList.get(ns).setFlagBulet(false);
					setVistrel(true);

					for(int nsv=ns;nsv<=77;nsv+=7){
				if(BlokList.get(nsv).getStorona()==1 && BlokList.get(nsv).getEffect()==0){
					massivBulet[ciclScaner][3]=nsv;
					System.out.println("Enemy"+nsv);
				}
					}

				}
				ciclMassivBulet = ciclScaner;
			}
			setScanerBulet(false);
		}



		if (isVistrel()) {

			if (ciclMassivBulet > -1 && ciclMassivBulet < 77) {



				massivBulet[ciclMassivBulet][1] = (Peremen.isSmenaHoda()) ? (int) (massivBulet[ciclMassivBulet][1] + (50 + Gdx.graphics.getDeltaTime())) : (int) (massivBulet[ciclMassivBulet][1] - (50 + Gdx.graphics.getDeltaTime()));
				TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
				batch.draw(BooletV,
						(Peremen.isSmenaHoda()) ? massivBulet[ciclMassivBulet][0] : massivBulet[ciclMassivBulet][0] + 100,
						massivBulet[ciclMassivBulet][1],
						1,
						1,
						WIDTH / 7,
						HEIGHT / 12,
						1,
						1,
						(Peremen.isSmenaHoda()) ? 0 : 180

				);



				if ((Peremen.isSmenaHoda()) ? massivBulet[ciclMassivBulet][1] >= 900 : massivBulet[ciclMassivBulet][1] <= 200) {
					ciclMassivBulet--;

					if (massivBulet[ciclScaner][3]>0){
						BlokList.get(massivBulet[ciclScaner][3]).setHealth(
								BlokList.get(massivBulet[ciclScaner][3]).getHealth()-1
						);
					}

					if (BlokList.get(massivBulet[ciclScaner][3]).getHealth()<=0){
						BoomBlok.StartBoomBlok(massivBulet[ciclScaner][3]);
					}


				//	FindBuletUron.StartScaner(massivBulet[ciclScaner][2]);

				}
			}


			if (ciclMassivBulet < 0) {

				setVistrel(false);




			}
		}


	}


}
