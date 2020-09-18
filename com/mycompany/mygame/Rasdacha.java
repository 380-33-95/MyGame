package com.mycompany.mygame;

public class Rasdacha extends Blok{
	
	public static void RasdachaStartVse () {


int ii;

		
	for(int i=1; i<=6;i++){
		BlokList.get(i).setIndex((int) Generator.GenRand(Koloda.Basakoloda.length-1));
		Sagruska(i);
		{
		BlokList.get(i).setStorona(2);
		}

		ii=i+77;
		BlokList.get(ii).setIndex((int) Generator.GenRand(Koloda.Basakoloda.length-1));
		Sagruska(ii);
		{
			BlokList.get(ii).setStorona(1);
		}
		}
	
	}


	 public static void Sagruska(int b){

		 //0-index, 1-zdorovie, 2-sila, 3-effect, 4-moov  , 5-storona (1-igrok, 2-vrag), 6-boom,
//	7-flag sabrosa v pole, 8-flag vistrel 9-*
				BlokList.get(b).setHealth(Koloda.Basakoloda[BlokList.get(b).getIndex()][1]);
				BlokList.get(b).setForse(Koloda.Basakoloda[BlokList.get(b).getIndex()][2]);
				BlokList.get(b).setEffect(Koloda.Basakoloda[BlokList.get(b).getIndex()][3]);

		}


	
}

	 
	 
	 
	 
	 
