import java.util.Scanner;
class Fib5
{
	public static boolean fib(int n)
	{
		if(n==1||n==0)
           return true;
		
			int a=0, b=1,c=0;
			
			while(true)
			{
				c=a+b;
				if(c==n) return true;
				if(c>n) break;
				a=b;
				b=c; 
			}
	     return false;		 
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		//fib(n);
		System.out.println("the fibanocci number is"+fib(n));
		
		
	}
}
