import java.util.Scanner;
import java.util.Arrays;
class Pointer2SumBiaInde3
{
	public static int[] isSum(int a[],int n,int tar)
	{
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{ 
	          int x = tar - a[i]; 

			int idx=Binary(a, n, x, i);
			if(idx!=-1)
			{
				return new int[]{i,idx};
			}
		}
		return new int[]{-1,-1};
	}
	public static int Binary(int a[],int n,int x,int p )
	{
		int l=0,r=n-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(x==a[m]&&m!=p)
			{
				return m;
			}
			else if(x<a[m])
			{
				r=m-1;
			}
			else{
				l=m+1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n= sc.nextInt();
		  System.out.println("enter the target number ");
		  int tar=sc.nextInt();
		 System.out.println("enter the Array elements");
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		  System.out.println(" the sum of  number equals or not  "+Arrays.toString(isSum(a,n,tar)));
		
	}
}