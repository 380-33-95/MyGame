package com.mycompany.mygame;

public class GameInfo extends MyGdxGame{

    static int pc=0;
static int nc;

    public static void InfoKletka () {

        nc=getNC();
    //        if (pc != nc) {
            if (nc >= 7 && nc <= 76) {
                System.out.println();

                System.out.printf("KLETKA POLE#%d -> index=%d health=%d forse=%d status=%d storona=%d",
                        getNC(),
                        BlokList.get(nc).getIndex(),
                        BlokList.get(nc).getHealth(),
                        BlokList.get(nc).getForse(),
                        BlokList.get(nc).getEffect(),
                        BlokList.get(nc).getStorona()
                );

                System.out.println();
               // pc = nc;
            }
   //     }

    }

}
