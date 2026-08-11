import java.util.*;
import java.util.ArrayList;

class Iterators
{
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		System.out.println("enter the elemnets into arraylist");
		for (int i=0;i<n;i++)
		{
		  int element= sc.nextInt();
			al.add(element);
		}
      System.out.println("elements in array list");
      Iterator it=al.iterator();	  
	 while(it.hasNext())
	  {
		  
		  System.out.println(it.next());
	  }
	}
}