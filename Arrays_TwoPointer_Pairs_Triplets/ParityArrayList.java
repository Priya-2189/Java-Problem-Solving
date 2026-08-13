import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class ParityArrayList
{
	public static int[] parity(int a[],int n)
	{
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		int res[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even.add(a[i]);
			}
			else
			{
				odd.add(a[i]);
			}
		}
		int i=0;
		for(int x:even)
		{
			res[i]=x;
			i++;
		}
		for(int x1:odd)
		{
			res[i]=x1;
			i++;
		}
		return res;
	}
      public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int []re=parity(a,n);
		System.out.println("the pairs are"+Arrays.toString(re));
   }
	
	
}