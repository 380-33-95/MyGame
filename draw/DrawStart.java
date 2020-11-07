package com.mycompany.draw;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.mycompany.mygame.MyGdxGame;
import com.mycompany.mygame.Peremen;


public class DrawStart extends MyGdxGame {

    public static Texture buttonUpImage;
    public static Texture buttonDownImage;

    public static Button button;


    public static void DrawRunStart() {


        buttonUpImage = new Texture("button_up.png");
        buttonDownImage = new Texture("button_down.png");


        TextureRegion ZastavkaStart = new TextureRegion(atlas, 0, Peremen.getMenuSt(), WIDTH, HEIGHT);
        TextureRegion ButtonStart = new TextureRegion(atlas, 0, Peremen.getKnopkaStart(), 300, 100);
        TextureRegion ButtonSelectLevel = new TextureRegion(buttonUpImage, 0, 0, 300, 100);


        batch.draw(ZastavkaStart,
                0,
                0,
                1,
                1,
                WIDTH,
                HEIGHT,
                1,
                1,
                0);
        batch.draw(ButtonStart, (WIDTH / 7) * 2, (HEIGHT / 12) * 7, 1, 1, shirKnopki, visKnopki, 1, 1, 0);

        batch.draw(ButtonSelectLevel, (WIDTH / 7) * 2, ((HEIGHT / 12) * 7) - 300, 1, 1, shirKnopki, visKnopki, 1, 1, 0);


    }


}
