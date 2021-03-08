package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;
import com.mycompany.mygame.MyGdxGame;


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
	
	
    public static int FindEnemy(int start){

        int tgt=start-1;
        boolean tr=false;

        for(Blok qe:BlokList.subList(start,76)){
            tgt++;
            if(qe.getStorona()==1){
				target=tgt;
                tr=true;
                break;
            }

        }

        if(!tr){
            tgt=0;
			target=0;
        }
        return tgt;
    }
	
	
	
	public static int FindZamokMine() {

		setMinaVZamke(0);

		for (Blok hj : BlokList.subList(1, 6)) {
			if (hj.getIndex() == 6) {
				setMinaVZamke(BlokList.indexOf(hj));

			}
		}

		System.out.println("find mina " + getMinaVZamke());
		
		return getMinaVZamke();
		
	}
	
	
	public static  boolean VerefyMinaOfKurs(int le) {

		setMinaNaLine(false);

		boolean gr = false;

		while (!gr && le >= 14) {
			le = le - 7;
			if (BlokListGet(le).getIndex() == 6) {
				gr = true;
				setMinaNaLine(true);
			}
		}

		System.out.println("Mina na line " + isMinaNaLine());
		
		return gr;
	}
	
	

	////////////////////////////////////////////////////
	public static boolean PerebrosMina(int enemy) {

		System.out.println("Perebros mina");
		boolean sp = false;


		if (enemy >= 42 && enemy <= 76) {
			System.out.println("target from PM"+enemy);
			while (enemy >= 42) {
				enemy = enemy - 7;
				System.out.println("enemy="+enemy);
			}
			if (BlokListGet(enemy).getIndex() == 0) {
				System.out.println("clicselector"+enemy);
				ClickSelector.TouchPressed(enemy);
				sp = true;
			} else {
				
			}
		}


		if (enemy >= 14 && enemy <= 41) { //ishem kuda stavit naprotiv

			enemy = enemy - 7;

			if (BlokListGet(enemy).getIndex() == 0) {
				ClickSelector.TouchPressed(enemy);
				sp = true;
			} else {
			
			}

		}
		return sp;
	}

	///////////////////////////////////////



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

	public static boolean PererbrosVpole(int enemy) {

		boolean sm = false;

		int hup = 0;

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
				StrategijFirstEnemy.Start(getTarget()+1);


			}
		}
		return sm;
	}

	//////////////////////////////////////////////////////////

	/////////////
}
