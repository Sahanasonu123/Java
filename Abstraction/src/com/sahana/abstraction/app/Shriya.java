package com.sahana.abstraction.app;

public class Shriya {
	
	private Laptop laptop;
	 
	public Shriya(Laptop laptop) {
		this.laptop = laptop;
	}

	public void getDisplay() 
	{
		if(laptop!=null) {
			System.out.println("Laptop is not null");
			this.laptop.display();
			
		}
		else {
			System.err.println("laptop is null, cannot display");
		}
	}

	

}
