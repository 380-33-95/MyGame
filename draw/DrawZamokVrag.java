package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawZamokVrag extends MyGdxGame {

    public static void ZamokStartVrag() {

        for (int iv = 1; iv <= 6; iv++) {

            //index
            TextureRegion ZamokVragIndex = new TextureRegion(atlas, (BlokList.get(iv).getIndex() * 100), 1100, 100, 100);
            batch.draw(ZamokVragIndex, iv * (WIDTH / 7), HEIGHT - (HEIGHT / 12), 1, 1, 100, 100, 1, 1, 0);

            //sila
            TextureRegion ZamokVragSila = new TextureRegion(atlas, 1000 + ((BlokList.get(iv).getForse()) * 100), 2700, 100, 100);
            batch.draw(ZamokVragSila, (iv * (WIDTH / 7)) + 10, HEIGHT - (HEIGHT / 12), 1, 1, 30, 30, 1, 1, 0);

            //sdorov
            TextureRegion ZamokVragSdorov = new TextureRegion(atlas, (BlokList.get(iv).getHealth() * 100), 2700, 100, 100);
            batch.draw(ZamokVragSdorov, (iv * (WIDTH / 7)) + 60, HEIGHT - (HEIGHT / 12), 1, 1, 30, 30, 1, 1, 0);

            if (getNC() == iv) {
                TextureRegion PodsvetkaBloka = new TextureRegion(atlas, 200, 2900, 100, 100);

                batch.draw(PodsvetkaBloka, (iv * (WIDTH / 7)), HEIGHT - (HEIGHT / 12), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);

            }

        }

    }


}
