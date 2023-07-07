class InfosysRunner{
	
	public static void main (String[] args)
	{
		Infosys infosys=new Infosys("N R Narayanamurthy","Sudhamurthy",1988,276584);
		System.out.println("founder:" +infosys.founderName);
		System.out.println("founderwife:" +infosys.founderWifeName);
		System.out.println("founded:" +infosys.founded);
		System.out.println("noOfEmployees:" +infosys.noOfEmployees);
		
	}
	
}