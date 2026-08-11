public class Gcd
{
	public static int gcd(int a,int b)
	{
		
     while(a!=b)
	 {
	  if(a>b)
	   a=a-b;
	  else
       b=b-a;	  
	 }
	 return a;
	}
	public static void main(String args[])
	{
		int a=5;
		int b=10;
	
	  System.out.println( "the gcd of two number is"+gcd(a,b));
	}				
}	
			