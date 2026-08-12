import java.util.Scanner;
class FibTri
{
    public static void tri(int n)
	{
	  int N=n*(n+1)/2;
	  int f[]=new int[N];
	  f[0]=1;
	  f[1]=1;
	   int a=0,b=1,c=0,count=0;
	  for(int i=1;i<=n;i++)
	  {
	    for(int j=1;j<=i;j++)
		{ 
	        c=a+b;
		    System.out.print(c+" ");
			
		     a=b;
			 b=c;
			 
		}
		System.out.println("");
	  }
	}
	 public static void main(String k[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n= sc.nextInt();
		 tri(n);
		 //System.out.println("the number is"+Lfib(n));
		  
	 }
}