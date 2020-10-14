package com.mycompany.mygame;

import com.badlogic.gdx.utils.Timer;

public class GameEnd {


    public static Timer.Task pausaEnd = new Timer.Task() {

        @Override
        public void run() {
            Peremen.setStatusMenu(2);
            StartNoviStart();
        }
    };

    public static void StartPausaEnd() {

        Timer.schedule(pausaEnd, 3f, 0f, 0);

    }

    public static Timer.Task noviStart = new Timer.Task() {

        @Override
        public void run() {
            // TODO: Implement this method
            ClearAll.StartClearAll();


        }
    };


    public static void StartNoviStart() {
        Timer.schedule(noviStart, 5f);
    }

}
