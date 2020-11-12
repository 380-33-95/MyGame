package com.mycompany.mygame;

import com.badlogic.gdx.Gdx;

import java.util.ArrayList;

public class LoadLevel {


    public static ArrayList<Integer> AD = new ArrayList<Integer>();


    static int i = 0;

    public static void ReadFile(String NameFile) {

        String gh = Gdx.files.internal(NameFile).readString();


        for (int ifi = 0; ifi <= gh.length() - 1; ifi++
        ) {
            char arr = gh.charAt(ifi);
            AD.add(Integer.parseInt(String.valueOf(arr)));
        }

            int vb = 6;
            for (int nff = 0; nff <= AD.size(); nff += 2) {
                vb++;
                if (AD.size() > nff) {
                    WorkBlok.LoadPoleFromBasa(vb, AD.get(nff), AD.get(nff + 1));
                    //    System.out.println("-> " + vb + " index " + AD.get(nff) + " storona " + AD.get(nff + 1));
                }
            }


    }

}