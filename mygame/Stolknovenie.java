package com.mycompany.mygame;

import static com.mycompany.mygame.Blok.BlokList;

public class Stolknovenie {

    static int b, bb;

    public static void StolknoveniePole(int pp) {

        //MyMusik.MapSound.get(11).play();

        BlokList.get(pp).PlayMusik(11);

        switch (BlokList.get(pp).getStorona()) {

            case 1: {

                b = pp;
                bb = b - 7;

                break;
            }

            case 2: {

                b = pp;
                bb = b + 7;

                break;
            }

        }

        BlokList.get(b).setHealth(
                BlokList.get(b).getHealth() -
                        BlokList.get(bb).getForse());

        BlokList.get(bb).setHealth(
                BlokList.get(bb).getHealth() -
                        BlokList.get(b).getForse()
        );

        if (BlokList.get(b).getHealth() <= 0) {
            BoomBlok.StartBoomBlok(b);

        }

        if (BlokList.get(bb).getHealth() <= 0) {
            BoomBlok.StartBoomBlok(bb);
        }


    }


	

}
