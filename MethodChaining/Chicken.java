package com.sahana.space;

public class Chicken {
	int price;
	String location;
	
	Chicken(int price,String location)
	{
		System.out.println("running int , String args in chicken");
		this.price=price;
		this.location=location;
	}
	void printInfo() 
	{
		System.out.println("running printinfo in chicken");
		System.out.println("price: " +price);
		System.out.println("location: " +location);


	}
	

}
