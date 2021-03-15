package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.draw.*;


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
	
	
	private static int tgfl;
	public static int getTgfl(){
		return tgfl;
	}
	
	
	
	
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
		int cv=0;
		setMinaVZamke(0);

		for (Blok hj : BlokList.subList(1, 6)) {
			cv++;
			if (hj.getIndex() == 6) {
				
				setMinaVZamke(cv);

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
		int gvw=0;

		int VeryForse = 0;

		for (Blok gh : BlokList.subList(1, 6)) {
			gv++;
			if (gh.getEffect() == 0
					&& gh.getForse() > VeryForse) {
				VeryForse = gh.getForse();
				gvw = gv;
			}

			System.out.println("very forse= " + gvw);
			if (VeryForse > 0) {
				ClickSelector.TouchPressed(gvw);
			}

		}
		return gvw;
	}

	////////////////////////////////////////////////////////

	public static void PerebrosVpole(int enemy) {

				ClickSelector.TouchPressed(enemy);
			
	}

	//////////////////////////////////////////////////////////
	
	


    public static int FindEnemy2(int start){

        int tgt=start-1;
        boolean tr=false;

        for(Blok qe:BlokList.subList(start,76)){
            tgt++;
            if(qe.getStorona()==1){
				target=tgt;
                tr=true;
				nj=target;
                break;
            }

        }

        if(!tr){
            tgt=0;
			target=0;
        }
        return tgt;
    }
	
	
	public static int VerefyFirstLine(int tgf){
		tgfl=tgf;
		if (tgfl>= 14 && tgfl <= 76) { //ishem kuda stavit naprotiv

			while (tgfl >= 14) {
				tgfl = tgfl - 7;
			}
			}
			if(BlokListGet(tgfl).getIndex()!=0){
				tgfl=0;
			}
			
			return getTgfl();
	}
	

	/////////////
}
