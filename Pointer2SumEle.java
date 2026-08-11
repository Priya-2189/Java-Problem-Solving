import java.util.Scanner;
import java.util.Arrays;
class Pointer2SumEle
{
	public static int [] isSum(int a[],int n,int tar)
	{
		
		int sum=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(sum==tar)
				{
					return new int[]{a[i],a[j]};
				}
			}
			//sum=0;
		}
		return new int[]{-1,-1};
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