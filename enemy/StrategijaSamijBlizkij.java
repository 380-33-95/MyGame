package com.mycompany.enemy;


import com.mycompany.mygame.ClickSelector;

public class StrategijaSamijBlizkij extends Analiz {

    public static int getTouchKletka() {
        return TouchKletka;
    }

    public static void setTouchKletka(int touchKletka) {
        TouchKletka = touchKletka;
    }

    private static int TouchKletka;


    public static boolean StartPerviEnemy() {

        boolean result = false;

        setTargetEnemy(PoiskEnemy(20));

        if (getTargetEnemy() >= 14) {

            VerefyMinaOfKurs(getTargetEnemy());
        }

        if (!isMinaNaLine()) {
            FindZamokMine();
        }
        if (isMinaNaLine()) {
            ClickSelector.TouchPressed(FindVeryForseBlok());
         //   setTargetEnemy(getTargetEnemy()+1);
            PererbrosVpole(getTargetEnemy());
        }

        if (isMinaVZamke() > 0) {
            ClickSelector.TouchPressed(isMinaVZamke());
            PerebrosMina(getTargetEnemy());
        }

        if (isMinaVZamke() == 0) {
            ClickSelector.TouchPressed(FindVeryForseBlok());
            PererbrosVpole(getTargetEnemy());
        }
        return true;
    }



    //////****
}