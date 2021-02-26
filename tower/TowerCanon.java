package com.mycompany.tower;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.draw.DrawTarget;
import com.mycompany.draw.DrawTower;
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


    public static int getVert() {
        return Vert;
    }

    public static void setVert(int vert) {
        Vert = vert;
    }

    private static int Vert;

    public static int getHoriz() {
        return Horiz;
    }

    public static void setHoriz(int horiz) {
        Horiz = horiz;
    }

    private static int Horiz;

    public static double getGippotenusa() {
        return Gippotenusa;
    }

    public static void setGipotenusa(double gippotenusa) {
        Gippotenusa = gippotenusa;
    }

    private static double Gippotenusa;

    public static float getAlfa() {
        return (float) Alfa;
    }

    public static void setAlfa(double alfa) {
        Alfa = alfa;
    }

    private static double Alfa;

    public static ArrayList<Blok> ListEnemy = new ArrayList<>();
    public static ArrayList<Integer> HashListEnemy = new ArrayList<>();



    ///////////////////

    public static int getXtarget() {
        return Xtarget;
    }

    public static void setXtarget(int xtarget) {
        Xtarget = xtarget;
    }

    private static int Xtarget;

    public static int getYTareget() {
        return YTareget;
    }

    public static void setYTareget(int YTareget) {
        TowerCanon.YTareget = YTareget;
    }

    private static int YTareget;

    ////////////////////


    public static void MatricaEnemy() {

        int kl;
        int po = 0;

        System.out.println("Scanning...");

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == (isSmenaHoda() ? 2 : 1) && en.getEffect() == 0) {
                ListEnemy.add(po, en);
                HashListEnemy.add(po, en.hashCode());
                ListEnemy.get(po).setX(en.getX());
                ListEnemy.get(po).setY(en.getY());
                po++;
            }
        }

        po = 0;

        if (ListEnemy.size() > 0) {
            System.out.println("List Enemy size = " + ListEnemy.size() + (isSmenaHoda() ? " vrag" : " igrok"));

            kl = (MathUtils.random(0, ListEnemy.size() - 1));
            System.out.println("******" + kl);


            System.out.println("Target boat " + ListEnemy.get(kl) +
                    " x=" + ListEnemy.get(kl).getX() + " y=" + ListEnemy.get(kl).getY());


        //    CalculateU(kl);
            SinusV.Calculate(kl);
        } else {
            ListEnemy.clear();
        }
    }

    public static void CalculateU(int kl) {
        Alfa = 0;
        setVert(ListEnemy.get(kl).getY());
        setHoriz(ListEnemy.get(kl).getX());

        setXtarget(getHoriz());
        setYTareget(getVert());



        ListEnemy.clear();

        setGipotenusa(sqrt(pow(getVert(), 2) + pow(getHoriz(), 2)));

        if (getVert() > 0) {
            Alfa = (toDegrees(asin(getVert() / getGippotenusa())));
            System.out.println("alfa=" + Alfa);
        }
        //   setAlfa(toDegrees(getAlfa()));
        System.out.println("UgolA = " + Alfa);


      //      DrawTower.StartDrawTowerI((float) Alfa+180);

    }


    /////////////end class
}
