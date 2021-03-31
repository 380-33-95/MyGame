package com.mycompany.enemy;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;

public class Analiz extends Blok {

	////////////////////////////////////////
	public static int getTargetEnemy() {
		return TargetEnemy;
	}

	public static void setTargetEnemy(int targetEnemy) {
		TargetEnemy = targetEnemy;
	}

	private static int TargetEnemy;

	///////////////////////////////////////////
	public static boolean isMinaNaLine() {
		return MinaNaLine;
	}

	public static void setMinaNaLine(boolean minaNaLine) {
		MinaNaLine = minaNaLine;
	}

	private static boolean MinaNaLine;

	////////////////////////////////////////////

	public static int isMinaVZamke() {
		return MinaVZamke;
	}

	public static void setMinaVZamke(int minaVZamke) {
		MinaVZamke = minaVZamke;
	}

	private static int MinaVZamke;
	////////////////////////////////////////////////////////


	//////////////////////////////////////////////////
	

	/////////////////////////////////////////////////////
	public static int FindVeryForseBlok() {

		int gv = 0;

		int VeryForse = 0;

		for (Blok gh : BlokList.subList(1, 6)) {
			if (gh.getEffect() == 0
					&& gh.getForse() > VeryForse) {
				VeryForse = gh.getForse();
				gv = BlokList.indexOf(gh);
			}

			System.out.println("very forse= " + gv);
			if (VeryForse > 0) {
				ClickSelector.TouchPressed(gv);
			}

		}
		return gv;
	}

	////////////////////////////////////////////////////////
	public static int PoiskEnemy(int hud) {

		boolean sm = false;

		while (!sm && hud <= 76) {
			hud++;
			if (BlokListGet(hud).getStorona() == 1
					&& BlokListGet(hud).getEffect() == 0) {
				sm = true;
			}
		}

		if (!sm) {
			hud = 0;
		}

		System.out.println("Enemy " + hud);
		return hud;
	}

	//////////////////////////////////////////////////////
	public static boolean PererbrosVpole(int enemy) {

		boolean sm = false;

		int hup = enemy;

		if (enemy >= 14 && enemy <= 76) { //ishem kuda stavit naprotiv

			while (enemy >= 14) {
				enemy = enemy - 7;
			}

			if (BlokListGet(enemy).getIndex() == 0) //proverjem ne sanjat li kvadrat
			{
				ClickSelector.TouchPressed(enemy);
				System.out.println("perebros both v " + enemy);
			} else {
				System.out.println("kletka zanjata " + enemy);
				PoiskEnemy(hup+1);

			}
		}
		return sm;
	}

	//////////////////////////////////////////////////////////


	public static boolean PerebrosMina(int enemy) {

		System.out.println("Perebros mina");
		boolean sp = false;


		if (enemy >= 42 && enemy <= 76) {
			while (enemy >= 42) {
				enemy = enemy - 7;
			}
			if (BlokListGet(enemy).getIndex() == 0) {
				ClickSelector.TouchPressed(enemy);
				sp = true;
			} else {
				FindVeryForseBlok();
			}
		}


		if (enemy >= 14 && enemy <= 41) { //ishem kuda stavit naprotiv

			enemy = enemy - 7;

			if (BlokListGet(enemy).getIndex() == 0) {
				ClickSelector.TouchPressed(enemy);
				sp = true;
			} else {
				FindVeryForseBlok();
			}

		}
		return sp;
	}


	////////////////////////////////////////////
	public static boolean HodEffect() {
		System.out.println("hod effect");
		boolean he = false;
		boolean hv = false;

		int le = 0;
		int lv = 0;

		while (!he) {
			le++;
			if (BlokListGet(le).getEffect() >= 6 && BlokListGet(le).getEffect() <= 11) {
				he = true;
				ClickSelector.TouchPressed(le);
			}

		}
		while (!hv) {
			lv = MathUtils.random(14, 41);
			if (BlokListGet(lv).getIndex() == 0) {
				ClickSelector.TouchPressed(lv);
				hv = true;
			}
		}

		return he;
	}


	public static int FindEnemy(int start){
		
		int target=start-1;
		boolean tr=false;
		
		for(Blok qe:BlokList.subList(start,76)){
			target++;
		if(qe.getStorona()==1){
			tr=true;
		break;
		}
		
		}
		
		if(!tr){
			target=0;
		}
		return target;
	}
	
	
	///
}
