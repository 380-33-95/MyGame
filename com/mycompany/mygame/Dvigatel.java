package com.mycompany.mygame;

public class Dvigatel {

                public static int startV;

                public static int startI;

                public static boolean startCiclVrag=true;

                public  static boolean StartCiclIgrok=true;


  //start from 69 for vrag

    public static void StartCiclPoleVrag(){
        if (startV>6){
            SdvigPoleVrag();
        }
    }

    public static void SdvigPoleVrag(){
        startV--;
        if (startV>6){
            System.out.println(">V>"+startV);
            if(Blok.BlokList.get(startV+7).getIndex()==0
                    && Blok.BlokList.get(startV).getEffect()==0
                    && Blok.BlokList.get(startV).getIndex()>0
                    && Blok.BlokList.get(startV).getStorona()==2
            )
            {
                System.out.println("i___Proverka "+(startV+7));
                WorkBlok.Peremeshenie(startV, startV+ 7);
            }
            StartCiclPoleVrag();
        }
        else {
            System.out.println("Cicl stopped to "+startV);
        }
    }


    //start from 7 for igrok

    public static void StartCiclPoleIgrok(){
        if (startI<77){
            SdvigPoleIgrok();
        }
    }

    public static void SdvigPoleIgrok(){
        startI++;

        if (startI<77){
            System.out.println(">I>"+startI);
            if(Blok.BlokList.get(startI-7).getIndex()==0
                    && Blok.BlokList.get(startI).getEffect()==0
                    && Blok.BlokList.get(startI).getIndex()>0
                    && Blok.BlokList.get(startI).getStorona()==1
            )
            {
                System.out.println("v___Proverka "+(startI-7));
                WorkBlok.Peremeshenie(startI, startI-7);
            }
            StartCiclPoleIgrok();
        }
        else {
            System.out.println("Cicl stopped to "+startI);
        }
    }

}
