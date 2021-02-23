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

          case 0: {
              break;
          }

          case 8: { //vverh

              VerefyNaPeremeshenie(numblok - 7);
              break;
          }

          case 2: { //vniz

              VerefyNaPeremeshenie(numblok + 7);
              break;
          }

          case 4: { //4-vlevo

              VerefyNaPeremeshenie(numblok - 1);
              break;
          }

          case 6: { //vpravo

              VerefyNaPeremeshenie(numblok + 1);

              break;
          }

          case 5: { //bomba
              BoomBlok.StartBoomBlok(numblok);
              Blok.BlokList.get(numblok).setHealth(0);
              break;
          }

          case 7: {

              break;
          }

      }
        Blok.BlokList.get(numblok).setEffect(0);
    }



    
    public static void VerefyNaUron(int to){

        if (Blok.BlokList.get(to).getIndex() > 0
                && Blok.BlokList.get(to).getEffect() == 0
        ) {
            Blok.BlokList.get(to).setHealth(
                    Blok.BlokList.get(to).getHealth() -
                            Blok.BlokList.get(numblok).getForse()
            );

            Blok.BlokList.get(numblok).setHealth(
                    Blok.BlokList.get(numblok).getHealth() -
                            Blok.BlokList.get(to).getForse()
            );

            ObnulenieAfterUron(numblok);
            ObnulenieAfterUron(to);

        }
    }
    
    
    public static void VerefyNaPeremeshenie(int to) {

        if (Blok.BlokList.get(to).getForse() == 0) {
            WorkBlok.Peremeshenie2(numblok, to);
        }
        if (Blok.BlokList.get(to).getEffect() > 0) {
            SelectEffect(to);
        }
        if (Blok.BlokList.get(to).getForse() > 0) {
            VerefyNaUron(to);
        }

    }

    public static void ObnulenieAfterUron(int nombl) {
        if (Blok.BlokList.get(nombl).getHealth() <= 0 && Blok.BlokList.get(nombl).getForse() > 0) {
            BoomBlok.StartBoomBlok(nombl);
            WorkBlok.ObnulenieKvadratPole(nombl);
        }
    }


} //end class
