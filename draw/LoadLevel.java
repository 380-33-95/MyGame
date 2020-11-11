package com.mycompany.draw;

import com.badlogic.gdx.Gdx;
import com.mycompany.mygame.WorkBlok;

import java.util.ArrayList;
import java.util.List;

public class LoadLevel {


    public static ArrayList<Integer> AD = new ArrayList<Integer>();
    private static List<Character> chars = new ArrayList<>();

    static int i = 0;

    public static void ReadFile(String NameFile) throws Exception {

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
                System.out.println("-> " + vb + " index " + AD.get(nff) + " storona " + AD.get(nff + 1));
            }
        }


    }

}