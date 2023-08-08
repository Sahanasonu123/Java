package com.sahana.world;

public class Shoe 
{

	long price;
	SizeType size;
	ColorType color;

	public Shoe(long price, SizeType size, ColorType color)
	{
		System.out.println("Running long, SizeType, ColorType in Shoe");
		this.price = price;
		this.size = size;
		this.color = color;
	}

}
