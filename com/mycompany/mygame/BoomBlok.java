package com.mycompany.mygame;

public class BoomBlok extends Blok {

    static long tim1, tim2;

    //TODO START BOOM
    public static void StartBoomBlok(int nb) {
        tim1 = com.badlogic.gdx.utils.TimeUtils.millis() + 250;
        BlokList.get(nb).setTimerBoom(tim1);
        BlokList.get(nb).setKadrBoom(1);
        CircleBoom(nb);
    }


    //TODO cicl
    public static void CircleBoom(int nb) {
        tim2 = com.badlogic.gdx.utils.TimeUtils.millis();


        if (BlokList.get(nb).getTimerBoom() <= tim2) {
            if (BlokList.get(nb).getKadrBoom() > 0 && BlokList.get(nb).getKadrBoom() < 5) {

                BlokList.get(nb).setKadrBoom(BlokList.get(nb).getKadrBoom() + 1);
                BlokList.get(nb).setTimerBoom(tim1 + 250);

            }
        }

        if (BlokList.get(nb).getKadrBoom() >= 5) {
            BlokList.get(nb).setKadrBoom(0);
            BlokList.get(nb).setTimerBoom(0);
            WorkBlok.ObnulenieKvadratPole(nb);
        }
    }
}
