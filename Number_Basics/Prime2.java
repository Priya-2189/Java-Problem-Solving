import java.util.*;
class Prime2
{
  public static boolean prime(int n)
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
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the number ");
     int n= sc.nextInt();
     boolean result=prime(n);
    	  System.out.println("whether the give number is prime or not "+result);
  }
}