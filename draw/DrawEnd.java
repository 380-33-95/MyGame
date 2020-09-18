package draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;


public class DrawEnd extends MyGdxGame {

    public static void RrawEndGame() {
        {

            TextureRegion ZastavkaEnd = new TextureRegion(atlas, 0, Peremen.KonecBoj, WIDTH, HEIGHT);
            TextureRegion ButtonEnd = new TextureRegion(atlas, Peremen.getWin(), 2100, 200, 100);

            batch.draw(ZastavkaEnd,
                    0,
                    0,
                    1,
                    1,
                    WIDTH,
                    HEIGHT,
                    1,
                    1,
                    0);
            batch.draw(ButtonEnd, (WIDTH / 7) * 2, (HEIGHT / 12) * 7, 1, 1, shirKnopki, visKnopki, 1, 1, 0);

        }
    }

}
