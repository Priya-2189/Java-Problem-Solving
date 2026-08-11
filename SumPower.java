import java.util.*;
class SumPower
{
  public static int power(int n)
  {
	  int s=0,c=0;
	  while(n%2==0)
	  {
		  c++;
		  n=n/2;
	  }
	  s=s+c;
	  for(int i=3;i*i<=n;i++)
	  {
		  c=0;
		  while(n%i==0)
		  {
			  c++;
			  n=n/i;
		  }
		   s=s+c;
	  }
	 
	  if(n>1)
	  {
		  s=s+1;
		
	  }
	  return s;
  }
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int result =power( n);
	  System.out.println(result);
  }
}
	  