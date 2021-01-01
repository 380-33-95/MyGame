package com.mycompany.enemy;

public class StrategijaSamijBlizkij {

    public static boolean StartSamijBlizkij() {

        boolean result = false;

        boolean mina = false;

        if (Analiz.ProverkaPole()) {

            if (Analiz.FindZamokMine()) { // esli est mina

                mina = true;

                if (Analiz.SamijBlizkijEnemy(13) > 0) {

                    if (Analiz.PerebrosMina(Analiz.SamijBlizkijEnemy(13))) {
                        result = true;
                    }


                }

            }
//            else {
//                result = false;
//                System.out.println("false");
//            }

            if (Analiz.FindVeryForseBlok() > 0 && !mina) {

//
                if (Analiz.SamijBlizkijEnemy(13) > 0) {

                    Analiz.PererbrosVpole(Analiz.SamijBlizkijEnemy(13));

                    result = true;


                } else {
                    result = false;
                    System.out.println("false");
                }

            }

        }
        System.out.println(result);
        return result;


    }


    //////****
}
