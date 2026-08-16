import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
class Maxheap
{
    public static void main(String args[])
     {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int n=sc.nextInt();

		     PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
			 
	   for(int i=0;i<=n;i++)
	   {
		   int num=sc.nextInt();
		   pq.add(num);
		  
	   }
		  System.out.println("The numbers");
		  
	        Iterator<Integer> itr=pq.iterator();
		    while(itr.hasNext())
		    {
		     	System.out.println(itr.next());
		    }
	 }
}

	