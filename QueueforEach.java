		import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;


public class QueueIterator
{
	public static void main(String args[])
	{
		Queue<String> ql= new LinkedList<>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			ql.add(str);
		}
		System.out.println("the number are");
	   for(String x:ql)
	   {
		   System.out.println(x);
	   }
	}
}
		
		