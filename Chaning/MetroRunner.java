class MetroRunner{
	
	public static void main(String[] args)
	{
		System.out.println("running main method in MetroRunner");
		Metro ref=new Metro("blue",30,"majestic","banashankari",987);
		System.out.println(ref.line);
		System.out.println(ref.distance);
		System.out.println(ref.start);
		System.out.println(ref.destination);
		System.out.println(ref.capacity);
		
	}
	
}