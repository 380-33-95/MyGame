package com.mycompany.tower;

import com.badlogic.gdx.math.MathUtils;
import com.mycompany.mygame.Blok;

import java.util.ArrayList;

import static com.mycompany.mygame.Blok.BlokList;
import static com.mycompany.mygame.MyGdxGame.isSmenaHoda;
import static com.mycompany.tower.TowerCanon.getTb;
import static com.mycompany.tower.TowerCanon.setTb;
//import static com.mycompany.tower.TowerCanon.tb;


public class CalculateUgol {

    public static int getLeftSide() {
        return LeftSide;
    }

    public static void setLeftSide(int leftSide) {
        LeftSide = leftSide;
    }

    private static int LeftSide;

    public static int getRightSide() {
        return RightSide;
    }

    public static void setRightSide(int rightSide) {
        RightSide = rightSide;
    }

    private static int RightSide;

    public static int getAlfa() {
        return Alfa;
    }

    public static void setAlfa(int alfa) {
        Alfa = alfa;
    }

    private static int Alfa;

    public static int getBetta() {
        return Betta;
    }

    public static void setBetta(int betta) {
        Betta = betta;
    }

    private static int Betta;

    public static int getGamma() {
        return Gamma;
    }

    public static void setGamma(int gamma) {
        Gamma = gamma;
    }

    private static int Gamma;


    public static ArrayList<Blok> ListEnemy = new ArrayList<>();


    public static void MatricaEnemy() {

        System.out.println("Scanning...");

        for (Blok en : BlokList.subList(7, 76)) {
            if (en.getStorona() == (isSmenaHoda() ? 2 : 1) && en.getEffect() == 0) {
                ListEnemy.add(en);
            }
        }

        System.out.println("List Enemy size = " + ListEnemy.size() + (isSmenaHoda() ? " vrag" : " igrok"));

        setTb(BlokList.get(MathUtils.random(0, ListEnemy.size())));
        System.out.println("Target boat " + getTb());


        ListEnemy.clear();

    }

    public static void CalculateU() {

        StoronaC = Math.sqrt(Math.pow(StoronaA, 2) + Math.pow(StoronaB, 2));
        System.out.println("StoronaC = " + StoronaC);

        UgolA = Math.asin(StoronaA / StoronaC);
        UgolA = Math.toDegrees(UgolA);
        System.out.println("UgolA = " + UgolA);

    }


}
