public class Divisiors
{
   public static void divisor(int n)
   {
     for (int i =1;i<=n;i++)
	 {
	    if(n%i==0)
		{
		   System.out.println("the divisors  of "+n+" "+i);
		}
     }
   }
   public static void main(String args[])
   {
     int n=10;
    
     divisor(n);
    }
}	