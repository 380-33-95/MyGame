package com.mycompany.enemy;

public class StrategijFirstEnemy extends SubAnaliz{

	public static void Start(int enemy){

		FindEnemy(enemy);

	if(getTarget()>13 && getTarget()<77)
	{//если есть цель
		FindZamokMine(); //ищем мину
		if(getMinaVZamke()>0)
		{//если есть мина
			VerefyMinaOfKurs(getTarget());//ищем мину на курсе
				if (!isMinaNaLine())
				{//если мины нет на курсе
					VerfyFreeBlokForPerebrosMina(getTarget());//ищем пустую клетку
					if (getPerebrosMina()>13 && getPerebrosMina()<41)
					{//если есть пустая клетка
						PerebrosVpole(getPerebrosMina());//загружаем мину
					}
					else
						{//если нет пустой клетки
							Start(getTarget()-1); //ищем новую цель*
						}
				}
				else{//если мина есть на курсе
					 System.out.println("на курсе мина!!!");
					 Start(getTarget()-1); //ищем новую цель*
					}
		}
		else//если нет мины
			{
				FindZamokRif();//ищем риф
				if (getRif()>0)
				{//есть риф в замке
					VerefyRifOfKurs(getTarget());//ищем риф по курсу цели
					if(!isRifNaKurse())
					{//если рифа нет на курсе

					}
					else{//если риф есть на курсе

						}
				}
				else{// если рифа в замке нет
					//ищем корабль
						//если есть корабль

						//если корабля нет

							//ищем эффект
								//если есть эффект
									//ищем пустую клетку
										//если есть пустая клетка

										//если нет пустой клетки

								//если эффекта нет
					}
			}
	}
	else{//если цели нет

			////ищем эффект
										//если есть эффект
											//ищем пустую клетку
												//если есть пустая клетка

												//если нет пустой клетки

										//если эффекта нет

		}



		

	}




	
}// end class
