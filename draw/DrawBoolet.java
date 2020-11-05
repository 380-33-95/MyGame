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

			for (int ib = 7; ib <= 76; ib++) {

				if (BlokList.get(ib).getStorona() == (Peremen.isSmenaHoda()
						? 1 : 2) && BlokList.get(ib).isFlagBulet()) {
					ciclScaner++;
					massivBulet[ciclScaner][0] = BlokList.get(ib).getX();
					massivBulet[ciclScaner][1] = BlokList.get(ib).getY();
					massivBulet[ciclScaner][2] = ib;
					BlokList.get(ib).setFlagBulet(false);
					setVistrel(true);

					if (BlokList.get(ib).getStorona() == 2) {

						for (int aq = ib; aq <= 77; aq += 7) {
							System.out.println(".." + aq);
							if (BlokList.get(aq).getStorona() == 1
									&& BlokList.get(aq).getEffect() == 0) {
								massivBulet[ciclScaner][3] = aq;

								System.out.println(massivBulet[ciclScaner][3]);
								BlokList.get(aq).setHealth(
										BlokList.get(aq).getHealth() -
												BlokList.get(ib).getForse()
								);
								if (BlokList.get(aq).getHealth() <= 0) {
									BoomBlok.StartBoomBlok(aq);
								}
							}
						}

					}

//							if(BlokList.get(ib).getStorona()==1)
//								{
//
//								for(int aq=ib; aq>=7; aq-=7){
//									if(BlokList.get(aq).getStorona()==2
//									   && BlokList.get(aq).getEffect()==0)
//									{
//										massivBulet[ciclScaner][3]=aq;
//									}
//								}
//
//							}
				}
				ciclMassivBulet = ciclScaner;
			}
			setScanerBulet(false);
		}


		if (isVistrel()) {

			if (ciclMassivBulet > -1 && ciclMassivBulet < 77) {

				massivBulet[ciclMassivBulet][1] = (Peremen.isSmenaHoda())
						? (int) (massivBulet[ciclMassivBulet][1] + (50 + Gdx.graphics.getDeltaTime()))
						: (int) (massivBulet[ciclMassivBulet][1] - (50 + Gdx.graphics.getDeltaTime()));
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

				if ((Peremen.isSmenaHoda()) ?
						massivBulet[ciclMassivBulet][1] >= BlokList.get(massivBulet[ciclMassivBulet][3]).getY() :
						massivBulet[ciclMassivBulet][1] <= BlokList.get(massivBulet[ciclMassivBulet][3]).getY()) {
					ciclMassivBulet--;

					//FindBuletUron.StartScaner(massivBulet[ciclScaner][2]);

				}

//				else {
//
//					BlokList.get(massivBulet[ciclMassivBulet][3]).setHealth(
//							BlokList.get(massivBulet[ciclMassivBulet][3]).getHealth() -
//									BlokList.get(massivBulet[ciclMassivBulet][2]).getForse());
//
//					if (BlokList.get(massivBulet[ciclMassivBulet][3]).getHealth() <= 0) {
//						BoomBlok.StartBoomBlok(massivBulet[ciclMassivBulet][3]);
//					}
//
//				}


				if (ciclMassivBulet < 0) {
					setVistrel(false);
				}
			}


		}


	}
}
