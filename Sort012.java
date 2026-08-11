import java.util.Scanner;
import java.util.Arrays;
class Sort012
{
   public static int[] Count(int a[] ,int n)
   {
       int res[]=new int[n];
	   int count1=0;
	   int count2=0;
	   int count3=0;
	   int c=0;
	   for(int i=0;i<n;i++)
	   {
		   if(a[i]==0)
		   {
			   count1++;
		   }
		   else if(a[i]==1)
		   {
			   count2++;
		   }
		   else
		   {
			   count3++;
		   }
	   }
	   for(int i=0;i<count1;i++)
	   {
		  
			   res[c++]=0;
		   
	   }
	   for(int i=0;i<count2;i++)
	   {
		   
			   res[c++]=1;
		   
	   }
	   for(int i=0;i<count3;i++)
	   {
			   res[c++]=2;
		   
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
		int []ne= Count(a,n);
		System.out.println("the pairs are"+Arrays.toString(ne));
   }
}