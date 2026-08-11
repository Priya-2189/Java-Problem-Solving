import java.util.*;
class Prime4
{
  public static boolean prime(int n)
  {
      if(n<=1)
		  return false;
      for(int i=2;i*i<=n;i++)
	  {
		  if(n%i==0)
			  return false;
	  }
	  return true;
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