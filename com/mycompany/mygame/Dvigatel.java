package com.mycompany.mygame;

public class Dvigatel{

	private static int kli;
	private static int klv;
	
	public static void SdvigKletkaI() {
		/*

		setKli(getKli()+1);
			
			

			if(Peremen.pole[kli][5]==1 && Peremen.pole[kli -7][1]>=1) {
			
			Stolknovenie.StolknoveniePole(kli);
			
						}
					
		if(kli<=69) {
		
				
			if(Peremen.pole[kli][5]==1 && Peremen.pole[kli][4]==1)
			{
				Peremen.pole[kli][3]=Peremen.pole[kli-7][0];	
			//	TimerI.timerPausaI.start();
					
				}
	
			else {
				CiclSdvigI();
				}
		
		}
				Peremen.setOneClik(false);
		}
	
	public static void CiclSdvigI() {
		if(kli<=68) {
		
		SdvigKletkaI();
		}
		else {
			kli=6;
		}
	}
		
	
	
	public static void SdvigKletkaV() {
			setKlv(getKlv()-1);
						
		//	Naezd.Dejstvie(klv);
			
			if(Peremen.pole[klv][5]==2 && Peremen.pole[klv+7][1]>=1) {
		//	System.out.println("v___Proverka kontakta___"+klv);
		
		Stolknovenie.StolknoveniePole(klv);
				
		
				}
		
		if(klv>=0) {
			
			
						
			if(Peremen.pole[klv][5]==2 && Peremen.pole[klv][4]==1 && Peremen.pole[klv+7][1]<=0) {
	//	TimerV.timerPausaV.start();
			}
			else {
				CiclSdvigV();
				}
				
		}
			Peremen.setOneClik(false);
		}
	
	
	
	
	public static void CiclSdvigV() {
		if(getKlv()>=1) {
		SdvigKletkaV();	
			
		}
		else {
			klv=63;
		}
		
	}

	
	
	
	public static int getKli() {
		return kli;
	}

	public static void setKli(int kli) {
		Dvigatel.kli = kli;
	}

	public static int getKlv() {
		return klv;
	}

	public static void setKlv(int klv) {
		Dvigatel.klv = klv;
*/
	}
	

}
