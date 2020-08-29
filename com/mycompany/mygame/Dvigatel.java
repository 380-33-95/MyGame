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
              if(Blok.BlokList.get(startV+7).getIndex()==0
                    && Blok.BlokList.get(startV).getEffect()==0
                    && Blok.BlokList.get(startV).getIndex()>0
                    && Blok.BlokList.get(startV).getStorona()==2
            )
            {
               WorkBlok.Peremeshenie(startV, startV+ 7);
            }
            StartCiclPoleVrag();
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
                    if(Blok.BlokList.get(startI-7).getIndex()==0
                    && Blok.BlokList.get(startI).getEffect()==0
                    && Blok.BlokList.get(startI).getIndex()>0
                    && Blok.BlokList.get(startI).getStorona()==1
            )
            {
                             WorkBlok.Peremeshenie(startI, startI-7);
            }
            StartCiclPoleIgrok();
        }

    }

}
