package com.mycompany.mygame;

import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodVrag extends ClickSelector {


    public static void HodVragZamok(){

        WorkBlok.ObnulenieBufer();

        LoadBufer.LoadVBufer(getNC());

        WorkBlok.ObnulenieFinishV();

        Peremen.setKodZamok(getNC());
    }



    public static void HodVragPole(){
        System.out.println("------------------------HodVragPole()");

        Peremen.setOneClik(true);

        WorkBlok.LoadPoleBlok();

        ObnulenieKvadratZamok(Peremen.getKodZamok());

        WorkBlok.SdvigZamokV();

        Peremen.setSmenaHoda(true);
        
        
    }
    public static void DvigatelVrag(int nc){

    }
}
