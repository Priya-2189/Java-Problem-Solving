import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collection;
class MinSort
{
    public static void main(String args[])
	{
	
	 PriorityQueue<Integer>pq=new PriorityQueue<>();
	 
	 Scanner sc=new  Scanner(System.in);
	  System.out.println("Enter the number");
	 int n=sc.nextInt();
	 int min[]=new int[n];
	   System.out.println("The number are");
	   for(int i=0;i<n;i++)
	   {
	     int num=sc.nextInt();
		 pq.add(num);
	   }
	   for(int i=0;i<n;i++)
	   {
	      min[i]=pq.poll();
	   }
	   System.out.println("Sorted array using");
	   for(int num:min)
	   {
	    System.out.println(num+" ");
	   }
	}

   
}