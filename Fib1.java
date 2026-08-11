import java.util.Scanner;
class Fib1
{
	public static int fib(int n)
	{
		if(n==0)
           return 0;
       if(n==1)	
           return 1;	
      int a=0, b=1,c=0;
     for(int i=2;i<=n;i++)
     {
		 c=a+b;
		 a=b;
		 b=c; 
	 }		 
		  return c;
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("the fibanocci number is"+fib(n));
		
		
	}
}
