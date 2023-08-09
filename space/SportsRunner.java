package com.sahana.space;
public class SportsRunner {
	public static void main(String[] args) {
		Outdoor outdoor = new Outdoor();
	    outdoor.wearShoe();
	    outdoor.ball();
	    outdoor.bat();
	    
		Volleyball voll = new Outdoor();
		voll.ball();
		voll.wearShoe();
		
		Cricket cr =new Outdoor();
		cr.bat();
		cr.wearShoe();
		
		Sports sp=new Outdoor();
		sp.wearShoe();
	
	}

}
