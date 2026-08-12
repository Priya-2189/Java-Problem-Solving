import java.util.Scanner;
class FibCsum8
{
	public static int fib(int n)
	{
	
		if(n<=0)
             return 0;
		 int fib[]=new int[n];
		 fib[0]=0;
		 
		    
        if(n>1)
         fib[1]=1;			
          int sum=fib[0]+fib[1];
		      
			for(int i=2;i<n;i++)
			{
				fib[i]=fib[i-1]+fib[i-2];
				sum+=fib[i];				
			}
	     	
     return sum;		 
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
