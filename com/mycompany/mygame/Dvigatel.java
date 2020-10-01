package com.mycompany.mygame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

import draw.DrawPole;


public class Dvigatel extends MyGdxGame implements ApplicationListener {


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

    static Dvigatel dv = new Dvigatel();


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

            ////////////////////

            MyGdxGame.setFlagBoolet(true);
            Gdx.app.log("1) setFlagBoolet", "" + MyGdxGame.isFlagBoolet());

            BlokList.get(startV).setTimeBoolet(com.badlogic.gdx.utils.TimeUtils.millis() + 300);
            Gdx.app.log("2) BlokCurrentTime=", "" + BlokList.get(startV).getTimeBoolet());
            BlokList.get(startV).setBooletY(BlokList.get(startV).getY());

            while (MyGdxGame.isFlagBoolet()) {
                dv.render();
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

            MyGdxGame.setFlagBoolet(true);
            BlokList.get(startI).setTimeBoolet(com.badlogic.gdx.utils.TimeUtils.millis() + 300);
            BlokList.get(startI).setBooletY(BlokList.get(startI).getY());

            while (MyGdxGame.isFlagBoolet()) {
                dv.render();
            }

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

    @Override
    public void render() {

        Gdx.app.log("3) render dvigatel", "");

        DrawPole.DrawStartPole();

    }

/*
@Override
public void create(){

}
*/
    /////////
}