Class Add{
   void sum(int....values){
	   System.out.println("length is "+values.length);
	   int sum=0;
	   for (int i=0;i<values.length;i++){
		   sum=values[i];
	   }
	   System.out.println("sum is "+sum);
   }
   public static void main(String[] args){
	   Add add=new Add();
	   add.sum(10,30,60,100);
   }
}