package com.sahana.abstraction.app;

public class Swathi {
	
private Elevator elevator;
	
	public Swathi(Elevator elevator)
	{
		this.elevator = elevator;
	}

	public void getCarry()
	{
		if(elevator!=null)
		{
			System.out.println("Elevator is not null");
			this.elevator.carry();
		}
		else {
			System.err.println("Elevator is null, cannot carry");
		}
	}

}
