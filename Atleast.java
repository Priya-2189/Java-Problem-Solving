import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
class Atleast
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers of K");
		int K=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm =new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		List<Integer> s= new ArrayList<>(hm.keySet());
		Collections.sort(s);
		System.out.println("the elemnts are");
		for(Integer x:s)
		{   if(hm.get(x)>=K)
			System.out.println(x);
		}
	}
}
		