package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Blok;

public class DrawTarget extends MyGdxGame {

    public static void StartTargetI(int x, int y) {


                TextureRegion PodsvetkaTarget = new TextureRegion(atlas, 200, 2900, 100, 100);

                batch.draw(PodsvetkaTarget, x,  y, 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);


    }


    public static void StartTargetV(int x, int y) {


        TextureRegion PodsvetkaTarget = new TextureRegion(atlas, 200, 2900, 100, 100);

        batch.draw(PodsvetkaTarget, x-50,  y, 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);


    }
	
	
	public static void StartTarget(int x, int y) {


        TextureRegion PodsvetkaTarget = new TextureRegion(atlas, 200, 2900, 100, 100);

        batch.draw(PodsvetkaTarget, x,  y, 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);


    }

}
