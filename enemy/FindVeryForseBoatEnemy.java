package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.enemy.Enemy.getTarget;
import static com.mycompany.enemy.StrategijFirstEnemy.setFreeblok;
import static com.mycompany.mygame.ClickSelector.TouchPressed;

public class FindVeryForseBoatEnemy extends MyGdxGame {

    public static int FindVeryForseBoat()
    {
        int gv = 0;
        int gb = 0;
        int VeryForse = 0;

        for (Blok gh : BlokList.subList(1, 7))
        {
            gv++;
            if (gh.getEffect() == 0
                    && gh.getForse() > VeryForse)
            {
                VeryForse = gh.getForse();
                gb=gv;
            }
        }

        if(gb>0)
        {
            TouchPressed(gb);
        }

        return gb;
    }

    public static void FreeBlok(int rd)
    {
       while (rd>=14)
        {
            rd=rd-7;
            System.out.println("rd= #"+rd);
        }

        System.out.println("calculate rd= #"+rd);

        if (BlokListGet(rd).getIndex()==0)
        {
            setFreeblok(true);
            TouchPressed(rd);
            rd = 0;
            System.out.println("blok #true");
        }
        else
        {
            System.out.println("blok #false recall find enemy from #"+(getTarget()+1));
            setFreeblok(false);
            Enemy.FindEnemy(getTarget()+1);
        }

    }

}///////////////////end class
