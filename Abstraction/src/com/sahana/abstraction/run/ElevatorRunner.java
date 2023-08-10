package com.sahana.abstraction.run;

	
	import com.sahana.abstraction.app.Elevator;
	import com.sahana.abstraction.app.MallElevator;
	import com.sahana.abstraction.app.Swathi;

	public class ElevatorRunner{

		public static void main(String[] args)
		{
			System.out.println("Running main in Elevator Runner\n");
			
			Elevator elevator = new MallElevator();
			
			Swathi sw = new Swathi(elevator);
			sw.getCarry();
		}


}
