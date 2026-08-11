import java.util.Scanner;
import java.util.Arrays;
class TenarySearch
{
   /** public static int tenary(int a[],int n,int x)
	{
		Arrays.sort(a);
		int l=0,h=n-1;
		int m1=l+(h-l)/3;
		int m2=h-(h-l)/3;
		while(l<=h)
		{
			if(a[m1]==x)
		    	return m1;
			else if(a[m2]==x)
				return m2;
			else if(x<a[m1])
				h=m1-1;
			else if(x>a[m2])
			     l=m2+1;
			else
				h=m1-1;
				l=m2+1;
		}
		return -1;
	}*/
	/** public static boolean tenary(int a[],int n,int x)
	{
		Arrays.sort(a);
		int l=0,h=n-1;
		int m1=l+(h-l)/3;
		int m2=h-(h-l)/3;
		while(l<=h)
		{
			if(a[m1]==x)
		    	return true;
			else if(a[m2]==x)
				return true;
			else if(x<a[m1])
				h=m1-1;
			else if(x>a[m2])
			     l=m2+1;
			else
				l=m2+1;
				h=m1-1;
				
		}
		return false;
	}*/
	public static boolean tenary(int a[],int l,int h,int x)
	{
		Arrays.sort(a);
		
		int m1=l+(h-l)/3;
		int m2=h-(h-l)/3;
		while(l<=h)
		{
			if(a[m1]==x||a[m2]==x)
		    	return true;
			
			else if(x<a[m1])
				return tenary(a,l,m1-1,x);
			else if(x>a[m2])
			     return tenary(a,m2+1,h,x);
			else
				return tenary(a,m1+1,m2-1,x);
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
		boolean p=tenary(a,0,n-1,x);
		System.out.println("The position is"+p);
  }
}
