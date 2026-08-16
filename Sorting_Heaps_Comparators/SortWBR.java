import java.util.Scanner;
import java.util.Arrays;
class SortWBR
{
   public static String[] Count(String a[],int n)
   {
       String res[]=new String[n];
	   int count1=0;
	   int count2=0;
	   int count3=0;
	   int c=0;
	   for(int i=0;i<n;i++)
	   {
		   if(a[i].equals("W"))
		   {
			   count1++;
		   }
		   else if(a[i].equals("B"))
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
		  
			   res[c++]="W";
		   
	   }
	   for(int i=0;i<count2;i++)
	   {
		   
			   res[c++]="B";
		   
	   }
	   for(int i=0;i<count3;i++)
	   {
			   res[c++]="R";
		   
	   }
	   return res;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String a[]=new String [n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		String []ne= Count(a,n);
		System.out.println("the pairs are"+Arrays.toString(ne));
   }
}