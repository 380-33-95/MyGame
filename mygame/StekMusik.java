package com.mycompany.mygame;

import java.util.Vector;

import static com.mycompany.mygame.MyMusik.MapSound;

public class StekMusik {


    public static Vector<Integer> PlayList = new Vector<Integer>();


    public static void PlayStekMusik() {

        boolean im = false;


        while (PlayList.size() > 0) {

            MapSound.get(PlayList.get(0)).play();

            MapSound.get(PlayList.firstElement()).play();

            im = MapSound.get(PlayList.firstElement()).isPlaying();
            while (im) {

            }

            PlayList.remove(0);
        }


    }

}
