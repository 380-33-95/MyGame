package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

public class SubAnaliz extends MyGdxGame {

    public static int FindEnemy(int start){

        int target=start-1;
        boolean tr=false;

        for(Blok qe:BlokList.subList(start,76)){
            target++;
            if(qe.getStorona()==1){
                tr=true;
                break;
            }

        }

        if(!tr){
            target=0;
        }
        return target;
    }
}
