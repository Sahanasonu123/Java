package com.sahana.world;

public class Shoeutil {
	
	static void sale(Shoe shoe)
	{
		System.out.println("Running sale in ShoeUtil..");

		if(shoe != null)
		{
			System.out.println("Running Null check for shoe in ShoeUtil");
		}
		else
		{
			System.err.println("Please provide a Valid shoe");
		}

			if(shoe instanceof NikeShoe)
			{

				NikeShoe nikeShoe = (NikeShoe)shoe;
					nikeShoe.printInfo();
		    }

			if(shoe instanceof PumaShoe)
			{

				PumaShoe pumaShoe = (PumaShoe)shoe;
					pumaShoe.printInfo();
			}
  }


}


