package com.mycompany.mygame;

public class Dvigatel {

                public static int startV;
                public static int finishV;

                public static int startI;
                public static int finishI;

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
        finishV=startV+7;

        if ((startV>6) && (Blok.BlokList.get(startV).getEffect()==0)
                        && Blok.BlokList.get(startV).getStorona()==2)
            {

            //esli vperedi object
            if (Blok.BlokList.get(finishV).getIndex() > 0
                    && Blok.BlokList.get(startV).getForse()>0
                    && Blok.BlokList.get(finishV).getStorona()==1
            )
            {
               Stolknovenie.StolknoveniePole(startV);
            }


            // esli vperedi pusto ili effect
                if (Blok.BlokList.get(finishV).getIndex() == 0
                    ||
                    (Blok.BlokList.get(finishV).getEffect() > 0)
               )
            {
                WorkBlok.Peremeshenie(startV, finishV);
            //esli vperedi effect
            if (
                    Blok.BlokList.get(finishV).getIndex() > 0
                    && Blok.BlokList.get(finishV).getEffect() > 0
                //    && Blok.BlokList.get(startV).getStorona() == 2
            ) {
                System.out.println("*effect!!!*");
                Effect.SelectEffect(finishV);
            }
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
        finishI = startI - 7;

        if ((startI < 77) && (Blok.BlokList.get(startI).getEffect() == 0)
                && Blok.BlokList.get(startI).getStorona() == 1
                && Blok.BlokList.get(startI).getHealth() > 0) {

            //esli vperedi object
            if (Blok.BlokList.get(startI - 7).getIndex() > 0
                    && Blok.BlokList.get(startI).getForse() > 0
                    && Blok.BlokList.get(finishI).getStorona() == 2
            ) {
                Stolknovenie.StolknoveniePole(startI);
            }

            // esli vperedi pusto ili effect
                    if(Blok.BlokList.get(finishI).getIndex()==0
                   ||
                            (Blok.BlokList.get(finishI).getEffect()>0)
                    )
            {
                WorkBlok.Peremeshenie(startI, finishI);
                //esli vperedi effect

                if (
                        Blok.BlokList.get(finishI).getIndex() > 0
                                && Blok.BlokList.get(finishI).getEffect() > 0
                    //  && Blok.BlokList.get(finishI).getStorona()==2
                ) {
                    System.out.println("*effect!!!*");
                    Effect.SelectEffect(finishI);
                }
                }

        }

                    StartCiclPoleIgrok();

         }

}
