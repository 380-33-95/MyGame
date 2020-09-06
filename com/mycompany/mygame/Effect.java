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
case 0:{break;}

          case 8:{ //vverh
      VerefyNaUron(numblok-7);
              
      VerefyNaPeremeshenie(numblok-7);
              break;
          }
		  
          case 2:{ //vniz

      VerefyNaUron(numblok+7);
      
      VerefyNaPeremeshenie(numblok+7);
              break;
          }
		  
          case 4:{ //4-vlevo
          
          VerefyNaUron(numblok-1);
              
          VerefyNaPeremeshenie(numblok-1);
              break;
          }
		  
          case 6:{ //vpravo

         VerefyNaUron(numblok+1);
         
        VerefyNaPeremeshenie(numblok+1);
        
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
    
    public static void VerefyNaUron(int to){
      
if(Blok.BlokList.get(to).getIndex()>0
                      &&Blok.BlokList.get(to).getEffect()==0
              )
              {
                  Uron(to);
              }
    }
    
    
    public static void VerefyNaPeremeshenie(int to){
   //   int bufeffect;

  //bufeffect=Blok.BlokList.get(to).getEffect();
                  WorkBlok.Peremeshenie2(numblok, to);
				  numblok=to;
				Blok.BlokList.get(numblok).setEffect(7);
                  SelectEffect(to);
              
    }

} //end class
