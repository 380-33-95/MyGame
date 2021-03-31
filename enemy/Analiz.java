package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.ClickSelector;

public class Analiz extends Blok {

	///////////
	private static int target;
	public static void setTarget(int tr){
		target=tr;
	}
	public static int getTarget(){
		return target;
	}


	private static int nj;
	public static int getBlok(){
		return nj;
	}



	////////////////////////////////////////////////
	public static int getIndexZamok() {
		return IndexZamok;
	}

	public static void setIndexZamok(int indexZamok) {
		IndexZamok = indexZamok;
	}

	private static int IndexZamok;


	public static boolean isIndexToLine() {
		return IndexToLine;
	}

	public static void setIndexToLine(boolean indexToLine) {
		IndexToLine = indexToLine;
	}

	private static boolean IndexToLine;


	public static int getTargetForPerebros() {
		return TargetForPerebros;
	}

	public static void setTargetForPerebros(int targetForPerebros) {
		TargetForPerebros = targetForPerebros;
	}

	private static int TargetForPerebros;



	public static int getEnemyBoat() {
		return EnemyBoat;
	}

	public static void setEnemyBoat(int enemyBoat) {
		EnemyBoat = enemyBoat;
	}

	private static int EnemyBoat;


	//////////////////////////////////////////////////////////////


	public static void FindEnemy(int start){

		int tgt=start-1;
		boolean tr=false;

		for(Blok qe:BlokList.subList(start,76)){
			tgt++;
			if(qe.getStorona()==1 && qe.getEffect()==0){
				target=tgt;
				tr=true;
				nj=target;
				ClickSelector.TouchPressed(target);
				break;
			}

		}

		if(!tr){
			tgt=0;
			target=0;
		}
		System.out.println("target"+getTarget());

	}


	public static void FindZamok(int index) {

		int cv=0;
		setIndexZamok(0);

		for (Blok hj : BlokList.subList(1, 6)) {
			cv++;
			if (hj.getIndex() == index) {
				setIndexZamok(cv);
			}
		}

		if(getIndexZamok()>0){
			ClickSelector.TouchPressed(getIndexZamok());
			System.out.println("find index="+index +" kletka #"+ getIndexZamok());
		}
	}


	public static  void VerefyOfKurs(int le, int index) {

		setIndexToLine(false);

		boolean gr = false;

		while (!gr && le >= 14) {
			le = le - 7;
			if (BlokListGet(le).getIndex() == index) {
				gr = true;
				setIndexToLine(true);
				System.out.println("Index na line " + isIndexToLine());
			}
		}
	}


	public static void VerefyFreeBlokForPerebros(int enemy) {

		System.out.println("Perebros index");

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
				setTargetForPerebros(enemy);
				System.out.println("perebros index redy? "+getTargetForPerebros());
				setTarget(enemy);
			}

		}

	}


	public static void FindVeryForseBlok() {

		int gv = 0;
		int VeryForse = 0;

		for (Blok gh : BlokList.subList(1, 6))
		{
			gv++;
			if (gh.getEffect() == 0
					&& gh.getForse() > VeryForse)
			{
				VeryForse = gh.getForse();
				setEnemyBoat(gv);
			}
		}

		if (getEnemyBoat() > 0)
		{
			System.out.println("very forse= " + getEnemyBoat());
		}

	}


	public static void VerefyBlokForLoadEnemyBoat(int mesto){

		while (mesto>13)
		{
			mesto=mesto-7;
		}

		if (BlokListGet(mesto).getIndex()==0)
		{
			setTargetForPerebros(mesto);
		}
		else {
				setTargetForPerebros(0);
				}

	}


	public static void PerebrosVpole(int tgt) {

		ClickSelector.TouchPressed(tgt);

	}

	///
}
