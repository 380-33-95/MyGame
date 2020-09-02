package com.mycompany.mygame;

/*
8-vverh
2-vniz
4-vlevo
6-vpravo
 */


public class Effect {

   static int numblok;

    public static void SelectEffect(int numbl){

        numblok=numbl;

      switch (Blok.BlokList.get(numblok).getEffect()){

          case 8:{ //vverh
              if (Blok.BlokList.get(numblok-7).getIndex()>0
                      &&Blok.BlokList.get(numblok-7).getEffect()==0
              )
              {
                  Uron(numblok-7);
              }
              if (Blok.BlokList.get(numblok-7).getHealth()<=0) {
                  WorkBlok.Peremeshenie(numblok, numblok - 7);
              }
              break;
          }
          case 2:{ //vniz

              if (Blok.BlokList.get(numblok+7).getIndex()>0
                      &&Blok.BlokList.get(numblok+7).getEffect()==0
              )
              {
                  Uron(numblok+7);
              }
              if (Blok.BlokList.get(numblok+7).getHealth()<=0) {
                  WorkBlok.Peremeshenie(numblok, numblok + 7);
              }
              break;
          }
          case 4:{ //vlevo
              if (Blok.BlokList.get(numblok-1).getIndex()>0
              &&Blok.BlokList.get(numblok-1).getEffect()==0
              )
              {
                  Uron(numblok-1);
              }
              if (Blok.BlokList.get(numblok-1).getHealth()<=0) {
                  WorkBlok.Peremeshenie(numblok, numblok - 1);
              }
              break;
          }
          case 6:{ //vpravo

              if (Blok.BlokList.get(numblok+1).getIndex()>0
                      &&Blok.BlokList.get(numblok+1).getEffect()==0
              )
              {
                  Uron(numblok+1);
              }
              if (Blok.BlokList.get(numblok+1).getHealth()<=0) {
                  WorkBlok.Peremeshenie(numblok, numblok + 1);
              }
              break;
          }
          case 5:{ //bomba
              Blok.BlokList.get(numblok).setHealth(0);
              break;
          }

      }
        Blok.BlokList.get(numblok).setEffect(0);
    }


    public static void Uron( int oboron){

        Blok.BlokList.get(oboron).setHealth(
                Blok.BlokList.get(oboron).getHealth()-
                        Blok.BlokList.get(numblok).getForse()
        );

        Blok.BlokList.get(numblok).setHealth(
                Blok.BlokList.get(numblok).getHealth()-
                        Blok.BlokList.get(oboron).getForse()
        );

    }

} //end class
