package com.mycompany.enemy;

import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.mygame.ClickSelector.TouchPressed;

public class Mina extends MyGdxGame {




    public static int FindZamokMine() {
        int cv=0;
        setMinaVZamke(0);

        for (Blok hj : BlokList.subList(1, 7))
        {
            cv++;
            if (hj.getIndex() == 6) {
                setMinaVZamke(cv);
            }
        }

        if(getMinaVZamke()>0)
        {
            TouchPressed(getMinaVZamke());
        }

        System.out.println("find mina #" + getMinaVZamke());
        return getMinaVZamke();
    }
}
