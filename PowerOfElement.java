import java.util.Scanner;
class PowerOfElement
{
	/**public static int pow(int x,int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			c=x*c;
			
		}
		return c;
	}*/
	public static int pow(int x,int n)
	{
		int res=1;
		while(n>0)
		{
		if(n%2==0)
		{
			x=x*x;
			n=n/2;
		}
		else 
		{
           n=n-1;
           res=res*x;		   
		}
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("The position is"+pow(x,n));
  }
    
}