package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.Generator;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.enemy.FindVeryForseBoatEnemy.FreeBlok;
import static com.mycompany.mygame.ClickSelector.TouchPressed;

public class Enemy extends MyGdxGame {

    ////////////
    private static int target;
    public static void setTarget(int tr){
        target=tr;
    }
    public static int getTarget(){
        return target;
    }
    /////////
    private static int nj;
    public static int getBlok(){
        return nj;
    }
   ////////////////////////////////


    public static int FindEnemy(int start){

        System.out.println("---find enemy");

        int tgt=start-1;
        boolean tr=false;

        for(Blok qe:BlokList.subList(start,77)){
            tgt++;

            if(qe.getStorona()==1 && qe.getEffect()==0){
                target=tgt;
                tr=true;
                nj=target;
                //TouchPressed(target);
                break;
            }

        }

        if(!tr){
            tgt=0;
            target=0;
           if(FindVeryForseBoatEnemy.FindVeryForseBoat()>0){
               System.out.println("---generator");
             FreeBlok(7+(int) Generator.GenRand(6));
           };

        }

        System.out.println("find enemy #"+getTarget());
        return getTarget();

    }


    public static void PerebrosVpole(int tgt) {

        TouchPressed(tgt);
		if(SubAnaliz.UniversalVerifyBlokPole(getTarget(),0)==0){
			TouchPressed(SubAnaliz.UniversalVerifyBlokPole(getTarget(),0));
			System.out.println("perebros #"+tgt+" -> "+SubAnaliz.getResultUFB());
			
		}
		else{
			StrategijFirstEnemy.Start(getTarget()-1);
		}

    }

}///////////end class
