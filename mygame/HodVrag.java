package com.mycompany.mygame;

import com.mycompany.draw.DrawSmenaHoda;
import com.mycompany.tower.CalculateUgol;

import static com.mycompany.mygame.Dvigatel.startCiclIgrok;
import static com.mycompany.mygame.Dvigatel.startCiclVrag;
import static com.mycompany.mygame.Dvigatel.startV;
import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodVrag extends ClickSelector {


    public static void HodVragZamok() {

        CalculateUgol.MatricaEnemy();

        WorkBlok.ObnulenieBufer();

        LoadBufer.LoadVBufer(getNC());

        WorkBlok.ObnulenieFinishV();
        //   WorkBlok.ObnulenieFinish();

        Peremen.setKodZamok(getNC());

        if (startCiclVrag) {
            startV = 70;
            Dvigatel.StartCiclPoleVrag();
            startCiclVrag = false;
            startCiclIgrok = true;

        }


    }


    public static void HodVragPole(){

        WorkBlok.LoadFlagBulet(1);

        WorkBlok.ChangeStoun();

        WorkBlok.LoadPoleBlok();

        WorkBlok.ObnulenieBufer();

        ObnulenieKvadratZamok(Peremen.getKodZamok());

        WorkBlok.SdvigZamokV();

        //  MyMusik.MapSound.get(3).play();

        setSmenaHoda(true);
        //  DrawSmenaHoda.sun = true;
        DrawSmenaHoda.CircleSun = 0;

    }


}
