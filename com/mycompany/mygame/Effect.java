package com.mycompany.mygame;

/*
8-vverh
2-vniz
4-vlevo
6-vpravo
 */


public class Effect {

    public static void SelectEffect(int numblok){

      switch (Blok.BlokList.get(numblok).getEffect()){

          case 8:{
              WorkBlok.Peremeshenie(numblok,numblok-7);
              break;
          }
          case 2:{
              WorkBlok.Peremeshenie(numblok,numblok+7);
              break;
          }
          case 4:{
              WorkBlok.Peremeshenie(numblok,numblok-1);
              break;
          }
          case 6:{
              WorkBlok.Peremeshenie(numblok,numblok+1);
              break;
          }
          case 5:{
              Blok.BlokList.get(numblok).setHealth(0);
              break;
          }

      }
        Blok.BlokList.get(numblok).setEffect(0);
    }

} //end class
