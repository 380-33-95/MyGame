package draw;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.Dvigatel;
import com.mycompany.mygame.MyGdxGame;

public class DrawBoolet extends MyGdxGame {

	public static long timb1, timb2;

	public static void DrawCiclBoolet(int nc) {

		timb1 = com.badlogic.gdx.utils.TimeUtils.millis();
		timb2 = BlokList.get(nc).getTimerBoolet();

		Gdx.app.log("timb1", "" + timb1);
		Gdx.app.log("timerboolet", "" + BlokList.get(Dvigatel.startV).getTimerBoolet());
		//	Gdx.app.log("delta", ""+(BlokList.get(nc).getTimerBoolet()-timb1));

		if (Dvigatel.raznica() <= 0) {
			Gdx.app.log("render", "" + BlokList.get(nc).getBooletY());

			TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(BooletV,
					BlokList.get(nc).getX(),
					BlokList.get(nc).getBooletY(),
					1,
					1,
					WIDTH / 7,
					HEIGHT / 12,
					1,
					1,
					0);
		}

		if (BlokList.get(nc).getBooletY() <= 1200 && BlokList.get(nc).getBooletY() > 0) {
			BlokList.get(nc).setBooletY(BlokList.get(nc).getBooletY() + 100);
			//	BlokList.get(nc).setTimerBoolet(timb1+250);
		} else {
			BlokList.get(nc).setBooletY(0);
			BlokList.get(nc).setTimerBoolet(0);
			MyGdxGame.setFlagBoolet(false);

		}

		Gdx.app.log("DrawCiclBoolet -->", "" + Dvigatel.finishV + "--->" + BlokList.get(nc).getBooletY());


	}

}
