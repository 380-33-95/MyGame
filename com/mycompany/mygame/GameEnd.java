package com.mycompany.mygame;

import draw.DrawEnd;

public class GameEnd extends Blok {
    static long timend1, timend2;

    //TODO START BOOM
    public static void StartEndGame() {
        timend1 = com.badlogic.gdx.utils.TimeUtils.millis() + 500;

        CircleEnd();
    }


    //TODO cicl
    public static void CircleEnd() {
        timend2 = com.badlogic.gdx.utils.TimeUtils.millis();


        if (timend1 <= timend2) {
            MyGdxGame.setStatusMenu(2);
            DrawEnd.RrawEndGame();
        }
    }
}
