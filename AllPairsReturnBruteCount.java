import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class AllPairsReturnBruteCount
{
	public static int FindAll(int a[],int n,int  tar)
	{
		int c=0;
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==tar)
				{
					c++;
				}
			}
			
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int tar=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the pairs are"+FindAll(a,n,tar));
		
	}
}