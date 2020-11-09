package com.mycompany.draw;

import com.mycompany.mygame.WorkBlok;

import java.util.ArrayList;

public class LoadLevel {


    public static ArrayList<Integer> AD = new ArrayList<Integer>();


    static int i = 0;

    public static void ReadFile(String NameFile) {

        System.out.println("1 " + NameFile);

        for (int ifi = 0; ifi <= NameFile.length() - 1; ifi++
        ) {

            char nf = NameFile.charAt(ifi);
            String zx = "" + nf;
            int xc = Integer.parseInt(zx);
            AD.add(xc);

            System.out.println(AD.get(ifi));
        }

        System.out.println("2 " + AD.size());

        int vb = 6;
        for (int nff = 0; nff <= AD.size(); nff += 2) {
            vb++;
            if (AD.size() > nff) {
                WorkBlok.LoadPoleFromBasa(vb, AD.get(nff), AD.get(nff + 1));
                System.out.println("-> " + vb + " index " + AD.get(nff) + " storona " + AD.get(nff + 1));
            }
        }


    }

}