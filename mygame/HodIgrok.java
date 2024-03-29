package com.mycompany.mygame;

import com.mycompany.draw.DrawBoolet;
import com.mycompany.draw.DrawSmenaHoda;
import com.mycompany.enemy.StartEnemy;
import com.mycompany.tower.TowerCanon;

import static com.mycompany.mygame.WorkBlok.ObnulenieKvadratZamok;

public class HodIgrok extends ClickSelector {

   public static void HodIgrokZamok() {

       //

       WorkBlok.ObnulenieBufer();
       LoadBufer.LoadVBufer(getNC());
       WorkBlok.ObnulenieFinishI();
       //    WorkBlok.ObnulenieFinish();
       Peremen.setKodZamok(getNC());

       if (Dvigatel.startCiclIgrok) {
           Dvigatel.startI = 13;
           Dvigatel.StartCiclPoleIgrok();
           Dvigatel.startCiclIgrok = false;
           Dvigatel.startCiclVrag = true;
       }
   }


   public static void HodIgrokPole() {
       WorkBlok.LoadFlagBulet(2);
       WorkBlok.ChangeStoun();
       WorkBlok.LoadPoleBlok();
       WorkBlok.ObnulenieBufer();
       ObnulenieKvadratZamok(Peremen.getKodZamok());
       WorkBlok.SdvigZamokI();

       //   MyMusik.MapSound.get(3).play();

       TowerCanon.MatricaEnemyV();

       setSmenaHoda(false);
       DrawSmenaHoda.sun = false;
       DrawSmenaHoda.CircleSun = WIDTH - WIDTH / 7;

       DrawBoolet.StartDrawBulet();
       StartEnemy.StartEnemyStrategy();
   }

   }
