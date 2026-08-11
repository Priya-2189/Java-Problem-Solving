import java.util.Scanner;
class CountOfOccuranceBinarySearch
{

   public static int Binary(int a[],int n,int x)
   {
	   int l=0,h=n-1;
	   int first=-1;
	   int last=-1;
	  
	   while(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   first=m;
		   h=m-1;
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
	   System.out.println(" first"+first);
	   l=0;
	   h=n-1;
	    while(l<=h)
	   {
		    int m=(l+h)/2;
	   if(a[m]==x)
	   {
		   last=m;
		   l=m+1;
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
	 System.out.println(" last"+last);
      if(first==-1&&last==-1)
		 return 0;
		   
	   return last-first+1;		   
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
		System.out.println("The position is"+Binary(a,n,x));
  }
}