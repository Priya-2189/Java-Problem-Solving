import java.util.ArrayList;
import java.util.Scanner;
public class DivisiorsARR
{
   public static ArrayList<Integer>divisior(int n)
   {
      ArrayList<Integer>al=new ArrayList<>();
	  for(int i=1;i<n;i++)
	  {
	    if(n%i==0)
		  al.add(i);
	  }
	  return al;
	}  
   public static void main(String args[])
   {
     Scanner ab=new Scanner(System.in);
     System.out.println("enter the number");
     int n=ab.nextInt();
    
     System.out.println("the divisor os the given number is"+divisior(n));
    }
}	