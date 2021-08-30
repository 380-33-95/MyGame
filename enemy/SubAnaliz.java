package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.mygame.ClickSelector.TouchPressed;


public class SubAnaliz extends MyGdxGame {
	////////////
	private static int target;
	public static void setTarget(int tr){
		target=tr;
	}
	public static int getTarget(){
		return target;
	}
	/////////
	
	public static int getMinaVZamke() {
		return MinaVZamke;
	}

	public static void setMinaVZamke(int minaVZamke) {
		MinaVZamke = minaVZamke;
	}

	private static int MinaVZamke;
	
	
	///////////////////////////////////////////
	public static boolean isMinaNaLine() {
		return MinaNaLine;
	}

	public static void setMinaNaLine(boolean minaNaLine) {
		MinaNaLine = minaNaLine;
	}

	private static boolean MinaNaLine;
	/////////////////////
	
	private static int nj;
	public static int getBlok(){
		return nj;
	}

	public static int getPerebrosMina() {
		return PerebrosMina;
	}

	public static void setPerebrosMina(int perebrosMina) {
		PerebrosMina = perebrosMina;
	}

	private static int PerebrosMina;


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
	

	
	
	
	public static int FindZamokMine() {
		int cv=0;
		setMinaVZamke(0);

		for (Blok hj : BlokList.subList(1, 7))
		{
			cv++;
			if (hj.getIndex() == 6) {
				setMinaVZamke(cv);
			}
		}

		if(getMinaVZamke()>0)
		{
			TouchPressed(getMinaVZamke());
		}

		System.out.println("find mina #" + getMinaVZamke());
		return getMinaVZamke();
	}
	
	
	public static  void VerefyMinaOfKurs(int le) {

		setMinaNaLine(false);

		boolean gr = false;

		while (!gr && le >= 14) {
			le = le - 7;
			if (BlokListGet(le).getIndex() == 6) {
				gr = true;
				setMinaNaLine(true);
				System.out.println("Mina na line " + isMinaNaLine());
			}
		}
	}
	
	

	////////////////////////////////////////////////////
	public static void VerfyFreeBlokForPerebrosMina(int enemy) {

		System.out.println("Perebros mina");

		if (enemy >= 42 && enemy <= 76) {
			System.out.println("target from PM"+enemy);
			while (enemy >= 42) {
				enemy = enemy - 7;
				System.out.println("enemy="+enemy);
			}
		}


		if (enemy >= 14 && enemy <= 41) { //ishem kuda stavit naprotiv

			while (BlokListGet(enemy).getIndex() != 0) {
				enemy=enemy-7;
			}
			if(BlokListGet(enemy).getIndex()==0){
				setPerebrosMina(enemy);
				System.out.println("perebros mina redy? "+getPerebrosMina());
				setTarget(enemy);
			}


		}

	}

	///////////////////////////////////////




	


    public static int FindEnemy(int start){

        int tgt=start-1;
        boolean tr=false;

        for(Blok qe:BlokList.subList(start,77)){
            tgt++;

            if(qe.getStorona()==1 && qe.getEffect()==0){
				target=tgt;
                tr=true;
				nj=target;
				//TouchPressed(target);
				break;
            }

        }

        if(!tr){
            tgt=0;
			target=0;
        }

		System.out.println("find enemy #"+getTarget());
        return getTarget();

	}


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

	public static void PerebrosVpole(int tgt) {

		TouchPressed(tgt);
		TouchPressed(UniversalVerifyBlokPole(getTarget(),0));
		System.out.println("perebros #"+tgt+" -> "+getResultUFB());

	}

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
