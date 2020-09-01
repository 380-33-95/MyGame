package com.mycompany.mygame;

import static com.mycompany.mygame.MyGdxGame.getNC;

public class WorkBlok extends Blok{

    public static void Peremeshenie (int isS, int vR){

        BlokList.get(vR).setIndex(BlokList.get(isS).getIndex());
        BlokList.get(vR).setHealth(BlokList.get(isS).getHealth());
        BlokList.get(vR).setForse(BlokList.get(isS).getForse());
        BlokList.get(vR).setStorona(BlokList.get(isS).getStorona());
        if (isS>=78 || isS<=6) {
            BlokList.get(vR).setEffect(BlokList.get(isS).getEffect());
        }
        ObnulenieKvadratPole(isS);
    }

    public static void LoadPoleBlok(){
        BlokList.get(getNC()).setIndex(bufer.getIndex());
        BlokList.get(getNC()).setHealth(bufer.getHealth());
        BlokList.get(getNC()).setForse(bufer.getForse());
        BlokList.get(getNC()).setStorona(bufer.getStorona());
        BlokList.get(getNC()).setEffect(bufer.getEffect());

    }

    public static void ObnulenieFinishV() {
        Uron.UronBasaIgrok();
        for(int ofv=63; ofv<=69; ofv++) {
            if(BlokList.get(ofv).getStorona()==2) {
                ObnulenieKvadratPole(ofv);
            }
        }
    }

	
	public static void ObnulenieFinishI() {
        Uron.UronBasaVrag();
        for(int ofv=7; ofv<=13; ofv++) {
            if(BlokList.get(ofv).getStorona()==1) {
                ObnulenieKvadratPole(ofv);
            }
        }
    }
	
    public static void ObnulenieKvadratPole (int pp) {
        BlokList.get(pp).setForse(0);
        BlokList.get(pp).setHealth(0);
        BlokList.get(pp).setStorona(0);
        BlokList.get(pp).setIndex(0);
        BlokList.get(pp).setEffect(0);
        BlokList.get(pp).setKodBlok(0);
        BlokList.get(pp).setXl(0);
        BlokList.get(pp).setYl(0);
        }

    public static void ObnulenieBufer() {


        Blok.bufer.setForse(0);
        Blok.bufer.setHealth(0);
        Blok.bufer.setStorona(0);
        Blok.bufer.setIndex(0);
        Blok.bufer.setEffect(0);
        Blok.bufer.setKodBlok(0);
        //	Blok.bufer.setX(0);
        //	Blok.bufer.setY(0);

    }

    public static void SdvigZamokV() {

        for (int sdi=-1; sdi<=3; sdi++) {
            int sdii=5-sdi;

            if(BlokList.get(sdii).getIndex()==0) {
                 WorkBlok.Peremeshenie(sdii-1, sdii);
            }
        }

        if(b01.getIndex()==0) {
           LoadBlokFromBasa(1,2);
        }
    }

	
	
	public static void SdvigZamokI() {

        for (int sdi=-1; sdi<=3; sdi++) {
            int sdii=82-sdi;
	            if(BlokList.get(sdii).getIndex()==0) {
				System.out.println("sdvig I2="+sdii);
                WorkBlok.Peremeshenie(sdii-1, sdii);
            }
        }

        if(b78.getIndex()==0) {
			LoadBlokFromBasa(78, 1);
        }

    }
	

    public static void LoadBlokFromBasa(int nb, int st){
        //0-index, 1-zdorovie, 2-sila, 3-effect, 4-moov  , 5-storona (1-igrok, 2-vrag), 6-boom,
//	7-flag sabrosa v pole, 8-flag vistrel 9-*

        int nv=(int) Generator.GenRand(Koloda.Basakoloda.length-1);
        BlokList.get(nb).setIndex(Koloda.Basakoloda[nv][0]);
        BlokList.get(nb).setHealth(Koloda.Basakoloda[nv][1]);
        BlokList.get(nb).setForse(Koloda.Basakoloda[nv][2]);
        BlokList.get(nb).setEffect(Koloda.Basakoloda[nv][3]);
        BlokList.get(nb).setStorona(st);
    }


    public static void ObnulenieKvadratZamok (int pp) {
       if(pp>0) {
           BlokList.get(pp).setForse(0);
           BlokList.get(pp).setHealth(0);
           BlokList.get(pp).setStorona(0);
           BlokList.get(pp).setIndex(0);
           BlokList.get(pp).setEffect(0);
           BlokList.get(pp).setKodBlok(0);
           BlokList.get(pp).setXl(0);
           BlokList.get(pp).setYl(0);
           BlokList.get(pp).setX(0);
           BlokList.get(pp).setY(0);
            }
    }

}
