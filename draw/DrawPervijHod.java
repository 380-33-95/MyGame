package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;

public class DrawPervijHod extends MyGdxGame {

    public static void PervijStartHod() {
        TextureRegion BannerHod = new TextureRegion(atlas, Peremen.getBannerChejHod(), Peremen.ChejHod, 200, 100);
        batch.draw(BannerHod, (WIDTH / 7) * 2, (HEIGHT / 12) * 7, 1, 1, (WIDTH / 7) * 3, HEIGHT / 12, 1, 1, 0);
    }
}
