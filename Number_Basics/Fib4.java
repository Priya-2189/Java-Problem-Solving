import java.util.Scanner;
class Fib4
{
	public static void fib(int n)
	{
		if(n==1)
             System.out.println(0);

        else
		{			
			int a=0, b=1,c=0;
			System.out.print(a+" "+b);	
			while(true)
			{
				c=a+b;
				if(c>n) break;
				System.out.print(c+" ");
				a=b;
				b=c; 
			}
	     }		 
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		fib(n);
		//System.out.println("the fibanocci number is"+fib(n));
		
		
	}
}
