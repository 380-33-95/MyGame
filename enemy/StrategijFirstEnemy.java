package com.mycompany.enemy;

public class StrategijFirstEnemy extends SubAnaliz{

    public static void Start(){

        if(FindEnemy(14)>14){//1
			
			if(FindZamokMine()>0){//2
				
				if(!VerefyMinaOfKurs(getTarget())){
					
					PerebrosMina(getTarget());
				}
				
			}//2
			else{
				
			}
		}//1
		else{
			
		}

    }/// end metod Start
	
}// end class
