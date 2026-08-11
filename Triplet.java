import java.util.Scanner;
import java.util.HashSet;
class TripletBoolean
{
	/**public static boolean triplet(int a[],int n,int tar)
  {
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[i]+a[j]+a[k]==tar)
				{
					return true;
				}
			}
		}
	}
	return false;
	}**/
	/*public static boolean triplet(int a[],int n,int tar)
	{
		for(int i=0;i<n-2;i++)
		{
			int l=i;
			int r=n-1;
			while(l<r)
			{
				int s=a[i]+a[l]+a[r];
				if(s==tar)
				{
					return true;
				}
				else if(s<tar)
				{
					l++;
				}
				else{
					r--;
				}
			}
		}
		return false;
	}**/
	public static boolean triplet(int a[],int n,int tar)
	{
		for(int i=0;i<n;i++)
		{
			HashSet<Integer>h=new HashSet<>();
			for(int j=i+1;j<n;j++)
			{
				int x=tar-(a[i]+a[j]);
				if(h.contains(x))
				{
					h.add(a[j]);
					return true;
					
				}
			}
		}
		return false;
	}
	public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the number");
		int tar =sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("the pairs are"+triplet(a,n,tar));
   }
}