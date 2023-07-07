class Infosys{
	
	String founderName;
	String founderWifeName;
	double founded;
	double noOfEmployees;
	
	Infosys()
	{
		System.out.println("running no-args const");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName )
	{
		System.out.println("running String ,String const");
		this. founderName=founderName;
		this. founderWifeName=founderWifeName ;
	}
	Infosys(String founderName,String founderWifeName,double founded )
	{
		this(founderName,founderWifeName );
		System.out.println("running String ,String,double const in infosys");
		this.founded=founded;
	}
	Infosys(String founderName,String founderWifeName,double founded,double noOfEmployees )
	{
		this(founderName,founderWifeName,founded );
		System.out.println("running String ,String,double,double const in infosys");
		this.noOfEmployees=noOfEmployees;
		
	}
}
