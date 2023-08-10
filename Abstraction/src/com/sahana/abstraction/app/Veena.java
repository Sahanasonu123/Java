package com.sahana.abstraction.app;

public class Veena {
	
private Kidney kidney;
	
	public Veena(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of Veena");
	}

	public void getclean()
	{
		if(kidney!=null)
		{
			System.out.println("kidney is not null");
			this.kidney.clean();
		}
		else 
		{
			System.err.println("Kidney is null, kidney not working...");
		}
	}

}
