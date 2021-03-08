package com.mycompany.enemy;

import com.mycompany.mygame.ClickSelector;

public class StrategijFirstEnemy extends SubAnaliz{

    public static void Start(int enemy){

        if(FindEnemy(enemy)>14){//1
			System.out.println("Target = "+getTarget());
			if(FindZamokMine()>0){//2
				
				if(!VerefyMinaOfKurs(getTarget())){
					ClickSelector.TouchPressed(getMinaVZamke());
					PerebrosMina(getTarget());
				}
				
			}//2
			else{
				System.out.println("Min net");
				//TODO find very forse blok from zamok
				FindVeryForseBlok();

				//TODO load to pole
				PererbrosVpole(getTarget());
			}
		}//1
		else{
			System.out.println("Pole pusto");
		}

    }/// end metod Start
	
}// end class
