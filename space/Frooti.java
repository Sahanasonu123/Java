package com.sahana.space;

public interface Frooti extends Cooldrink {
	
	@Override 
	void getCool();
	
	default void buyDrink() 
{
		System.out.println("Buying Cool drink in Cool Drink");
}

}
