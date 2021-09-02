package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

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
        boolean gr = false;

        while (!gr && rd>=14)
        {
            rd=rd-7;
        }

        gr = true;

        if (gr && BlokListGet(rd).getIndex()==0)
        {
            setFreeblok(true);
            TouchPressed(rd);
            rd = 0;
            gr=false;
        }
        else
        {
            setFreeblok(false);
            Enemy.FindEnemy(rd-1);
        }

    }

}///////////////////end class
