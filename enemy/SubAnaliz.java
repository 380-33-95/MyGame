package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.mygame.ClickSelector.TouchPressed;


public class SubAnaliz extends MyGdxGame {

	
	public static int getMinaVZamke() {
		return MinaVZamke;
	}

	public static void setMinaVZamke(int minaVZamke) {
		MinaVZamke = minaVZamke;
	}

	private static int MinaVZamke;
	
	
	///////////////////////////////////////////

	/////////////////////
	
	private static int nj;
	public static int getBlok(){
		return nj;
	}




	public static int getEnemyBoat() {
		return EnemyBoat;
	}

	public static void setEnemyBoat(int enemyBoat) {
		EnemyBoat = enemyBoat;
	}

	private static int EnemyBoat;


	public static int getRif() {
		return Rif;
	}

	public static void setRif(int rif) {
		Rif = rif;
	}

	private static int Rif;


	public static boolean isRifNaKurse() {
		return RifNaKurse;
	}

	public static void setRifNaKurse(boolean rifNaKurse) {
		RifNaKurse = rifNaKurse;
	}

	private static boolean RifNaKurse;


	public static int getResultUFB() {
		return resultUFB;
	}

	public static void setResultUFB(int resultUFB) {
		SubAnaliz.resultUFB = resultUFB;
	}

	private static int resultUFB;
	

	
	
	



	////////////////////////////////////////////////////


	///////////////////////////////////////




	





	public static int FindZamokRif() {
		int cv=0;
		setRif(0);

		for (Blok hj : BlokList.subList(1, 6)) {
			cv++;
			if (hj.getIndex() == 11) {
				setRif(cv);
			}
		}

		if(getRif()>0){
			TouchPressed(getRif());

		}
		System.out.println("find rif #" + getRif());
		return getRif();
	}


	public static void VerefyRifOfKurs(int le) {

		setRifNaKurse(false);

		boolean gr = false;

		while (!gr && le >= 14) {
			le = le - 7;
			if (BlokListGet(le).getIndex() == 11) {
				gr = true;
				setRifNaKurse(true);
				System.out.println("Rif na line " + isRifNaKurse());
			}
		}
	}


	////////////////////////////////////////////////////////



	public static int UniversalVerifyBlokPole(int rd, int ikd){
				boolean gr = false;
				if (ikd==0)
				{
					while (rd>13){
						rd=rd-7;
					}
					gr=true;
					setResultUFB(0);
				}
		else {
					while (!gr && rd > 13) {
						rd = rd - 7;
						System.out.println(rd);
						if (BlokListGet(rd).getIndex() == ikd) {
							gr = true;
								setResultUFB(rd);

						}
					}
				}


		System.out.println("Iskomoe "+ikd +" -># " + rd);
		return getResultUFB();
	}




	//////////////////////////////////////////////////////////

	/////////////
}
