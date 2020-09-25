package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;

public class BooletBlok extends Blok {

    static long timb1, timb2;

    //TODO START BOOLET
    public static void StartBooletBlok(int nb) {
        timb1 = com.badlogic.gdx.utils.TimeUtils.millis() + 250;
        BlokList.get(nb).setTimerBoolet(timb1);
        BlokList.get(nb).setBooletY(Blok.BlokList.get(nb).getY());
        MyGdxGame.setFlagBoolet(true);
        CircleBoolet(nb);
    }


    //TODO cicl
    public static void CircleBoolet(int nb) {

        Gdx.app.log("6) ", "CircleBoolet(" + Dvigatel.startV + ")");
        timb2 = com.badlogic.gdx.utils.TimeUtils.millis();


        if (BlokList.get(nb).getTimerBoolet() <= timb2) {
            if (BlokList.get(nb).getBooletY() > 0 && BlokList.get(nb).getBooletY() < 1200) {

                BlokList.get(nb).setBooletY(BlokList.get(nb).getBooletY() - 100);
                //    BlokList.get(nb).setTimerBoolet(timb1 + 250);

            }
        }

        if (BlokList.get(nb).getBooletY() >= 1200) {
            BlokList.get(nb).setBooletY(0);
            BlokList.get(nb).setTimerBoolet(0);
            MyGdxGame.setFlagBoolet(false);

        }
    }

}
