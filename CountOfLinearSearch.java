import java.util.Scanner;
class CountOfLinearSearch
{
 public static int  linear(int a[],int n,int x)
	 {
		 int c=0;
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]==x)
				 c++;
			
		 }
		 return c;
	 }
	 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int x=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The position is"+linear(a,n,x));
  }
}