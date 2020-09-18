package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import draw.DrawBoom;
import draw.DrawBossIgrok;
import draw.DrawBossVrag;
import draw.DrawGame;
import draw.DrawPervijHod;
import draw.DrawPole;
import draw.DrawRamkaBoss;
import draw.DrawStart;
import draw.DrawZamokIgrok;
import draw.DrawZamokVrag;

import static com.mycompany.mygame.JustTouched.IfJustTouched;



public class MyGdxGame extends Blok implements ApplicationListener
{
	static OrthographicCamera camera;
	public static SpriteBatch batch;
	protected Label label;
	protected Stage stage;
	public static Texture atlas;

	static int TouchX2;
	static int TouchY2;


	protected final static int HEIGHT = 1200;
	protected final static int WIDTH = 700;


    public static int getStatusMenu() {
		return StatusMenu;
	}

	public static void setStatusMenu(int statusMenu) {
		StatusMenu = statusMenu;
	}

	private static int StatusMenu; //0-start; 1-game; 2- finish;

	public static int getNC() {
		return NC;
	}

	public static void setNC(int nc) {
		NC = nc;
	}

	private static int NC;

	static Vector3 Touch = new Vector3();

	public static int shirKnopki=(WIDTH/7)*3;
	public static int visKnopki=(HEIGHT/12);

    public static int color;



	static {  //////////////initialisation

		Test.TestTest();
		setStatusMenu(0);

		TouchX2=0;
		TouchY2=0;



	}


	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, WIDTH, HEIGHT);

		batch = new SpriteBatch();
		atlas = new Texture("atlas.png");

        camera.update();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();

		switch (getStatusMenu()){

			case 0:{
					DrawStart.DrawRunStart();
					if (Gdx.input.justTouched()) {
						
						IfJustTouched();

					}
				if (getNC() >= 30 && getNC() <= 32) {
					setNC(0);
					ClearStart.NewStart();
					setStatusMenu(1);
				}
				break;
			}

			case 1: {

				DrawGame.DrGame();
				if (GameFirstHod.myTimerTask.isScheduled()) {
					DrawPervijHod.PervijStartHod();
				}

				DrawBossVrag.BossVrag();

				DrawBossIgrok.BossIgrok();

				DrawRamkaBoss.RamkaStartBoss();

				DrawZamokVrag.ZamokStartVrag();

				DrawZamokIgrok.ZamokStartIgrok();

				DrawPole.DrawStartPole();

				DrawBoom.DrawCiclBoom();


				if (Gdx.input.justTouched()) {

					ClickSelector.TouchPressed(

							IfJustTouched());

					GameInfo.InfoKletka();
				}


				break;
			}

			case 2:{
					break;
				}

			default:
				throw new IllegalStateException("Unexpected value: " + getStatusMenu());
		}


		batch.end();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}


	@Override
	public void dispose () {
		batch.dispose();
		atlas.dispose();
	}

















}
