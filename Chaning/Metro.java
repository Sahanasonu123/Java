class Metro{
	
	String line;
    long distance;
	String start;
	String destination;
	long capacity;
	
	Metro()
	{
		System.out.println("running no-args const");
		this.line=line;
	}
	Metro(String line,long distance)
	{
		System.out.println("running string,long const");
		this.line=line;
		this.distance=distance;
	}
	Metro(String line,long distance,String start)
	{
		this(line,distance);
		System.out.println("running string,string,String const");
		this.start=start;
	}
	Metro(String line,long distance,String start,String destination)
	{
		this(line,distance,start);
		System.out.println("running string,long,String,string const");
		this.destination=destination;
	}
	Metro(String line,long distance,String start,String destination,long capacity)
	{
		this(line,distance,start,destination);
		System.out.println("running string,long,String,string,long const");
		this.capacity=capacity;
	}
}