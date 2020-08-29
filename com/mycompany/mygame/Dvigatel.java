package com.mycompany.mygame;

public class Dvigatel{

	private static int kli;
	private static int klv;
	private static boolean ciclDvigatelI;
	private static boolean ciclDvigatelV;



	public static void SdvigKletkaI() {

		setKli(kli+1);

		if(Blok.BlokList.get(getKli()-7).getIndex()==0
			& Blok.BlokList.get(getKli()).getIndex()>0
			& Blok.BlokList.get(getKli()).getEffect()==0
			& Blok.BlokList.get(getKli()).getStorona()==1
		)
		{
			System.out.println("i___Sdvig "+kli);
			WorkBlok.Peremeshenie(getKli(), (getKli()- 7));
		}
		else
		{
			System.out.println("i___next___"+(getKli()-7));
		}

		if (getKli()<=76) {
							CiclSdvigI();
		}

	}



	public static void CiclSdvigI() {

		if(getKli()<=76) {

			SdvigKletkaI();

		}

	}




	public static void SdvigKletkaV() {

		setKlv(klv-1);

		if(Blok.BlokList.get(getKlv()+7).getIndex()==0
				& Blok.BlokList.get(getKlv()).getIndex()>0
				& Blok.BlokList.get(getKlv()).getEffect()==0
				& Blok.BlokList.get(getKlv()).getStorona()==2
		)
		{
			System.out.println("v___Proverka "+(getKlv()+7));
			WorkBlok.Peremeshenie(getKlv(), getKlv() + 7);
		}
		else{
			System.out.println("v___next___"+(getKlv()+7));
			}

		if (getKlv()>=7) {
							CiclSdvigV();
			}

		Peremen.setOneClik(false);

	}

	
	public static void CiclSdvigV() {

		SdvigKletkaV();

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


	public static boolean isCiclDvigatelI() {
		return ciclDvigatelI;
	}

	public static void setCiclDvigatelI(boolean ciclDvigatelI) {
		Dvigatel.ciclDvigatelI = ciclDvigatelI;
	}

	public static boolean isCiclDvigatelV() {
		return ciclDvigatelV;
	}

	public static void setCiclDvigatelV(boolean ciclDvigatelV) {
		Dvigatel.ciclDvigatelV = ciclDvigatelV;
	}
}
