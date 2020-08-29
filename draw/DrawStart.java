package draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;


public class DrawStart extends MyGdxGame{

    public static void DrawRunStart(){

        TextureRegion ZastavkaStart = new TextureRegion(atlas, 0, Peremen.getMenuSt(), WIDTH , HEIGHT);
        TextureRegion ButtonStart = new TextureRegion(atlas, 0, Peremen.getKnopkaStart(), 300 , 100);

        batch.draw(ZastavkaStart, 0,0, 1, 1, WIDTH, HEIGHT,1,1,0);
        batch.draw(ButtonStart, (WIDTH/7)*2, (HEIGHT/12)*7, 1, 1, shirKnopki, visKnopki,1,1,0);
    }


}
