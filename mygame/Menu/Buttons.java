package com.mycompany.mygame.Menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.mycompany.mygame.MyGdxGame;

/**
 * Created by Cartish on 10.10.2016.
 */

public class Buttons extends Stage {
    final MyGdxGame game;
    Texture buttonUpImage;
    Texture buttonDownImage;
    TextButton button;

    public Buttons(final MyGdxGame myGdxGame) {
        game = myGdxGame;

        buttonUpImage = new Texture("button_up.png");
        buttonDownImage = new Texture("button_down.png");

        BitmapFont font = new BitmapFont();
        Skin skin = new Skin();

        skin.add("button_up", buttonUpImage);
        skin.add("button_down", buttonDownImage);
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("button_up");
        textButtonStyle.down = skin.getDrawable("button_down");
        textButtonStyle.checked = skin.getDrawable("button_up");

        button = new TextButton("Test game", textButtonStyle);
        button.setPosition(50, 125);
        addActor(button);

        button.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                System.out.println("it is test game");
                //game.setScreen(new TestObj(game));
                //game.setScreen(new TestG3DJ(game));
                //game.setScreen(new TestAmin3D(game));
                //game.setScreen(new TestSelectAnim3D(game));
                //game.setScreen(new TestG3DB(game));
                //game.setScreen(new TestSpine(game));
                dispose();
            }
        });
    }
}
