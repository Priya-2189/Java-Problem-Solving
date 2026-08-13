import java.util.Scanner;
import java.util.Arrays;
class ParityEvenOdd
{
    public static int[] Parity(int a[],int n)
	{
		int i=0,j=n-1;
		while(i<j)
		{
			if(a[i]%2==0)
			{
				i++;
			}
			else if(a[j]%2!=0)
			{
				j--;
			}
			else 
			{
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
			int res[]=new int[n];
			for(int k=0;k<n;k++)
			{
				res[k]=a[k];
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
		int []re=Parity(a,n);
		System.out.println("the pairs are"+Arrays.toString(re));
   }
}