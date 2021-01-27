package com.mycompany.mygame;

public class Peremen extends MyGdxGame{


	//krop 1 or 1,8 or 2,7
	public static final double KROP=2.7;

	private static int MenuSt=5700;
										public static int getMenuSt() {
											return MenuSt;
										}

										public static void setMenuSt(int menuSt) {
											MenuSt = menuSt;
										}



	private static int KnopkaStart=3000;

	public static int getKnopkaStart() {
		return KnopkaStart;
	}

	public static void setKnopkaStart(int knopkaStart) {
		KnopkaStart = knopkaStart;
	}


	public static int Boj = 3100;

	public static int getBoj() {
		return Boj;
	}

	public static int HodIgrok = 2900;

	public static int HodVrag = 2900;

	public static int KonecBoj = 4400;

	public static int ChejHod = 2200;

	private static int Step;

	public static int getStep() {
		return Step;
	}

	public static void setStep(int a) {
		Step = a;
										}
	



	
    
    private static int stepX;
    public static int getStepX(){
    	    	return stepX;
    }
    
    public static void setStepX(int a){
    stepX=a;
    }


    ////////////////////////////////////////////////////////

    private static boolean flagStrelkaIgrok;
    private static boolean flagStrelkaVrag;


//	private static boolean SmenaHoda; //true - igrok; false - vrag;
//
//	public static boolean isSmenaHoda() {
//		//System.out.println("isHod="+SmenaHoda);
//		return SmenaHoda;
//	}
//
//	public static void setSmenaHoda(boolean smenaHoda) {
//		SmenaHoda = smenaHoda;
//
//    }


    private static int KodZamok;

    public static int getKodZamok() {
        //System.out.println("getKZV="+KodZamokV);
        return KodZamok;
    }

	public static void setKodZamok(int kodZamok) {
		KodZamok = kodZamok;

    }
	
	private static int KodPole;
	    
	    public static int getKodPole() {
	    //	System.out.println("*********KP="+KodPole);
			return KodPole;
		}

		public static void setKodPole(int KodPole) {
			Peremen.KodPole = KodPole;
		//	System.out.println("*********KP="+KodPole);
		}


	private static int BannerChejHod=0;
		public static int getBannerChejHod() {
			return BannerChejHod;
		}

		public static void setBannerChejHod(int bannerChejHod) {
			BannerChejHod = bannerChejHod;
		}
		

		
		private static int Win=0;
		
		public static int getWin() {
			return Win;
		}

		public static void setWin(int win) {
			Win = win;
		}


	private static int maska;
	public static void setMaska(int msk){
		maska=msk;
	}
	public static int getMaska(){
		return maska;
	}


	///////////////////

	
}

