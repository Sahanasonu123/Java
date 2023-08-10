package com.sahana.abstraction.run;

import com.sahana.abstraction.app.WaterPurifier;
import com.sahana.abstraction.app.Aqua;
import com.sahana.abstraction.app.Suman;

public class WaterPurifierRun {

	public static void main(String[] args) {
		System.out.println("Running main in Water Purifier Runner\n");
		
		WaterPurifier purifier = new Aqua();
		
		Suman sm = new Suman(purifier);
		sm.getPurify();

	}
}
