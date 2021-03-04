package com.mycompany.draw;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mycompany.mygame.MyGdxGame;
import com.badlogic.gdx.*;
import com.mycompany.tower.*;

public class DrawCanonBoolet extends MyGdxGame {

    static int originX= WIDTH / 7 / 2;
    static int originY= HEIGHT / 12 / 2;
    static  int width=WIDTH / 7;
    static int height=HEIGHT / 12;

	static float trekI=0;
	static float trekV=0;

    public static void StartCanonBooletI( float rotI, float trek) {

        TextureRegion CanonI = new TextureRegion(atlas, 100, 2400, 600, 100);

      if(trekI<=trek){
		trekI=trekI+(2000*Gdx.graphics.getDeltaTime());
		}
		else{trekI=0;
		TowerCanon.setGippotenI(0);}
			
		batch.draw(CanonI,
				   0,
				   50,
				   50,//centerRotateX
				   0,//centerRotateY
                width,
                trekI,
                0.5f,
                1,
                rotI-90,
                false// УГОЛ
        );
    }

    public static void StartCanonBooletV( float rotV, float trek) {

        TextureRegion CanonV = new TextureRegion(atlas, 700, 2400, 600, 100);

      if(trekV<=trek){
		  trekV=trekV+(2000*Gdx.graphics.getDeltaTime());
	  }
	  else{
		  trekV=0;
		 TowerCanon.setGippotenV(0); 
	  }
		
		batch.draw(CanonV,
				   0,
				   HEIGHT - (HEIGHT / 12),
				   originX,//centerRotateX
				   originY,//centerRotateY
                width,
                trekV,
                0.5f,
                1,
              180+ 90- rotV,
                true// УГОЛ
        );


    }

}
