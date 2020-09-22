package draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;

public class DrawBoolet extends MyGdxGame {

	public static void DrawCiclBoolet(int nc) {


		if (BlokList.get(nc).getEffect() == 0
				//&& BlokList.get(nc).getIndex() > 0
				&& BlokList.get(nc).getStorona() == 2
		) {
System.out.println(".");
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
	}

}
