package com.sahana.abstraction.run;

import com.sahana.abstraction.app.Kidney;
import com.sahana.abstraction.app.HumanKidney;
import com.sahana.abstraction.app.Veena;

public class KidneyRun {

	public static void main(String[] args) {
		System.out.println("Runnin main in Kidney Runner\n");
		
		
		Kidney kid = new HumanKidney();
		
		Veena ve = new Veena(kid);
		ve.getclean();
		
	}
}
