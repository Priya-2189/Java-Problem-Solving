public class Gcd
{
	public static int gcd(int a,int b)
	{
		
     while(b%a!=0)
	 {
		 int r=b%a;
		 b=a;
		 a=r;
	 }
	 return a;
	}
	public static void main(String args[])
	{
		int a=5;
		int b=10;
	
	  System.out.println( "the gcd of two number is"+a+" "+b+"is"+gcd(a,b));
	}				
}	
			