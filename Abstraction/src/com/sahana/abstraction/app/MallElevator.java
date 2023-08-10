package com.sahana.abstraction.app;

public class MallElevator implements Elevator {
	
	@Override
	public void carry() {
		System.out.println("carry is running in Mall Elevator");
	}
}
