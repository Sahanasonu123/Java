package com.sahana.world;

public class PumaShoe extends Shoe 
{

	String model;
	int origin;
	
	public PumaShoe(long price,SizeType size,ColorType color,String model,int origin)
	{
      		super(price, size, color);
      		this.model=model;
      		this.origin=origin;
	}
	
	void printInfo()
	{
		System.out.println("invoking printInfo in PumaShoe ");
		System.out.println("Shoe price : " + price);
		System.out.println("Shoe Size : " + size);
		System.out.println("Shoe Color : " + color);
		System.out.println("Company model : " + model);
        System.out.println("origin :" + origin);

	}
}
