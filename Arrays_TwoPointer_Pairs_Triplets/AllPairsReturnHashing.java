import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class AllPairsReturnHashing
{
	public static List<List<Integer>>FindAll(int a[],int n,int  tar)
	{
		List<List<Integer>>res=new ArrayList<>();
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
	      int x1=tar-a[i];
		  if(hm.containsKey(x1))
		  {
				  List<Integer>al=new ArrayList<>();
				  al.add(a[i]);
				  al.add(x1);
				  res.add(al);
				

			}
			
		 hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	   }  
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int tar=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the pairs are"+FindAll(a,n,tar));
		
	}
}