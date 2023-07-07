class Money{
	
	String country;
	String currency;
	String denomination;
	String type;
	
	Money()
	{
		System.out.println("running no-args const");
		this.country=country;
	}
	Money(String country,String currency)
	{
		System.out.println("running string,string const");
		this.country=country;
		this.currency=currency;
	}
	Money(String country,String currency,String denomination)
	{
		this(country,currency);
		System.out.println("running string,string,String const");
		this.denomination=denomination;
	}
	Money(String country,String currency,String denomination,String type)
	{
		this(country,currency,denomination);
		System.out.println("running string,string,String,string const");
		this.type=type;
	}
}