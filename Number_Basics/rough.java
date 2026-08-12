import java.util.*;
class Rough
{
    public static String isPerfectNumber(int n)
    {
        int sum = 0,i;
       
        for ( i = 1; i <= n / 2; i++)
        {
            if (n % i == 0)
                sum += i;
        }
        
        return (sum == n) ? "Yes" : "No";
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int t= sc.nextInt();
		int [] num=new int[t];
		for(int i=0;i<t;i++)
		{
         num[i] = sc.nextInt();
		}
       // String res = isPerfectNumber(t);
       for(int i=0;i<t;i++)
		{
        System.out.println(isPerfectNumber(num[i]));
        }
    }
}
