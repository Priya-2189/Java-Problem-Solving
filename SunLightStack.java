import java.util.Scanner;
import java.util.Stack;
class SunLightStack
{
	public static int Sun(int a[])
	{  int c=0;
		Stack<Integer>s=new Stack<>();
		for(int i=0;i<a.length;i++)
		{
			if(s.isEmpty()||a[i]>s.peek())
			{
				s.push(a[i]);
				c++;
			}
			
		}
		return c;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter into arrayList");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("the count is"+Sun(a));
	}
}