package com.mycompany.mygame;

public class BoomBlok extends Blok {


    //TODO START BOOM
    public static void StartBoomBlok(int nb) {
        BlokList.get(nb).setTimerBoom(com.badlogic.gdx.utils.TimeUtils.millis() * 250);
        BlokList.get(nb).setKadrBoom(1);
    }


    //TODO cicl
    public static void CircleBoom(int nb) {
        if (BlokList.get(nb).getKadrBoom() < 5 && BlokList.get(nb).getKadrBoom() > 0) {
            if (BlokList.get(nb).getTimerBoom() <= com.badlogic.gdx.utils.TimeUtils.millis()) {
                BlokList.get(nb).setKadrBoom(BlokList.get(nb).getKadrBoom() + 1);
                BlokList.get(nb).setTimerBoom(com.badlogic.gdx.utils.TimeUtils.millis() * 250);
            }
        } else {
            BlokList.get(nb).setKadrBoom(0);
            BlokList.get(nb).setTimerBoom(0);
        }
    }
}
