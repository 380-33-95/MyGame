package com.mycompany.enemy;

public class StrategijFirstEnemy extends SubAnaliz
{
////////////////////////////////////////////////////////
	private static boolean freeblok;

	public static boolean isFreeblok() {
		return freeblok;
	}

	public static void setFreeblok(boolean freeblok) {
		StrategijFirstEnemy.freeblok = freeblok;
	}
/////////////////////////////////////////////////////////



	public static void Start(int enemy)
	{


		FindEnemy(enemy);

		if(getTarget()>13 && getTarget()<77)
		{//если есть цель
			{//ищем мину

			}



			{//ищем корабль
				if(FindVeryForseBoatEnemy.FindVeryForseBoat()>0){
					FindVeryForseBoatEnemy.FreeBlok(getTarget());
				}
				else
				{
					System.out.println("not boat");
				}
			}








					//если есть корабль

					//если корабля нет

					//ищем эффект
					//если есть эффект
					//ищем пустую клетку
					//если есть пустая клетка

					//если нет пустой клетки

					//если эффекта нет
		}
		else //если цели нет
		{

		}



			////ищем эффект
			//если есть эффект
			//ищем пустую клетку
			//если есть пустая клетка

			//если нет пустой клетки

			//если эффекта нет

	}



}// end class