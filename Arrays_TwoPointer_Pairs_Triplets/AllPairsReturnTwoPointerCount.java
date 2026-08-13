import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class AllPairsReturnTwoPointerCount
{
	public static int FindAll(int a[],int n,int  tar)
	{
	  Arrays.sort(a);

		int i=0,j=n-1;
		int c=0;
		while(i<j)
		{
			
				if(a[i]+a[j]==tar)
				{
					c++;
					i++;
					j--;
				}
				else if(a[i]+a[j]<tar)
				{
				 i++;
				}
				else
				{
				 j--;
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