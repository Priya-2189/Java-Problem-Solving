import java.util.Scanner;
import java.util.Stack;



public class Stacklambda
{
	public static void main(String args[])
	{
		//QueueLinkedList<Integer> ql= new QueueLinkedList<>();
		Stack<Integer>st=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			st.push(num);
		}
		System.out.println("the number are");
		st.stream(). forEach(S ->System.out.println(S));
	}
}
		
		