package com.mycompany.mygame;

public class VistrelVrag extends Blok {

    public static void StartVistrelVrag(int nc) {

        nc++;


        if (BlokList.get(nc).getStorona() == 2 && BlokList.get(nc).isFlagBulet()) {

            System.out.println("->" + nc);
            MyGdxGame.setNextBlok(nc);

//            while (BlokList.get(nc).isFlagBulet()) {
//
//
//
//            }
        }

        CiclVistrelVrag(nc);

    }

    public static void CiclVistrelVrag(int nc) {

        if (nc <= 76) {

            StartVistrelVrag(nc);
        } else {
            HodVrag.HodVragZamok();
        }

    }

}
