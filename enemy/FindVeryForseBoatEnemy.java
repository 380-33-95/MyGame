package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.enemy.SubAnaliz.getTarget;
import static com.mycompany.mygame.ClickSelector.TouchPressed;

public class FindVeryForseBoatEnemy extends MyGdxGame {

    public static void FindVeryForseBoat()
    {
        int gv = 0;
        int gb = 0;
        int VeryForse = 0;

        for (Blok gh : BlokList.subList(1, 7))
        {
            gv++;
            System.out.println("gv= "+gv);

            if (gh.getEffect() == 0
                    && gh.getForse() > VeryForse)
            {
                VeryForse = gh.getForse();
                gb=gv;
                System.out.println("very forse #"+gb);
            }
        }

        TouchPressed(gb);
        FreeBlok(getTarget());
    }

    public static void FreeBlok(int rd)
    {
        boolean gr = false;
        System.out.println("enter rd "+rd);

        while (!gr && rd>=14)
        {
            rd=rd-7;
            System.out.println("rd= "+rd);
        }

        gr = true;

        if (gr)
        {
            //    rd = rd+7;
            TouchPressed(rd);
            System.out.println("free blok #" + rd );

            rd = 0;
            gr=false;
        }

    }

}///////////////////end class
