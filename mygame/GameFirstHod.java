
package com.mycompany.mygame;

import com.badlogic.gdx.utils.Timer;

import static com.mycompany.mygame.MyGdxGame.setSmenaHoda;

public class GameFirstHod {


    public static Timer.Task myTimerTask = new Timer.Task() {

        @Override
        public void run() {
        }
    };

    public static void StartTimer(){

        Timer.schedule(myTimerTask, 3f, 0f,0);
    }

	
	public static void GenerationFirstHod() {
        int fs = 2;
//		fs=(int)Generator.GenRand(2);

        if (fs > 1) {
            setSmenaHoda(true);
            Peremen.setBannerChejHod(0);
            StartTimer();

        }
//		else {
//			Peremen.setSmenaHoda(false);
//            Peremen.setBannerChejHod(200);
//			StartTimer();
//		}

    }

	
	

}
