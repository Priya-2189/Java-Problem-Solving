import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
class Lremove
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

		Set<Integer> al=new LinkedHashSet<>();
		for(int i=0;i<n;i++)
		{
			al.add(a[i]);
		}
		System.out.println("After removing ");
		for(Integer x:al)
		{
			System.out.println(x);
		}
	}
}
		