package com.mycompany.mygame;

public class Generator {
	
	
	public static int rRand (){
		
		float si = (float) Math.random();
		si*= Koloda.Basakoloda.length-1;
		int sio = (int) Math.ceil(si);
		//sio=sio+1;
	//	System.out.println("Rand= "+sio);
		return sio;
		}
	
	public static float GenRand(int razmer){
		
		float ch = (float) Math.random();
		ch*=razmer; 
		ch = (int) Math.ceil(ch);
		return ch;
	}
	
	

}
