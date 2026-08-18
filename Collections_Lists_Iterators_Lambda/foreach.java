import java.util.*;
class Forloop
{
	public static void main(String args[])
	{
		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		System.out.println("enter the elemnets into arraylist");
		for(int i=0;i<n;i++)
		{
			int element= sc.nextInt();
			al.add(element);
		}
      System.out.println("elements in array list");	 
	  for(int i=0;i<al.size();i++)
	  {
		  System.out.println(al.get(i));
	  }
	}
}