package com.sahana.abstraction.run;

import com.sahana.abstraction.app.SmartWatch;
import com.sahana.abstraction.app.BoatSmartWatch;
import com.sahana.abstraction.app.Shwetha;

public class SmartWatchRunner
{

	public static void main(String[] args)
	{
		System.out.println("Running main in Smart watch Runner\n");
		
		SmartWatch smartWatch = new BoatSmartWatch();
		
		Shwetha sh = new Shwetha(smartWatch);
		sh.gettime();

	}
}


