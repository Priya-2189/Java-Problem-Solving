import java.util.*;
class Primeseive2
{
    public static void  primefactor(int n)
	{
		while(n%2==0)
		{
			System.out.println(2+" ");
			n=n/2;
		}
		for(int i=3;i*i<=n;i=i+2)
		{
			while(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
			}
		}
		if(n>1)
		{
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the numbers");
		int n=sc.nextInt();
		primefactor(n);
	}
}
		