import java.util.Scanner;
class BinaryFirst
{

   public static int Binary(int a[],int n,int x)
   {
	   int l=0,h=n-1;
	   int f=-1;
	  
	   while(l<=h)
	   {
		    int m=(l+h)/2;
	   if(m==0||a[m]==x)
	   {
		   f=m;
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
	   return f;
		   
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