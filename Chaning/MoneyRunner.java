class MoneyRunner{
	
	public static void main(String[] args)
	{
		System.out.println("running main method in MoneyRunner");
		Money ref=new Money("India","rupees","two thousand","cash");
		System.out.println(ref.country);
		System.out.println(ref.currency);
		System.out.println(ref.denomination);
		System.out.println(ref.type);
		
	}
	
}