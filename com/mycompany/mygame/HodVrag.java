package com.mycompany.mygame;

import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodVrag extends ClickSelector {


    public static void HodVragZamok(){

        WorkBlok.ObnulenieBufer();

        LoadBufer.LoadVBufer(getNC());

        WorkBlok.ObnulenieFinishV();

        Peremen.setKodZamok(getNC());

        if(Dvigatel.startCiclVrag) {
            Dvigatel.startV = 70;
            Dvigatel.StartCiclPoleVrag();
            Dvigatel.startCiclVrag=false;
            Dvigatel.startCiclIgrok=true;
        }


    }



    public static void HodVragPole(){

        System.out.println("------------------------HodVragPole()");

        WorkBlok.LoadPoleBlok();

        WorkBlok.ObnulenieBufer();

        ObnulenieKvadratZamok(Peremen.getKodZamok());

        WorkBlok.SdvigZamokV();

        Peremen.setSmenaHoda(true);

    }

}
