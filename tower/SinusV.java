package com.mycompany.tower;

import com.mycompany.draw.DrawTarget;
import com.mycompany.mygame.Blok;
import com.mycompany.mygame.MyGdxGame;

import static com.mycompany.tower.TowerCanon.ListEnemy;
import static java.lang.Math.asin;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;

public class SinusV extends MyGdxGame {

   static int catetX;
    static int catetY;
    static int gippotenusaV;

    public static float getSin() {
        return sin;
    }

    private static float sin;

    public static void Calculate(int kl){

        catetX= ListEnemy.get(kl).getX();
        catetY= HEIGHT-ListEnemy.get(kl).getY();
        gippotenusaV= (int) (sqrt(pow(catetX, 2) + (pow(catetY, 2))));

        if (catetY > 0) {
            sin = (float) toDegrees(asin(catetY / gippotenusaV));
                   }

        System.out.printf("x= %d y=%d gipotenusa= %d sinus=%f",
                catetX,catetY, gippotenusaV, sin);
        System.out.println();

        DrawTarget.StartTarget(catetX,catetY);


    }



}
