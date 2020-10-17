package com.mycompany.mygame;

public class Generator {
	static int sio;
	
	public static int rRand (){
		
		float si = (float) Math.random();
		si*= Koloda.Basakoloda.length-1;
		 sio= (int) Math.ceil(si);

		return sio;
		}
	
	public static float GenRand(int razmer){
		
		float ch = (float) Math.random();
		ch*=razmer; 
		ch = (int) Math.ceil(ch);
		return ch;
	}
	
	

}
