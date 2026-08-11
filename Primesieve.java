import java.util.*;
public class Primesieve
{
   public static void    findprime(int n)
   {
	   boolean p[] =new boolean[n+1];

	   for(int i=0;i<=n;i++)
	   {
     	p[i]=true;
      }
	   p[0]=false;
	   p[1]=false;   
	   for(int i=2;i*i<=n;i++)
	   {
		   if(p[i])
		   {
			   for(int j=i*i;j<=n;j+=i)
			   {
				   p[j]=false;
			   }
		   }
		   
	   }
	   for(int i=2;i<=n;i++)
	   {
		   if(p[i])
			   System.out.println(i);
	   }
	   int count=0;
	   for(int i=2;i<=n;i++)
	   {
		   if(p[i])
			   count++;
	   }
	   int [] res =new int[count];
	   int idx=0;
	   for(int i=2;i<=n;i++)
		   if(p[i])
		   {
			   res[idx++]=i;
		   }
     }
	 return res;
	  
   }
   public static void main(String args[])
   {  
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int  n =sc.nextInt();
	   Solution obj = new Solution();
        int[] primes = obj.sieve(n);
	   
        System.out.println(Arrays.toString(primes));
        sc.close();
   }
}

class Solution {
	public static boolean isprime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
	public static int findPrime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(isprime(i))
			{
				System.out.println(i+"");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	   Solution solutions =new Solution();
		for(int i=0;i<=n;i++)
		{
			List primes =solutions.primesUptoN(n);
			System.out.println(findPrime(n));		}
	}
		
	    
	
}