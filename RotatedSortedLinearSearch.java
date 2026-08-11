import java.util.Scanner;
class RotatedSortedLinearSearch
{
	
/** public static int  linear(int a[],int n)
	 {
		int c=0;
		 for(int i=0;i<n-1;i++)
		 {
			 if(a[i]<a[c])
			 {
				 
				c=i; 
				
			 }
				 
			
		 }
		 return c;
	 }*/
	  public static int  linear(int a[],int n)
	 {
		int c=0;
		 for(int i=0;i<n-1;i++)
		 {
			 if(a[i]<a[c])
			 {
	 				c=i; 
			 } 
		 }
		 return a[c];
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
		System.out.println("The index"+linear(a,n));
  }
  
}