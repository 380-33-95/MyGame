package com.mycompany.mygame;

import com.badlogic.gdx.audio.Music;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMusik {

    ////////////// sound servic
    public static Music sastavka;
    public static Music boj;//
    public static Music finishBoj;//
    public static Music smenaHoda;//

    ///////////// sound bulet
//    public static Music buletTank;//
//    public static Music buletStrelok;//
//    public static Music buletRaket;//
//    public static Music buletMinomet;//
//    public static Music buletCanon;//

    public static Music buletBoth;

    ///////////// sound start v pole
//    public static Music StartTank;
//    public static Music StartStrelok;
//    public static Music StartRaket;
//    public static Music StartMinomet;
    public static Music StartEffect;
//    public static Music StartStena;
//    public static Music StartCanon;

    public static Music startBoth;
    public static Music startMine;

    ///////////// sound deathUnit
//    public static Music deathTank;//deathTank
//    public static Music deathStrelok; //
//    public static Music deathRaket;//
//    public static Music deathMinomet;//
    public static Music deathEffect;
//    public static Music deathCanon;//deathTank

    public static Music deathBoth;//

    ///////////// sound stolknovenie
    public static Music stolknovenieBoth;//
    public static Music uronZamok;//


    ///////////// sound moovUnit
//    public static Music moovTank;//
//    public static Music moovStrelok;//
//    public static Music moovRaket;//strelok
//    public static Music moovMinomet;//strelok
//    public static Music moovCanon;//tank

    public static Music moovBoth;


    //////////////////////////////

    {
//        startSastavka = Gdx.audio.newMusic(Gdx.files.internal("data/jump.wav"));
//        MapSound.put("start", startSastavka);

//        buletTank = Gdx.audio.newMusic(Gdx.files.internal("data/jump.wav"));
//        MapSound.put("buletTank", buletTank);

    }


    public static Map<String, Music> MapSound = new Map<String, Music>() {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object o) {
            return false;
        }

        @Override
        public boolean containsValue(Object o) {
            return false;
        }

        @Override
        public Music get(Object o) {
            return null;
        }

        @Override
        public Music put(String s, Music music) {
            return null;
        }

        @Override
        public Music remove(Object o) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Music> map) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Music> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Music>> entrySet() {
            return null;
        }


    };


    public static void PleyMusik() {

    }

}
