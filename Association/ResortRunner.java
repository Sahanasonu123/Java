package com.sahana.sana;

public class ResortRunner {

	public static void main(String[] args) {

		Resort resort=new Resort("Royal palace");
		resort.setOwnerName("Joseph");
		resort.roomType=ResortRoomType.DELUXE;
		resort.display();
		Resort resort2=new Resort("Wonderla_Resort");
		resort2.setOwnerName("James");
		resort2.roomType=ResortRoomType.STANDARD_ROOMS;
		resort2.display();


	}

}
