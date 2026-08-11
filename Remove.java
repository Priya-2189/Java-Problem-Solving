import java.util.*;
class Remove
{
 
  
    public static void main(String args[])
	{
	  ArrayList<Integer>al=new ArrayList<>();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the no.of ele");
	  int n=sc.nextInt();
	  int ele;
	   System.out.println("entered into array list");
	  for(int i=0;i<n;i++)
	  {
	    ele= sc.nextInt();
		al.add(ele);
	  }
	 
	
		al.removeIf(i ->i%2==0);
	  
	    System.out.println("after removing");
	   for(int val:al)
	   {
	   System.out.println(val);
	   }
	}
}