import java.util.Scanner;
import java.util.Arrays;
class Pointer2Sum2
{
	public static boolean isSum(int a[],int n,int tar)
	{
		
		Arrays.sort(a);
		int i=0,j=n-1;
		while(i<j)
		{
			int sum=a[i]+a[j];
			if(sum==tar)
			{
				return true;
			}
			else if(sum<tar)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		return false;
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
		  System.out.println(" the sum of  number equals or not  "+isSum(a,n,tar));
		
	}
}ABBACA CA





for(int i=0;i<arr.length;i++)
{

   for(int j=arr.length;j>0;j++)
   {

         char ch1=arr.charAt(i);
         chat ch2= arr.charAt(j);
         if(ch1==ch2)
         {
           i++;
           j--;
         }
         else
         {
             sb.append(ch1)
          }
    }
}


























