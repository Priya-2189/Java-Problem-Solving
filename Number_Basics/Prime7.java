import java.util.*;
class Prime7
{
   public  static boolean isPrime(int n)
   {
       int c=1;
	   for(int i=1;i<=n/2;i++)
	   {
		   if(n%i==0)
			   c++;
	   }
	   if(c==2)
		   return true;
	   else
		   return false;
   }
   
   public static int  findprime(int n)
   {
	   System.out.println("the prime numbers are  ");
	   for(int i=1;i<=n;i++)
	   {
		   if(isPrime(i))
			   System.out.println(i+" ");
       }
	   return 1;
   }
   public static void main(String args[])
   {
	   
	    
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int  n =sc.nextInt();
    	 int result=findprime(n);
   }
}