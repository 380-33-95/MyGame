package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import java.util.HashMap;
import java.util.Map;

public class MyMusik {

    public static Map<Integer, Music> MapSound = new HashMap<Integer, Music>();

    ////////////// sound servic

    static {
        Music sastavka = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound service/sastavka.mp3"));
        MapSound.put(0, sastavka);

        Music boj = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound service/boj.mp3"));
        MapSound.put(1, boj);

        Music finishBoj = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound service/finishBoj.mp3"));
        MapSound.put(2, finishBoj);

        Music smenaHoda = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound service/smenaHoda.mp3"));
         MapSound.put(3, smenaHoda);

        Music bulletBoth = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound bullet/bulletBoth.mp3"));
        MapSound.put(4, bulletBoth);

        Music startBoth = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound start v pole/startBoth.mp3"));
        MapSound.put(5, startBoth);

        Music startMine = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound start v pole/startMine.mp3"));
        MapSound.put(6, startMine);

        Music startEffect = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound start v pole/startEffect.mp3"));
        MapSound.put(7, startEffect);

        Music deathEffect = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound deathUnit/deathEffect.mp3"));
        MapSound.put(8, deathEffect);

        Music deathBoth = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound deathUnit/deathBoth.mp3"));
        MapSound.put(9, deathBoth);

        Music explosive = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound deathUnit/explosive.mp3"));
        MapSound.put(10, explosive);

        Music stolknovenieBoth = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound stolknovenie/stolknovenieBoth.mp3"));
        MapSound.put(11, stolknovenieBoth);

        Music uronZamok = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound stolknovenie/uronZamok.mp3"));
        MapSound.put(12, uronZamok);

        Music moovBoth = Gdx.audio.newMusic(Gdx.files.internal("data/sound sea/sound moovUnit/moovBoth.mp3"));
        MapSound.put(13, moovBoth);
    }



}
