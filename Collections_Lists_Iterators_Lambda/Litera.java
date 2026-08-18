import java.util.*;
import java.util.Iterator;
class Litera
{
	public static void main(String args[])
	{
		LinkedList<Integer>al=new LinkedList<>();
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
		  
		  System.out.println( it.next());
	  }
	}
}