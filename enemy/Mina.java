package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.mygame.ClickSelector.TouchPressed;

public class Mina extends MyGdxGame {
//////////////////////////////////////////////
    private static int Mina;
    public static int getMina() {
        return Mina;
    }

    public static void setMina(int mina) {
        Mina = mina;
    }

//////////////////////////////////////////////////////////////////
    public static boolean isMinaNaLine() {
        return MinaNaLine;
    }

    public static void setMinaNaLine(boolean minaNaLine) {
        MinaNaLine = minaNaLine;
    }

    private static boolean MinaNaLine;
///////////////////////////////////////////////////////////////////

    public static int getPerebrosMina() {
        return PerebrosMina;
    }

    public static void setPerebrosMina(int perebrosMina) {
        PerebrosMina = perebrosMina;
    }

    private static int PerebrosMina;

////////////////////////////////////////////////////////////////



    public static int FindZamokMine() {
        int cv=0;
        setMina(0);

        for (Blok hj : BlokList.subList(1, 7))
        {
            cv++;
            if (hj.getIndex() == 6) {
                setMina(cv);
            }
        }

        if(getMina()>0)
        {
            TouchPressed(getMina());
        }

        return getMina();
    }


    public static boolean VerefyMinaOfKurs(int le) {

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

        return isMinaNaLine();
    }



    ////////////////////////////////////////////////////
    public static void VerefyFreeBlokForPerebrosMina(int enemy) {

        System.out.println("Perebros mina");

        if (enemy >= 42 && enemy <= 76) {
            System.out.println("target from PM"+enemy);
            while (enemy >= 42) {
                enemy = enemy - 7;
                System.out.println("enemy="+enemy);
            }
			if(BlokListGet(enemy).getIndex()==0){
				TouchPressed(enemy);
			}
        }


        if (enemy >= 14 && enemy <= 41) { //ishem kuda stavit naprotiv

            while (BlokListGet(enemy).getIndex() != 0) {
                enemy=enemy-7;
            }
            if(BlokListGet(enemy).getIndex()==0){
                setPerebrosMina(enemy);
                System.out.println("perebros mina redy? "+getPerebrosMina());
              //  Enemy.setTarget(enemy);
            }


        }

    }

    ///////////////////////////////////////


}
