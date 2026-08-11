import java.util.Scanner;
class Fib2
{
	public static void fib(int n)
	{
		if(n==1)
             System.out.println(0);
        else if(n==2)	
              System.out.println(0+" "+1);	
        else
		{			
			int a=0, b=1,c=0;
			System.out.print(a+" "+b);	
			for(int i=3;i<n;i++)
			{
				c=a+b;
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
