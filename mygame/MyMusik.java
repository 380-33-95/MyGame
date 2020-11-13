package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMusik {

    ////////////// sound servic
    public static Music start;
    public static Music finish;
    public static Music startBoj;
    public static Music finishBoj;
    public static Music smenaHoda;
    ///////////// sound bulet
    public static Music buletTank;
    public static Music buletStrelok;
    public static Music buletRaket;
    public static Music buletMinomet;
    ///////////// sound start v pole
    public static Music StartTank;
    public static Music StartStrelok;
    public static Music StartRaket;
    public static Music StartMinomet;
    public static Music StartEffect;
    public static Music StartStena;
    ///////////// sound deathUnit
    public static Music deathTank;
    public static Music deathStrelok;
    public static Music deathRaket;
    public static Music deathMinomet;
    public static Music deathEffect;
    ///////////// sound stolknovenie
    public static Music stolknovenieSound;
    public static Music uronSamok;
    ///////////// sound moovUnit
    public static Music moovTank;
    public static Music moovStrelok;
    public static Music moovRaket;
    public static Music moovMinomet;

    {
        start = Gdx.audio.newMusic(Gdx.files.internal("data/jump.wav"));
        MapSound.put("start", start);
        finish = Gdx.audio.newMusic(Gdx.files.internal("data/jump.wav"));
        MapSound.put("finish", finish);
        buletTank = Gdx.audio.newMusic(Gdx.files.internal("data/jump.wav"));
        MapSound.put("buletTank", buletTank);

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
