package com.mycompany.mygame;

import com.mycompany.draw.DrawBoolet;

public class VistrelVrag extends Blok {

    public static void StartVistrelVrag(int nc) {

        nc++;
        System.out.println("->" + nc);

        if (BlokList.get(nc).isFlagBulet()) {
            DrawBoolet.DrawCiclBoolet(nc);
        }

        CiclVistrelVrag(nc);

    }

    public static void CiclVistrelVrag(int nc) {

        if (nc <= 76) {

            StartVistrelVrag(nc);
        } else {
            MyGdxGame.setNextBlok(0);
        }

    }

}
