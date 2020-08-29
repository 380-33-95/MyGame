package com.mycompany.mygame;

public class Dvigatel{

	private static int kli;
	private static int klv;
	
	public static void SdvigKletkaI() {

		if(Blok.BlokList.get(getKli()-7).getIndex()==0
			&& Blok.BlokList.get(getKli()).getEffect()==0
			&& Blok.BlokList.get(getKli()).getIndex()>0
			&& Blok.BlokList.get(getKli()).getStorona()==1
		)
		{
			System.out.println("i___Proverka "+(getKli()-7));
			WorkBlok.Peremeshenie(getKli(), getKli()- 7);
			setKli(getKli()+1);
		}
		else
		{
			System.out.println("i___Proverka kontakta___"+(getKli()-7));
			setKli(getKli()+1);
		}

		if (getKli()<77) {

			CiclSdvigI();

		}

		Peremen.setOneClik(false);

	}



	public static void CiclSdvigI() {

		if(getKli()<70) {

			SdvigKletkaI();

		}

	}




	public static void SdvigKletkaV() {

		if(Blok.BlokList.get(getKlv()+7).getIndex()==0
				&& Blok.BlokList.get(getKlv()).getEffect()==0
				&& Blok.BlokList.get(getKlv()).getIndex()>0
				&& Blok.BlokList.get(getKlv()).getStorona()==2
		){
			System.out.println("v___Proverka "+(getKlv()+7));
			WorkBlok.Peremeshenie(getKlv(), getKlv() + 7);
			setKlv(getKlv()-1);
		}
		else{
			System.out.println("v___Proverka kontakta___"+(getKlv()+7));
			setKlv(getKlv()-1);
		}

		if (getKlv()>6) {

			CiclSdvigV();

			}

		Peremen.setOneClik(false);

	}
	
	
	
	public static void CiclSdvigV() {

		if(getKlv()>6) {

		SdvigKletkaV();

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

	}
	

}
