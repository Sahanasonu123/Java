package com.sahana.space;

public class CooldrinkRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Cool Drink Rule Runner\n");
		
		Cooldrink drink1 = new MeCooldrink();
		drink1.getCool();
		
		System.out.println(" ");
		
		Frooti mango = new MeCooldrink();
		mango.buyDrink();
		mango.getCool();
		
		System.out.println(" ");
		
		Maaza apple = new MeCooldrink();
		apple.sellDrink();
		apple.getCool();
		
		System.out.println(" ");
		
		MeCooldrink myDrink = new MeCooldrink();
		myDrink.buyDrink();
		myDrink.sellDrink();
		myDrink.getCool();
		
		
		
	}

}
