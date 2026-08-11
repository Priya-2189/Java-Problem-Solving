
public class Gcd
{
	public static int gcd(int a,int b)
	{
		
		int p=Math.min(a,b);
		while(p>0)
		{
			if(a%p==0&&b%p==0)
			{
				return p;
				p--;
		    }
        }
		return 1;
	}
	public static void main(String args[])
	{
		int a=5;
		int b=10;
	
	  System.out.println( "the gcd of two number"+a+" "+b+" is "+gcd(a,b));
	}				
}	
			