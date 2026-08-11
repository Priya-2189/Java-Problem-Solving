import java.util.Scanner;
class NeonNumber
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			sum+=sq%10;
			sq/=10;
		}
		if(sum==n)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("The number is not neon number");
			
		}
		
	}
}