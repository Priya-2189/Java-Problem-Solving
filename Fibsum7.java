import java.util.Scanner;
class Fibsum7
{
	public static int fib(int n)
	{
	
		if(n==0)
             return 0;
		    
        if(n==1)	
              return 1;
		      
     			
			int a=0, b=1,c=0,sum=a+b;;
				
			for(int i=2;i<n;i++)
			{
				c=a+b;
				sum+=c;
				a=b;
				b=c; 
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
