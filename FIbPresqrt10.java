import java.util.Scanner;
class FibPresqrt10
{
	public static int fib(int n)
	{
	 if(n<=1) return 0;
	 int a=0,b=1;
	 while(b<n)
	 {
		 int temp=a+b;
		 a=b;
		 b=temp;
		 if (b > Math.sqrt(n) * n) break;
	 }
	 return(b==n)?a:-1;
	     		 
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	     int re=fib(n);
		 if(re!=-1)
			 System.out.println(re);
		 else
			 System.out.println(n+"is not a fib");
		
	}
}
