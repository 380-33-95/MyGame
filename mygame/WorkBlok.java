package com.mycompany.mygame;

import com.mycompany.draw.DrawBoolet;

import static com.mycompany.mygame.MyGdxGame.HEIGHT;
import static com.mycompany.mygame.MyGdxGame.WIDTH;
import static com.mycompany.mygame.MyGdxGame.getNC;
import static com.mycompany.mygame.MyGdxGame.isSmenaHoda;

public class WorkBlok extends Blok {

    private boolean fg;


    public static void Peremeshenie(int isS, int vR) {

        //   MyMusik.MapSound.get(12).play();

        BlokList.get(vR).PlayMusik(12, 0.75f);

        BlokList.get(vR).setIndex(BlokList.get(isS).getIndex());
        BlokList.get(vR).setHealth(BlokList.get(isS).getHealth());
        BlokList.get(vR).setForse(BlokList.get(isS).getForse());
        BlokList.get(vR).setStorona(BlokList.get(isS).getStorona());
        if (isS >= 78 || isS <= 6) {
            BlokList.get(vR).setEffect(BlokList.get(isS).getEffect());
        }
        ObnulenieKvadratPole(isS);
    }

    public static void LoadPoleBlok() {
        BlokList.get(getNC()).setIndex(bufer.getIndex());
        BlokList.get(getNC()).setHealth(bufer.getHealth());
        BlokList.get(getNC()).setForse(bufer.getForse());
        BlokList.get(getNC()).setStorona(bufer.getStorona());
        BlokList.get(getNC()).setEffect(bufer.getEffect());

        if (BlokList.get(getNC()).getIndex() == 6) {

            //  MyMusik.MapSound.get(6).play();

            BlokList.get(getNC()).PlayMusik(6, 0.5f);
        }

        if (BlokList.get(getNC()).getIndex() >= 7 && BlokList.get(getNC()).getIndex() <= 11) {

            //   MyMusik.MapSound.get(7).play();
            BlokList.get(getNC()).PlayMusik(7, 0.5f);

        }

//        if (BlokList.get(getNC()).getIndex()==11) {
//            MyMusik.MapSound.get(7).play();
//        }

        if (BlokList.get(getNC()).getIndex() >= 1 && BlokList.get(getNC()).getIndex() <= 5) {

            //    MyMusik.MapSound.get(5).play();

            BlokList.get(getNC()).PlayMusik(5, 0.25f);
        }

    }

    public static void ObnulenieFinishV() {
        Uron.UronBasaIgrok();


        for (Blok nj : BlokList.subList(70, 76)) {
            if (nj.getStorona() == 2) {
                ObnulenieKvadratPole(BlokList.indexOf(nj));
            }
        }

    }


    public static void ObnulenieFinishI() {
        Uron.UronBasaVrag();

        for (Blok nj : BlokList.subList(7, 13)) {
            if (nj.getStorona() == 1) {
                ObnulenieKvadratPole(BlokList.indexOf(nj));
            }
        }
    }


    public static void ObnulenieFinish() {
        int a1, a2;


        a1 = (isSmenaHoda() ? 7 : 70);
        a2 = (isSmenaHoda() ? 13 : 76);

        if (!isSmenaHoda()) {
            Uron.UronBasaVrag();

        } else {
            Uron.UronBasaIgrok();

        }


        for (Blok xd : BlokList.subList(a1, a2)) {
            ObnulenieKvadratPole(BlokList.indexOf(xd));
        }


//        if(isSmenaHoda())
//        {Uron.UronBasaVrag();
//            for (Blok xd:BlokList.subList(a1, a2=a1+6))
//                  {
//              ObnulenieKvadratPole(BlokList.indexOf(xd));
//            }
//        }
//        else{Uron.UronBasaIgrok();
//            for (Blok xd:BlokList.subList(a1, a2=a1+6))
//            {
//                ObnulenieKvadratPole(BlokList.indexOf(xd));
//            }
//        };

    }


    public static void ObnulenieKvadratPole(int pp) {
        BlokList.get(pp).setForse(0);
        BlokList.get(pp).setHealth(0);
        BlokList.get(pp).setStorona(0);
        BlokList.get(pp).setIndex(0);
        BlokList.get(pp).setEffect(0);
        //  BlokList.get(pp).setKodBoom(0);
        BlokList.get(pp).setXl(0);
        BlokList.get(pp).setYl(0);
    }

    public static void ObnulenieBufer() {

        Blok.bufer.setForse(0);
        Blok.bufer.setHealth(0);
        Blok.bufer.setStorona(0);
        Blok.bufer.setIndex(0);
        Blok.bufer.setEffect(0);


    }

    public static void SdvigZamokV() {

        for (int sdi=-1; sdi<=3; sdi++) {
            int sdii=5-sdi;
            if(BlokList.get(sdii).getIndex()==0) {
                 WorkBlok.Peremeshenie(sdii-1, sdii);
            }
        }

        if(b01.getIndex()==0) {
            LoadZamokFromBasa(1, 2);
        }
    }

	
	
	public static void SdvigZamokI() {

        for (int sdi=-1; sdi<=3; sdi++) {
            int sdii=82-sdi;
	            if(BlokList.get(sdii).getIndex()==0) {
                WorkBlok.Peremeshenie(sdii-1, sdii);
            }
        }

        if(b78.getIndex()==0) {
            LoadZamokFromBasa(78, 1);
        }

    }


    public static void LoadZamokFromBasa(int nb, int st) {
        //0-index, 1-zdorovie, 2-sila, 3-effect, 4-moov  , 5-storona (1-igrok, 2-vrag), 6-boom,
//	7-flag sabrosa v pole, 8-flag vistrel 9-*

        int nv = (int) Generator.GenRand(Koloda.Basakoloda.length - 1);

        while (st == 1 && nv == 8) {
            nv = (int) Generator.GenRand(Koloda.Basakoloda.length - 1);

        }

        while (st == 2 && nv == 7) {
            nv = (int) Generator.GenRand(Koloda.Basakoloda.length - 1);
        }

        if (st == 1) {
            int io = 0;
            for (int iu = 78; iu <= 83; iu++) {

                if (BlokList.get(iu).getEffect() > 0) {
                    io++;
                }
            }
            if (io >= 5) {
                nv = (int) Generator.GenRand(5);
            }

        }

        if (st == 2) {

            int ip = 0;
            for (int iu = 1; iu <= 6; iu++) {

                if (BlokList.get(iu).getEffect() > 0) {
                    ip++;
                }
            }
            if (ip >= 5) {
                nv = (int) Generator.GenRand(5);
            }

        }

        BlokList.get(nb).setIndex(Koloda.Basakoloda[nv][0]);
        BlokList.get(nb).setHealth(Koloda.Basakoloda[nv][1]);
        BlokList.get(nb).setForse(Koloda.Basakoloda[nv][2]);
        BlokList.get(nb).setEffect(Koloda.Basakoloda[nv][3]);
        BlokList.get(nb).setStorona(st);
    }


    public static void ObnulenieKvadratZamok (int pp) {
        if (pp > 0) {
            BlokList.get(pp).setForse(0);
            BlokList.get(pp).setHealth(0);
            BlokList.get(pp).setStorona(0);
            BlokList.get(pp).setIndex(0);
            BlokList.get(pp).setEffect(0);
            BlokList.get(pp).setKadrBoom(0);
            BlokList.get(pp).setXl(0);
            BlokList.get(pp).setYl(0);
            BlokList.get(pp).setX(0);
            BlokList.get(pp).setY(0);

        }
    }


public static void LoadPoleFromBasa(int nb, int  index, int st){
        //0-index, 1-zdorovie, 2-sila, 3-effect, 4-moov  , 5-storona (1-igrok, 2-vrag), 6-boom,
//	7-flag sabrosa v pole, 8-flag vistrel 9-*

        
        BlokList.get(nb).setIndex(Koloda.Basakoloda[index][0]);
        BlokList.get(nb).setHealth(Koloda.Basakoloda[index][1]);
        BlokList.get(nb).setForse(Koloda.Basakoloda[index][2]);
        BlokList.get(nb).setEffect(Koloda.Basakoloda[index][3]);
        BlokList.get(nb).setStorona(st);
    }


    public static void Peremeshenie2(int isS, int vR) {

        BlokList.get(vR).setIndex(BlokList.get(isS).getIndex());
        BlokList.get(vR).setHealth(BlokList.get(isS).getHealth());
        BlokList.get(vR).setForse(BlokList.get(isS).getForse());
        BlokList.get(vR).setStorona(BlokList.get(isS).getStorona());

        ObnulenieKvadratPole(isS);
    }


    public static void LoadFlagBulet(int st) {

        for (Blok js : BlokList.subList(7, 76)) {
            if (js.getForse() > 0 && js.getStorona() == st) {
                js.setFlagBulet(true);
                js.setBooletY(js.getY());
            }
        }
        DrawBoolet.setScanerBulet(true);
    }

    public static void ChangeStoun() {

        for (Blok qw : BlokList.subList(7, 76)) {
            if (qw.getEffect() == 7) {
                qw.setStorona(isSmenaHoda() ? 1 : 2);
            }
        }

    }

public static  int RetranslateBlok(int x, int y){
        int cv=0;// number blok of BlokList
        int ry;
        int rx;
   ry = (y / (HEIGHT / 12));

    rx = (x / (WIDTH / 7));

    cv = ((ry * 7) + rx);

    return cv;
}

    /////////////////////end class
}
