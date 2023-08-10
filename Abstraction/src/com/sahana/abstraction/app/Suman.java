package com.sahana.abstraction.app;

public class Suman {
	
	private WaterPurifier purifier;

	public Suman(WaterPurifier purifier) {
		this.purifier = purifier;
	}
	
	public void getPurify() {
		if(purifier!=null) {
			System.out.println("Purify is not null");
			this.purifier.purify();
		}
		else {
			System.err.println("Purify is null, cannot purify");
		}
	}
	
	


}
