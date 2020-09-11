package com.mycompany.mygame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class BoomTimer implements ActionListener {

    public Timer StepBoom = new Timer(3000, new BoomTimer());

    public void actionPerformed(ActionEvent arg0) {
        // TODO
        int ii = 0;


        for (int pk = 7; pk <= 76; pk++) {

            if (Blok.BlokList.get(pk).getKodBoom() > 0) {
                Blok.BlokList.get(pk).setKodBoom(ii++);

                if (ii == 6) {
                    ii = 0;
                    Blok.BlokList.get(pk).setKodBoom(0);
                }

            }


        }

    }

////////////////////


}


