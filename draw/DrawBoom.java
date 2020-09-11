package draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;


public class DrawBoom extends MyGdxGame {

    public static void StartDrawBoom() {

        for (int pp = 7; pp <= 76; pp++)
            if (BlokList.get(pp).getKodBoom() > 0) {

                //boom
                TextureRegion PoleIndex = new TextureRegion(atlas, BlokList.get(pp).getKodBoom() * 100, 2300, 100, 100);
                batch.draw(PoleIndex,
                        BlokList.get(pp).getX(),
                        BlokList.get(pp).getY(),
                        1,
                        1,
                        WIDTH / 7,
                        HEIGHT / 12,
                        1,
                        1,
                        0);

            }

    }

}
