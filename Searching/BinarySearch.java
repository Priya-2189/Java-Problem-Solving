import java.util.Scanner;
import java.util.Arrays;

class BinarySearch
{
	 /**  public static boolean Binary(int a[],int n,int x)
   {
	   Arrays.sort(a);
	   int l=0,h=n-1;
	  
	   while(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   return true;
	   }
	   else if(x<a[m])
	   {
		   h=m-1;
	   }
	   else
	   {
		   l=m+1;
	   }
	   }
	   return false;
		   
   }*/

  /**public static int Binary(int a[],int n,int x)
   {
	   int l=0,h=n-1;
	  Arrays.sort(a);
	   while(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   return m;
	   }
	   else if(x<a[m])
	   {
		   h=m-1;
	   }
	   else
	   {
		   l=m+1;
	   }
	   }
	   return -1;
		   
   }*/
  /** public static int Binary(int a[],int l,int h,int x)
   {
	 
	  Arrays.sort(a);
	   if(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   return m;
	   }
	   else if(x<a[m])
	   {
		  return Binary(a,l,m-1,x);
	   }
	   else
	   {
		   return Binary(a,m+1,h,x);
		   
	   }
	   }
	   return -1;
		   
   }*/
    public static boolean Binary(int a[],int l,int h,int x)
   {
	 
	  Arrays.sort(a);
	   if(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   return true;
	   }
	   else if(x<a[m])
	   {
		  return Binary(a,l,m-1,x);
	   }
	   else
	   {
		   return Binary(a,m+1,h,x);
		   
	   }
	   }
	   return false;
		   
   }
   
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int x=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean p=Binary(a,0,n-1,x);
		System.out.println("The position is"+p);
  }
}