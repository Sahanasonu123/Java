package com.sahana.space;

public interface Maaza extends Cooldrink {
	
	@Override
	 void getCool();
	
	default void sellDrink() 
	{
			System.out.println("selling Cool drink in Cool Drink");
	}

}
