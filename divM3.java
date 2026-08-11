import java.util.Scanner;
public class Divisiors
{
   public static void divisor(int n)
   {
     for (int i =1;i<=n/2;i++)
	 {
	    if(n%i==0)
		{
		   System.out.println("the divisors  of " +i);
		   if(n/i!=i)
		   System.out.println(n/i+" ");
		}
     }
   }
   public static void main(String args[])
   {
     Scanner ab=new Scanner(System.in);
	 int n=ab.nextInt();
    
     divisor(n);
	 	   System.out.println(n);
    }
}	