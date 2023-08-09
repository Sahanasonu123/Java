package com.sahana.space;

public interface GroundWater extends Water{
	
	default void notClean() {
		
	}

	@Override
	 void pureWater();
}
