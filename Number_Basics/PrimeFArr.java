import java.util.*;
class PrimeFArr

{
    public static ArrayList<Integer> primefactor(int n)
	{
		ArrayList<Integer>al=new ArrayList<>();
		while(n%2==0)
		{
			al.add(2);
			n=n/2;
		}
		for(int i=3;i*i<=n;i=i+2)
		{
			while(n%i==0)
			{
				al.add(i);
				n=n/i;
			}
		}
		if(n>1)
		{
			al.add(n);
		}
		return al;
	}
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the numbers");
		int n=sc.nextInt();
      ArrayList<Integer>factors= primefactor( n);
	  System.out.println("Prime factors of " + n + ": " + factors);
		
	}
}
		