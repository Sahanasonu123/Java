package com.sahana.abstraction.run;

import com.sahana.abstraction.app.Shriya;
import com.sahana.abstraction.app.Laptop;
import com.sahana.abstraction.app.HpLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Laptop Runner\n");
		
		Laptop laptop =  new HpLaptop();	
	
		Shriya sr =  new Shriya(laptop);
		sr.getDisplay();
	
	}

}
