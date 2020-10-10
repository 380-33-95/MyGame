package com.mycompany.mygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mycompany.mygame.MyGdxGame;

public class DesktopLauncher {
	static int HEIGHT = 1200;
	static int WIDTH = 700;

	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Pole 0.1 ";
		config.useGL30 = false;
		config.height = HEIGHT;
		config.width = WIDTH;


		new LwjglApplication(new MyGdxGame(), config);
	}
}
