package com.mycompany.mygame;


import draw.DrawPole;

public class ClearStart {

    public static void NewStart(){



    	Peremen.setMaska(8);
    //	Peremen.Sost[0]=2;
    	/*
       if (Peremen.KROP==1){
    	   Peremen.setStep(185);
    	   Game.setHight(1920);
    	   Game.setWidth(1300);
       }
       else if (Peremen.KROP==1.8){
    	   Peremen.setStep(103);
    	   Game.setHight(1280);
    	   Game.setWidth(720);
       }
       else if (Peremen.KROP==2.7){
    	   Peremen.setStep(69);
    	   Game.setHight(800);
    	   Game.setWidth(480);
       }
        */


        Blok.b00.setHealth(1);
        Blok.b77.setHealth(1);


        DrawPole.InitialisationCoordinatPole();
        GameFirstHod.GenerationFirstHod();
        Rasdacha.RasdachaStartVse();


        Test.TestTest();
    }
       
  
       
    }///////////////////////

