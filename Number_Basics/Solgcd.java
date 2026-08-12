
import java.util.*;
class Solgcd
{
   public static int gcdp(int a[])
   {
       for(int i=0;i<a.length-1;i++)
	   {
	    
			while(a[i] != 0)
		 {
			 
		   int r= a[i+1]%a[i];
		   a[i+1]=a[i];
		   a[i]=r;
		  }
        }
	   
		return a[a.length-1];
   }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the elements");
	 int n=sc.nextInt();
     int a[]=new int[n];
	 System.out.println("elements into array");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 
      
      }
	  System.out.println(gcdp(a));
  
   }
}  



import java.util.*;
class Solution
{
    public static String isprime(int n)
    {
        String prime="prime";
        String composite="composite";
        
        if(n<=1)
        return composite;
        for( int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return composite;
        }
        
        return prime;
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        int [] num=new int[t];
        for(int i=0;i<t;i++){
         num[i]= sc.nextInt();
       }
        for(int i=0;i<t;i++){
        String result= isprime(num[i]);
        System.out.println(result);
        }
        
    }
}
