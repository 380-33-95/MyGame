package draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.Dvigatel;
import com.mycompany.mygame.MyGdxGame;

public class DrawBoolet extends MyGdxGame {

	public static void DrawCiclBoolet() {

		if (BlokList.get(Dvigatel.getStartV()).booletKadr.isScheduled()) {
			int pp = Dvigatel.getStartV();


			TextureRegion Boolet = new TextureRegion(atlas, 0, 2000, 100, 100);
			batch.draw(Boolet, BlokList.get(pp).getBooletX(), BlokList.get(pp).getBooletY(), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);
			//BoomBlok.CircleBoom(pp);


		}


		if (BlokList.get(Dvigatel.getStartI()).booletKadr.isScheduled()) {
			int pp = Dvigatel.getStartI();


			TextureRegion Boolet = new TextureRegion(atlas, 100, 2000, 100, 100);
			batch.draw(Boolet, BlokList.get(pp).getBooletX(), BlokList.get(pp).getBooletY(), 1, 1, WIDTH / 7, HEIGHT / 12, 1, 1, 0);
			//BoomBlok.CircleBoom(pp);


		}


	}
}
