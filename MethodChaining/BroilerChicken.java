package com.sahana.space;

public class BroilerChicken extends Chicken {
	
	 boolean alive;
	 int weight;
	 
	 public BroilerChicken(int price,String location,boolean alive,int weight)
		{
			super(price,location);
			System.out.println("running int ,String,boolean,int const in Broilerchicken");
			this.alive=alive;
			this.weight=weight;
		}
		@Override
	    void printInfo()
		{
			System.out.println("invoking printinfo in Broilerchicken");
			super.printInfo();
			System.out.println(" alive:" + alive);
			System.out.println(" weight:" + weight);
		}

}
