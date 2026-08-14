//hashmap sorting with priorityQueue using nested array
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Comparator;
import java.util.PriorityQueue;
class Sortby implements Comparator<int []>
{
	public int compare(int a[],int[] b)
	{
		if(a[0]==b[0])
		{
			return a[1]-b[1];
		}
	    else
		{
			return b[0]-a[0];
		}
	}
}
class Hashsort3
{
  public static ArrayList<Integer>sortByfreq(int a[],int n)
  {
	  HashMap<Integer,Integer> hm= new HashMap<>();
	  for(int i=0;i<n;i++)
	  {
		  hm.put(a[i],hm.getOrDefault(a[i],0)+1);
	  }
	 PriorityQueue<int []>pq=new PriorityQueue<>(new Sortby());
	  for(Map.Entry<Integer,Integer>en:hm.entrySet())
	  {
		int [] t=new int[2];
		t[0]=en.getValue();
		t[1]=en.getKey();
		pq.add(t);
		 
	  }
	  
	  ArrayList<Integer> ans=new ArrayList<>();
	  while(pq.size()>0)
	  {
		int []cur = pq.poll();
           int c = cur[0];
           int x = cur[1];

		   for(int j=0;j<c;j++)
		   {
			   ans.add(x);
		   }
		   
		   
	   }
	   return ans;
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	    System.out.println("enter the number into arraylist");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayList<Integer>res= sortByfreq(a,n);
		 System.out.println("The numbers are in sorted oreder");
		for(int x:res)
		{
			System.out.println(x+" ");
		}
	  
  }

}
