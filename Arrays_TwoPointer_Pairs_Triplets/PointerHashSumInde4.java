import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
class PointerHashSumInde4
{
	public static int [] isSum(int a[],int n,int tar)
	{
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<n-1;i++)
		{
			int com=tar-a[i];
			if(!hs.contains(com))
			{
				hs.add(a[i]);
				return new int[]{i,com};
			
			}
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