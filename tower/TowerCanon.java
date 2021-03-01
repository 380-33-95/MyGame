package com.mycompany.tower;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.draw.DrawTarget;
import com.mycompany.draw.DrawTower;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import java.util.ArrayList;

import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
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

    public static int getCatetX() {
        return catetX;
    }

    private static int catetX;

    public static int getCatetY() {
        return catetY;
    }

    private static int catetY;

    static double gippotenusaV;

    public static double getUgolSin() {
        return ugolsin;
    }

    private static double ugolsin;

    public static ArrayList<Blok> ListEnemy = new ArrayList<>();
    public static ArrayList<Integer> HashListEnemy = new ArrayList<>();


    /////////////////////

    public static int getXtarget() {
        return Xtarget;
    }

    public static void setXtarget(int xtarget) {
        Xtarget = xtarget;
    }

    private static int Xtarget;

    public static int getYtarget() {
        return Ytarget;
    }

    public static void setYtarget(int ytarget) {
        Ytarget = ytarget;
    }

    private static int Ytarget;


    ////////////////////



    public static void MatricaEnemy() {

        int kl;
        int po = 0;

        System.out.println("Scanning...");

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == (isSmenaHoda() ? 1 : 2) && en.getEffect() == 0) {
                ListEnemy.add(po, en);
                HashListEnemy.add(po, en.hashCode());
                ListEnemy.get(po).setX(en.getX());
                ListEnemy.get(po).setY(en.getY());
                po++;
            }
        }

        if (ListEnemy.size() > 0) {
            System.out.println("List Enemy size = " + ListEnemy.size() + (isSmenaHoda() ? " vrag" : " igrok"));

            kl = (MathUtils.random(0, ListEnemy.size() - 1));
            System.out.println("****** " + kl);


            System.out.println("Target boat " + ListEnemy.get(kl) +
                    " x=" + ListEnemy.get(kl).getX() + " y=" + ListEnemy.get(kl).getY());



            Calculate(kl);
        } else {
            ListEnemy.clear();
        }
    }




    public static void Calculate(int kl){

        catetX= 50+ListEnemy.get(kl).getX();
        catetY= 50+ListEnemy.get(kl).getY();
        gippotenusaV= (sqrt(pow(catetX, 2) + (pow(catetY, 2))));

        setXtarget(catetX);
        setYtarget(catetY);


        if (catetY > 0) {
            ugolsin = toDegrees(asin(catetY/ gippotenusaV));
        }

        System.out.printf("x= %d y=%d gipotenusa= %f sinus=%f",
                getCatetX(),getCatetY(), gippotenusaV, ugolsin);
        System.out.println();
        ListEnemy.clear();

    }

    /////////////end class
}
