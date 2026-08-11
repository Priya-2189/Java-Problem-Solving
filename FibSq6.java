import java.util.Scanner;
class FibSq6
{
	public static boolean fib(double n)
	{
	  double  P=5*(Math.pow(n,2))+4;
	    double  R=5*(Math.pow(n,2))-4;
		if(isPre(P)||isPre(R))
		{
			return true;
		}
		return false;
	}
	public static boolean isPre(double n)
	{
		
	  double x=Math.sqrt(n);
      double i=Math.ceil(x);
      double j=Math.floor(x);
        if(i==j)
		{
			
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double n=sc.nextInt();
		//fib(n);
		System.out.println("the fibanocci number is"+fib(n));
		
		
	 }
}