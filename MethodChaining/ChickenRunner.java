package com.sahana.space;

public class ChickenRunner {

	public static void main(String[] args) {
		
		Chicken chicken=new Chicken(250,"banglore");
		chicken.printInfo();
		
		Chicken chicken1=new FarmChicken(250,"banglore",560,"shreyas");
		chicken1.printInfo();
		
		Chicken chicken2=new BroilerChicken(250,"banglore",true,2);
		chicken2.printInfo();
		
		FarmChicken chicken3=new FarmChicken(250,"banglore",560,"shreyas");
		chicken3.printInfo();

	}

}
