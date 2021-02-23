package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class LoadLevel {


    public static ArrayList<Integer> AD = new ArrayList<Integer>();


    static int i = 0;

    public static void ReadFile(String NameFile) {

        String gh = Gdx.files.internal(NameFile).readString();
        char arr = 0;
        char arr2 = 0;
        int yu = 0;

        for (int ifi = 0; ifi <= gh.length() - 1; ifi += 2) {

            arr = gh.charAt(ifi);
            arr2 = gh.charAt(ifi + 1);


            int irr = Integer.parseInt(String.valueOf(arr)) * 10;
            int irr2 = Integer.parseInt(String.valueOf(arr2));
            irr += irr2;

            if (irr < 99) {

                AD.add(irr);
                yu++;
            } else {
                ifi += 2;
            }

        }

            int vb = 6;
            for (int nff = 0; nff <= AD.size(); nff += 2) {
                vb++;
                if (AD.size() > nff) {
                    WorkBlok.LoadPoleFromBasa(vb, AD.get(nff), AD.get(nff + 1));
                    //
                }
            }


    }

}