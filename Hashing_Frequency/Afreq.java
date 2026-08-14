import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
class Afreq
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		TreeMap<Integer,Integer> hm=new TreeMap<>();
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
         Set<Integer>s=hm.keySet();
		
		for(Integer x:s)
		{
			System.out.println(x+" : "+hm.get(x));
		}
	}
}
		