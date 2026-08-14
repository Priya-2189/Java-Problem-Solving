import java.util.Scanner;
import java.util.LinkedHashMap;
class LinkedHashMapPf
{
	public static  LinkedHashMap<Integer,Integer> PrimeF(int n)
	{
		LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
		while(n%2==0)
		{ 
	      hm.put(2,hm.getOrDefault(2,0)+1);
          n=n/2;		  
		}
        for(int i=3;i*i<=n;i=i+2)	
        { 
	     while(n%i==0)
		 {
	      hm.put(i,hm.getOrDefault(i,0)+1);
		  n=n/i;
		 }
		}
		if(n>1)
         hm.put(n,hm.getOrDefault(n,0)+1);			
	 return hm;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		LinkedHashMap<Integer,Integer> res=PrimeF(n);
		System.out.println(res);
		
	}	
}
	