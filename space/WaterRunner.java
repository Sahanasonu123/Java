package com.sahana.space;

public class WaterRunner {

	public static void main(String[] args) {
		Kinley kn = new Kinley();
	    kn.pureWater();
	    kn.notClean();
	    kn.minerals();
	    
		Bisleri bs = new Kinley();
		bs.pureWater();
		bs.minerals();
		
	    GroundWater gw =new Kinley();
		gw.pureWater();
		gw.notClean();
		
		Water wa=new Kinley();
		wa.pureWater();
	

	}

}
