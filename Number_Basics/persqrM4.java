public class Prefectsqr
{
   public static String prefectsqr(int n)
   {
   int l=1,h=n;
       while(l<=h)
	   {
	      int m=(l+h)/2;
		  if(m*m==n)
		  
		     return "yes";
		     
		  else if(m*m<n)
		      l=m+1;
	      else  
		        h=m-1;
	   }
	   return "no";
   }
   public static void main(String args[])
   { int n=16;
   
       String psqr=prefectsqr(n);
        System.out.println("the prefect square of the give number is"+n+" "+ psqr);
   }
}   