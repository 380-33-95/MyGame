package com.mycompany.tower;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import java.util.ArrayList;

import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;


public class TowerCanon extends MyGdxGame {

    private static Blok Tb;

    public static Blok getTb() {
        return TowerCanon.Tb;
    }

    public static void setTb(Blok tb) {
        TowerCanon.Tb = tb;
    }

//    public static int getCatetX() {
//        return catetX;
//    }
//
//    private static int catetX;
//
//    public static int getCatetY() {
//        return catetY;
//    }
//
//    private static int catetY;
//
//    static double gippotenusa;

    public static double getUgolSinI() {
        return ugolsinI;
    }

    private static double ugolsinI;
	
	
	public static double getUgolSinV() {
        return ugolsinV;
    }

    private static double ugolsinV;

    public static ArrayList<Blok> ListEnemyI = new ArrayList<>();
    public static ArrayList<Integer> HashListEnemyI = new ArrayList<>();

	public static ArrayList<Blok> ListEnemyV = new ArrayList<>();
    public static ArrayList<Integer> HashListEnemyV = new ArrayList<>();
	
	
	
    /////////////////////

    public static int getXtargetI() {
        return XtargetI;
    }

    public static void setXtargetI(int xtargetI) {
        XtargetI = xtargetI;
    }

    private static int XtargetI;

    public static int getYtargetI() {
        return YtargetI;
    }

    public static void setYtargetI(int ytargetI) {
        YtargetI = ytargetI;
    }

    private static int YtargetI;


    public static int getXtargetV() {
        return XtargetV;
    }

    public static void setXtargetV(int xtargetV) {
        XtargetV = xtargetV;
    }

    private static int XtargetV;

    public static int getYtargetV() {
        return YtargetV;
    }

    public static void setYtargetV(int ytargetV) {
        YtargetV = ytargetV;
    }

    private static int YtargetV;


    ////////////////////



    public static void MatricaEnemyI() {

        int kl;
        int po = 0;

        System.out.println("Scanning...");

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == 1 && en.getEffect() == 0) {
                ListEnemyI.add(po, en);
                HashListEnemyI.add(po, en.hashCode());
                ListEnemyI.get(po).setX(en.getX());
                ListEnemyI.get(po).setY(en.getY());
                po++;
            }
        }

        if (ListEnemyI.size() > 0) {
            System.out.println("List Enemy size = " + ListEnemyI.size() + (isSmenaHoda() ? " vrag" : " igrok"));

            kl = (MathUtils.random(0, ListEnemyI.size() - 1));
            System.out.println("****** " + kl);


            System.out.println("Target boat " + ListEnemyI.get(kl) +
                    " x=" + ListEnemyI.get(kl).getX() + " y=" + ListEnemyI.get(kl).getY());


		 CalculateV(kl);
		 
		 
        } else {
            ListEnemyI.clear();
        }
    }




    public static void CalculateV(int kl){

       int catetX= 50+ListEnemyI.get(kl).getX();
        int catetY= 50+HEIGHT-ListEnemyI.get(kl).getY();
       double gippotenusa= (sqrt(pow(catetX, 2) + (pow(catetY, 2))));

        setXtargetV(catetX);
        setYtargetV(HEIGHT-catetY+50);


        if (catetY > 0) {
            ugolsinV = toDegrees(asin(catetY/ gippotenusa));
        }

        System.out.printf("vrag x= %d y=%d gipotenusa= %f sinus=%f",
                catetX,catetY, gippotenusa, ugolsinV);
        System.out.println();
        ListEnemyI.clear();

    }
	
	
	public static void MatricaEnemyV() {

        int kl;
        int po = 0;

        System.out.println("Scanning...");

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == 2 && en.getEffect() == 0) {
                ListEnemyV.add(po, en);
                HashListEnemyV.add(po, en.hashCode());
                ListEnemyV.get(po).setX(en.getX());
                ListEnemyV.get(po).setY(en.getY());
                po++;
            }
        }

        if (ListEnemyV.size() > 0) {
            System.out.println("List Enemy size = " + ListEnemyV.size() + (isSmenaHoda() ? " vrag" : " igrok"));

            kl = (MathUtils.random(0, ListEnemyV.size() - 1));
            System.out.println("****** " + kl);


            System.out.println("Target boat " + ListEnemyV.get(kl) +
							   " x=" + ListEnemyV.get(kl).getX() + " y=" + ListEnemyV.get(kl).getY());



			CalculateI(kl);

        } else {
            ListEnemyV.clear();
        }
    }
	
	
	public static void CalculateI(int kl){
        int catetX= ListEnemyV.get(kl).getX();
        int catetY= ListEnemyV.get(kl).getY();
        double gippotenusa= (sqrt(pow(catetX+50, 2) + (pow(catetY+50, 2))));

        setXtargetI(catetX);
        setYtargetI(catetY);


        if (catetY > 0) {
            ugolsinI = toDegrees(asin(catetY/ gippotenusa));
        }

        System.out.printf("igrok x= %d y=%d gipotenusa= %f sinus=%f",
						  catetX,catetY, gippotenusa, ugolsinI);
        System.out.println();
        ListEnemyV.clear();

    }
    /////////////end class
}
