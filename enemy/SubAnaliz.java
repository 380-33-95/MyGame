package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;
import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.ClickSelector;


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

		//int nomMine = 0;

		for (Blok hj : BlokList.subList(1, 6)) {
			if (hj.getIndex() == 6) {
				setMinaVZamke(BlokList.indexOf(hj));
				//nomMine = BlokList.indexOf(hj);
				//setMinaVZamke(nomMine);
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
			while (enemy >= 42) {
				enemy = enemy - 7;
			}
			if (BlokListGet(enemy).getIndex() == 0) {
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
	
	/////////////
}
