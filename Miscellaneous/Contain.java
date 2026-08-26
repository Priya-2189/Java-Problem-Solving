import java.util.*;
class Contain
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
	  System.out.println("entre the ele to count");
	  int tar=sc.nextInt();
	 
	
		int c=0;
		for(int num:al)
		{
			if(num==tar)
				c++;
		
		}  
	   System.out.println( "the count  "+c);
	   
	}
}