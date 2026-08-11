import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;


public class QueueLinked
{
	public static void main(String args[])
	{
		//QueueLinkedList<Integer> ql= new QueueLinkedList<>();
		Stack<Integer>st=new stack<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			st.push(i);
		}
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
		
		