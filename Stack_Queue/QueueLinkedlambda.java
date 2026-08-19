import java.util.Scanner;

import java.util.ListIterator;
import java.util.Queue;
import java.util.LinkedList;


public class QueueLinkedlambda
{
	public static void main(String args[])
	{
		Queue<Integer> ql= new LinkedList<>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			ql.add(num);
		}
		System.out.println("the number are");
	    ql.stream().forEach(S ->System.out.println(S));
	}
}
		
