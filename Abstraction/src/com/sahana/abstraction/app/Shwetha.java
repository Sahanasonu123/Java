package com.sahana.abstraction.app;

public class Shwetha {
	
private SmartWatch smartWatch;
	
	public Shwetha(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement in swathi");
	}
	
	public void gettime() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.time();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}
	


}
