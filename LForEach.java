import java.util.*;
class LForEach
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
	  for ( int num:al)
	  {
		  System.out.println(num);
	  }
	}
}