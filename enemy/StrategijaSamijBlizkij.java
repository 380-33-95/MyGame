package com.mycompany.enemy;

public class StrategijaSamijBlizkij {

    public static boolean StartSamijBlizkij() {

        boolean result = false;

        if (Analiz.ProverkaPole()) {

            if (Analiz.FindVeryForseBlok() > 0) {

//
                if (Analiz.SamijBlizkijEnemy(13)) {

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
