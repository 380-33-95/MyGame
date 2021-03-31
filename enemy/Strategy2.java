package com.mycompany.enemy;

public class Strategy2 extends Analiz{

    public static boolean isSvetofor() {
        return svetofor;
    }

    public static void setSvetofor(boolean svet) {
        svetofor = svet;
    }

    private static boolean svetofor;


    public static void Start(int enemy){

        FindEnemy(enemy);

        if(getTarget()>13 && getTarget()<77)
        {//если есть цель

            FindZamok(6); //ищем мину
            if(getIndexZamok()>0)
            {//если есть мина
                VerefyOfKurs(getTarget(), 6);//ищем мину на курсе
                if (!isIndexToLine())
                {//если мины нет на курсе
                    VerefyFreeBlokForPerebros(getTarget());//ищем пустую клетку
                    if (getTargetForPerebros()>13 && getTargetForPerebros()<41)
                    {//если есть пустая клетка
                        PerebrosVpole(getTargetForPerebros());//загружаем мину
                        setSvetofor(true);
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
                FindZamok(11);//ищем риф
                if (getIndexZamok()>0)
                {//есть риф в замке
                    VerefyOfKurs(getTarget(),11);//ищем риф по курсу цели
                    if(!isIndexToLine())
                    {//если рифа нет на курсе
                        VerefyFreeBlokForPerebros(getTarget());//ищем пустую клетку
                        if (getTargetForPerebros()>13 && getTargetForPerebros()<41)
                        {//если есть пустая клетка
                            PerebrosVpole(getTargetForPerebros());//загружаем мину
                            setSvetofor(true);
                        }
                        else{//если нет пустой клетки
                            Start(getTarget()-1); //ищем новую цель*
                        }

                    }
                    else{//если риф есть на курсе
                        System.out.println("на курсе риф!!!");
                        Start(getTarget()-1); //ищем новую цель*
                    }
                }
                else{// если рифа в замке нет

                    FindVeryForseBlok();//ищем корабль
                    if (getTarget()>13 && getTarget()<77)
                    {//если есть корабль
                        VerefyBlokForLoadEnemyBoat(getTarget());//ищем пустую клетку
                        if(getTargetForPerebros()>0){//если есть пустая клетка
                           PerebrosVpole(getTargetForPerebros());
                            setSvetofor(true);
                        }
                        else {//если нет пустой клетки
                            Start(getTarget()-1); //ищем новую цель*
                             }
                    }
                    else{ //если корабля нет
                        //ищем эффект
                        if(true) //если есть эффект
                        {
                            //ищем пустую клетку
                            //если есть пустая клетка

                            //если нет пустой клетки
                        }
                        else
                            {//если эффекта нет

                            }
                        }

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



    ///////////// end class
}
