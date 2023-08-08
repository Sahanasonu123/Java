package com.sahana.space;

public class FarmChicken extends Chicken {
	
	int noOfChicken;
	String careTakerName;
	
	public FarmChicken(int price,String location,int noOfChicken,String careTakerName)
	{
		super(price,location);
		System.out.println("running int ,String,int,string const in Farmchicken");
		this.careTakerName=careTakerName;
		this.noOfChicken=noOfChicken;
	}
	@Override
    void printInfo()
	{
		System.out.println("invoking printinfo in Farmchicken");
		super.printInfo();
		System.out.println(" noOfChicken:" + noOfChicken);
		System.out.println(" careTakerName:" + careTakerName);
	}
}
