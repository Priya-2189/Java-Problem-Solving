import java.util.Scanner;
class RotatedSortedBinarySearch
{
	
	public static int Rotated(int a[],int n,int x)
	{
		int l=0,h=n-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==x)
			{
				return m;
			}
		   if(a[l]<=a[m])
			{
			  if(x>=a[l]&&x<a[m])
			 {
			   h=m-1;
			 }
			 else{
				 l=m+1;
			 }
			 
			}
			else
			{
			   if(x>a[m]&&x<=a[h])
			  {
			    l=m+1;
			  }
			  else
			  {
				 h=m-1;
			  }
				
			}
		}
		return -1;
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
		System.out.println("The index"+Rotated(a,n,x));
  }
}