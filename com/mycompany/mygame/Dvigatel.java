package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import javax.swing.DefaultListSelectionModel;


public class Dvigatel extends MyGdxGame {


    public static int startV;

    public static int getStartV() {
        return startV;
    }

    public static int finishV;

    public static int startI;

    public static int getStartI() {
        return startI;
    }

    public static int finishI;

    public static boolean startCiclVrag = true;

    public static boolean startCiclIgrok = true;





    //start from 69 for vrag

    public static void StartCiclPoleVrag() {
        if (startV > 6) {
            SdvigPoleVrag();
        }
    }

    public static void SdvigPoleVrag() {
        startV--;
        finishV = startV + 7;


        if ((startV > 6) && (BlokList.get(startV).getEffect() == 0)
                && BlokList.get(startV).getStorona() == 2) {

            ////////////////////bulet


            BlokList.get(startV).setTimeBoolet(com.badlogic.gdx.utils.TimeUtils.millis() + 300);
            Gdx.app.log("2) BlokCurrentTime=", "" + BlokList.get(startV).getTimeBoolet());


            BlokList.get(startV).setBooletY(BlokList.get(startV).getY());


            while (BlokList.get(startV).isFlagBulet()) {


                TextureRegion BooletV = new TextureRegion(atlas, 0, 2000, 100, 100);
                batch.draw(BooletV,
                        BlokList.get(startV).getX(),
                        BlokList.get(startV).getBooletY(),
                        1,
                        1,
                        WIDTH / 7,
                        HEIGHT / 12,
                        1,
                        1,
                        0);


                BlokList.get(startV).setBooletY(BlokList.get(startV).getBooletY() - 100);


//                    try
//                    {
//                        Thread.sleep(300);
//                     } catch (InterruptedException ex) {   }
//                    Gdx.graphics.requestRendering();


                if (BlokList.get(startV).getBooletY() <= 100) {
                    BlokList.get(startV).setFlagBulet(false);
                }

            }



            ////////////////////

            Gdx.app.log("programm falow!!!!!!!!!!!", "");
            //esli vperedi object
            if (BlokList.get(finishV).getIndex() > 0
                    && BlokList.get(startV).getForse() > 0
                    && BlokList.get(finishV).getStorona() == 1
            ) {
                Stolknovenie.StolknoveniePole(startV);
            }


            // esli vperedi pusto ili effect
            if (BlokList.get(finishV).getIndex() == 0
                    ||
                    (BlokList.get(finishV).getEffect() > 0)
            ) {
                WorkBlok.Peremeshenie(startV, finishV);
                //esli vperedi effect
                if (
                        BlokList.get(finishV).getIndex() > 0
                                && BlokList.get(finishV).getEffect() > 0

                ) {

                    Effect.SelectEffect(finishV);
                }
            }

        }

        StartCiclPoleVrag();

    }


    //start from 7 for igrok

    public static void StartCiclPoleIgrok(){
        if (startI<77){
            SdvigPoleIgrok();
        }
    }

    public static void SdvigPoleIgrok() {
        startI++;
        finishI = startI - 7;

        if ((startI < 77) && (BlokList.get(startI).getEffect() == 0)
                && BlokList.get(startI).getStorona() == 1
                && BlokList.get(startI).getHealth() > 0) {


            BlokList.get(startI).setTimeBoolet(com.badlogic.gdx.utils.TimeUtils.millis() + 300);
            BlokList.get(startI).setBooletY(BlokList.get(startI).getY());


            Gdx.app.log("programm falow!!!!!!!!!!!", "");

            //esli vperedi object
            if (BlokList.get(startI - 7).getIndex() > 0
                    && BlokList.get(startI).getForse() > 0
                    && BlokList.get(finishI).getStorona() == 2
            ) {
                Stolknovenie.StolknoveniePole(startI);
            }

            // esli vperedi pusto ili effect
            if (BlokList.get(finishI).getIndex() == 0
                    ||
                    (BlokList.get(finishI).getEffect() > 0)
            ) {
                WorkBlok.Peremeshenie(startI, finishI);
                //esli vperedi effect

                if (BlokList.get(finishI).getIndex() > 0
                        && BlokList.get(finishI).getEffect() > 0

                ) {

                    Effect.SelectEffect(finishI);
                }
            }

        }

        StartCiclPoleIgrok();

    }


}
