public class Lcm
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
	public static int lcm(int a,int b)
	{
		int ans=gcd(a,b);
		int ans1=(a*b)/ans;
	}
	public static void main(String args[])
	{
		int a=5;
		int b=10;
	
	  System.out.println( "the lcm of two number is"+lcm(a,b));
	}				
}	
			