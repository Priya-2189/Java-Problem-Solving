import java.util.Scanner;
class NoOfRotationsBinarySearch
{
	/**public static int NoofRotation(int a[],int n)
	{
		int l=0,h=n-1;
		while(l<=h)
		{
		
			if(a[l]<=a[h])
			{
				return l;
			}
			  int m=(l+h)/2;
			  if(a[m]<=a[h])
			  {
				  h=m;
			  }
			  else
				  l=m+1;
			
		}
		return l;
	}*/
	public static int NoofRotation(int a[],int n)
	{
		int l=0,h=n-1;
		while(l<=h)
		{
		
			if(a[l]<=a[h])
			{
				return a[l];
			}
			  int m=(l+h)/2;
			  if(a[m]<=a[h])
			  {
				  h=m;
			  }
			  else
				  l=m+1;
			
		}
		return a[l];
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
		System.out.println("The position is"+NoofRotation(a,n));
  }
}