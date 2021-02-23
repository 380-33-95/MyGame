package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawZamokIgrok extends MyGdxGame {
    static int ii;

    public static void ZamokStartIgrok() {

        for (int ik = 1; ik <= 6; ik++) {
            ii = ik + 77;
            //index
            TextureRegion ZamokIgrokIndex = new TextureRegion(atlas, (BlokList.get(ii).getIndex() * 100), 100, 100, 100);
            batch.draw(ZamokIgrokIndex, (ik * (WIDTH / 7)), 0, 1, 1, 100, 100, 1, 1, 0);

            //sila
            TextureRegion ZamokIgrokSila = new TextureRegion(atlas, 1000 + (BlokList.get(ii).getForse() * 100), 2700, 100, 100);
            batch.draw(ZamokIgrokSila, (ik * (WIDTH / 7)) + 10, 0, 1, 1, 30, 30, 1, 1, 0);

            //sdorov
            TextureRegion ZamokIgrokSdorov = new TextureRegion(atlas, (BlokList.get(ii).getHealth() * 100), 2700, 100, 100);
            batch.draw(ZamokIgrokSdorov, (ik * (WIDTH / 7)) + 60, 0, 1, 1, 30, 30, 1, 1, 0);

            if (getNC() == ii) {
                TextureRegion PodsvetkaBloka = new TextureRegion(atlas, 200, 2900, 100, 100);

                batch.draw(PodsvetkaBloka, (ik * (WIDTH / 7)), 0, 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);

            }

        }
    }
}
