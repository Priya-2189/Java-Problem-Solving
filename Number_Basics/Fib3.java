import java.util.ArrayList;
import java.util.Scanner;
class Fib3
{
	public static ArrayList<Integer> fib(int n)
	{
		
		ArrayList<Integer>al=new ArrayList<>();
		
		if(n==1)
		{
             al.add(0);
		}	 
        else if(n==2)	
		{
              al.add(0);
		       al.add(1);
		}
        else
		{			
			int a=0, b=1,c=0;
			al.add(a);
			al.add(b);
			for(int i=3;i<=n;i++)
			{
				c=a+b;
				al.add(c);
				a=b;
				b=c; 
			}
	     }	
    return al;		 
	}
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	
		System.out.println("the fibanocci number is"+fib(n));
		
		
	}
}
