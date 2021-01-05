package com.mycompany.enemy;

public class StrategijaSamijBlizkij {

    public static boolean StartSamijBlizkij() {

        boolean result = false;

        boolean mina = false;


        if (Analiz.SamijBlizkijEnemy(13) > 0) {

            if (Analiz.FindZamokMine()
                    && Analiz.VerefyMinaOfKurs(Analiz.SamijBlizkijEnemy(13))
            ) { // esli est mina

                if (Analiz.PerebrosMina(Analiz.SamijBlizkijEnemy(13))) {
                    result = true;
                    mina = true;
                }

            } else {
                mina = false;
                System.out.println("mina false");
            }


            if (!mina && Analiz.FindVeryForseBlok() > 0) {

                System.out.println("Perebros both");
//
                Analiz.PererbrosVpole(Analiz.SamijBlizkijEnemy(13));

                result = true;

            } else {
                result = false;
                System.out.println("false");
                }

        }

        System.out.println(result);
        return result;
    }


    //////****
}
