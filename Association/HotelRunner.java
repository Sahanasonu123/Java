package com.sahana.sana;

public class HotelRunner {

	public static void main(String[] args) {

		Hotel hotel=new Hotel("Udupi","BTM",50,"Superier_Room");
		hotel.printInfo();
		
		Hotel hotel1=new Hotel("ABC","Chittor",60,"Suite");
		hotel1.printInfo();

	}

}
