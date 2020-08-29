package com.mycompany.mygame;

public class Sdvig extends Blok{
	
	public static void SdvigZamokI() {
		
		System.out.println("sdvig I");
		
		for (int sdi=0; sdi<=4; sdi++) {
			int sdii=5-sdi;
		//	System.out.println("sdvig I="+sdii);
			if(BlokList.get(sdii).getIndex()==0) {
		//		System.out.println("sdvig I2="+sdii);
				WorkBlok.Peremeshenie(sdii-1, sdii);
				}

		}
		
		if(b00.getIndex()==0) {
		int nv=(int) Generator.GenRand(Koloda.Basakoloda.length-1);
		for(int sn=0; sn<=9; sn++) {
	//	Peremen.riz[0][sn]=Koloda.Basakoloda[nv][sn];
		}
		}
		
	}

	/*
	public static void SdvigV() {
		for (int sdv=0; sdv<=4; sdv++) {
			if(Peremen.rvz[sdv][0]==0) {
			//	System.out.println("sdvig V="+sdv);
				Kopirovanie.KopirovanieV(sdv+1, sdv);
				
			}
			
			
		}
		
		if(Peremen.rvz[5][0]==0) {
		int nv=(int) Generator.GenRand(Koloda.Basakoloda.length-1);
		for(int sn=0; sn<=9; sn++) {
		Peremen.rvz[5][sn]=Koloda.Basakoloda[nv][sn];	
		}	
		}

	}
	
	*/
	
	
	/////////////////////////////////////////
}
