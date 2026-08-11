public class Lcm
{
	public static int lcm(int a,int b)
	{
	   int x=Math.max(a,b);
	   int y=Math.min(a,b);
	   for(i=x;i<a*x;i=i+x)
	   {
	    if(i%y=0)
		 return i;
	   }
	   return 1;
	}

	public static void main(String args[])
	{
		int a=5;
		int b=10;
	
	  System.out.println( the lcm of two number is"+lcm(a,b));
	}				
}	
			