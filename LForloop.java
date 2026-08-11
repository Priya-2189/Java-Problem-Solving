import java.util.*;
class LForloop
{
	public static void main(String args[])
	{
		LinkedList<Integer>li=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		System.out.println("enter the elemnets into arraylist");
		for(int i=0;i<n;i++)
		{
			int element= sc.nextInt();
			li.add(element);
		}
      System.out.println("elements in array list");	 
	  for(int i=0;i<li.size();i++)
	  {
		  System.out.println(l.get(i));
	  }
	}
}