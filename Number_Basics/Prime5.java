import java.util.*;

class Prime5
{
  public static boolean prime(int n)
  {
      if(n<=1)
		  return false;
     if(n==2||n==3)
		 return true;
	 if(n%2==0||n%3==0)
		 return false;
	 for(int i=5;i*i<=Math.sqrt(n);i++)
	 {
		 if(n%i==0||(n%(i+2))==0)
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