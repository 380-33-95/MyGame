package com.mycompany.mygame;

public class Dvigatel {

                public static int startV;

                public static int startI;

                public static boolean startCiclVrag=true;

                public  static boolean startCiclIgrok=true;


  //start from 69 for vrag

    public static void StartCiclPoleVrag(){
        if (startV>6){
            SdvigPoleVrag();
        }
    }

    public static void SdvigPoleVrag(){
        startV--;

        if ((startV>6) && (Blok.BlokList.get(startV).getEffect()==0)) {

            //esli vperedi effect
            if (Blok.BlokList.get(startV + 7).getIndex() > 0
                    && Blok.BlokList.get(startV + 7).getEffect() > 0
            ) {
                System.out.println("effect!!!");
            }

            //esli vperedi object
            if (Blok.BlokList.get(startV + 7).getIndex() > 0
                    && Blok.BlokList.get(startV).getForse()>0
                    && Blok.BlokList.get(startV + 7).getStorona()==1
            )
            {
               System.out.println("stolknovenie!!!");
               Stolknovenie.StolknoveniePole(startV);
            }

            // esli vperedi pusto
            if (Blok.BlokList.get(startV + 7).getIndex() == 0
                    && Blok.BlokList.get(startV).getEffect() == 0
                    && Blok.BlokList.get(startV).getIndex() > 0
                    && Blok.BlokList.get(startV).getStorona() == 2
            )
            {
                WorkBlok.Peremeshenie(startV, startV + 7);
            }
        }
        StartCiclPoleVrag();

    }


    //start from 7 for igrok

    public static void StartCiclPoleIgrok(){
        if (startI<77){
            SdvigPoleIgrok();
        }
    }

    public static void SdvigPoleIgrok(){
        startI++;

        if ((startI<77)&& (Blok.BlokList.get(startI).getEffect()==0)){

            //esli vperedi effect
            if(Blok.BlokList.get(startI-7).getIndex()>0
                    &&Blok.BlokList.get(startI-7).getEffect()>0
            ){
                System.out.println("effect!!!");
            }

            //esli vperedi object
            if(Blok.BlokList.get(startI-7).getIndex()>0
                    && Blok.BlokList.get(startI).getForse()>0
                    &&Blok.BlokList.get(startI-7).getStorona()==2
            )
            {
                System.out.println("stolknovenie!!!");
                Stolknovenie.StolknoveniePole(startI);
            }

            // esli vperedi pusto
                    if(Blok.BlokList.get(startI-7).getIndex()==0
                    && Blok.BlokList.get(startI).getEffect()==0
                    && Blok.BlokList.get(startI).getIndex()>0
                    && Blok.BlokList.get(startI).getStorona()==1
            )
            {
                             WorkBlok.Peremeshenie(startI, startI-7);
            }
        }
            StartCiclPoleIgrok();
         }

}
