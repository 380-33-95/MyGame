package com.mycompany.tower;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.BoomBlok;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.WorkBlok;

import java.util.ArrayList;

import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;


public class TowerCanon extends MyGdxGame {

   
    public static double getUgolSinI() {
        return ugolsinI;
    }

    private static double ugolsinI;
	
	
	public static double getUgolSinV() {
        return ugolsinV;
    }

    private static double ugolsinV;
	
	private static double gippotenI;
	public static double getGippotenI(){
		return gippotenI;
	}
	public static void setGippotenI(double gh){
		gippotenI=gh;
	}
	
	
	private static double gippotenV;
	public static double getGippotenV(){
		return gippotenV;
	}
	public static void setGippotenV(double fg){
		gippotenV=fg;
	}

    public static ArrayList<Blok> ListEnemyI = new ArrayList<>();
  //  public static ArrayList<Integer> HashListEnemyI = new ArrayList<>();

	public static ArrayList<Blok> ListEnemyV = new ArrayList<>();
 //   public static ArrayList<Integer> HashListEnemyV = new ArrayList<>();
	
	
	
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
		int mk;
	    int po = 0;

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == 1 && en.getEffect() == 0) {
                ListEnemyI.add(po, en);
                ListEnemyI.get(po).setX(en.getX());
                ListEnemyI.get(po).setY(en.getY());
                po++;
            }
        }

        if (ListEnemyI.size() > 0) {
            
            kl = (MathUtils.random(0, ListEnemyI.size() - 1));

			mk=  WorkBlok.RetranslateBlok(ListEnemyI.get(kl).getX(),
										  ListEnemyI.get(kl).getY());
			BlokListGet(mk).setHealth(
				BlokListGet(mk).getHealth()-2);

			if(BlokListGet(mk).getHealth()<=0){
				BoomBlok.StartBoomBlok(mk);
			}

		 CalculateV(kl);
		  
        } else {
            ListEnemyI.clear();
        }
    }




    public static void CalculateV(int kl){
       int catetX=ListEnemyI.get(kl).getX();
       int catetY=1+ HEIGHT-ListEnemyI.get(kl).getY()-100;
       gippotenV= (sqrt(pow(catetX, 2) + (pow(catetY, 2))));
       setXtargetV(catetX+50);
       setYtargetV(HEIGHT-catetY-100);
       ugolsinV = toDegrees(asin(catetY/ gippotenV));
       ListEnemyI.clear();
    }
	
	
	public static void MatricaEnemyV() {

        int kl;
		int ms;
        int po = 0;

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == 2 && en.getEffect() == 0) {
                ListEnemyV.add(po, en);
                ListEnemyV.get(po).setX(en.getX());
                ListEnemyV.get(po).setY(en.getY());
                po++;
            }
        }

        if (ListEnemyV.size() > 0) {

            kl = (MathUtils.random(0, ListEnemyV.size() - 1));

          ms=  WorkBlok.RetranslateBlok(ListEnemyV.get(kl).getX(),
                    ListEnemyV.get(kl).getY());
           BlokListGet(ms).setHealth(
		   BlokListGet(ms).getHealth()-2);
		   
		   if(BlokListGet(ms).getHealth()<=0){
			   BoomBlok.StartBoomBlok(ms);
		   }

			CalculateI(kl);

        } else {
            ListEnemyV.clear();
        }
    }
	
	
	public static void CalculateI(int kl){
        int catetX= ListEnemyV.get(kl).getX();
        int catetY=1+ ListEnemyV.get(kl).getY();
        gippotenI= (sqrt(pow(catetX, 2) + (pow(catetY, 2))));
        setXtargetI(catetX);
        setYtargetI(catetY);
        ugolsinI = toDegrees(asin(catetY/ gippotenI));
        ListEnemyV.clear();

    }
	
	
	
	
    /////////////end class
}
