import java.util.*;
import java.util.Iterator;
class Iteratorlist
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
      ListIterator<Integer>it=al.listIterator();	  
	 while(it.hasNext())
	  {
		  int num=it.next();
		  System.out.println(num);
	  }
	}
}