package com.sahana.world;

public class ShoeRunner {

	public static void main(String[] args)
	{

		Shoe shoe1 = new NikeShoe(30000, SizeType.SEVEN , ColorType.GREY , "Jhon Donahoe", "Michael Jordon");
		Shoeutil.sale(shoe1);

		System.out.println("running......");

		Shoe shoe2 = new PumaShoe(10000, SizeType.SIX, ColorType.BLUE, "yash", 1998);
		Shoeutil.sale(shoe2);
	
		
	}

}
