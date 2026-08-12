public class Prefectsqr
{
   public static boolean prefectsqr(int n)
   {
     int x=(int)Math.sqrt(n);
	 if(x*x==n)
	  {
	     return true;   
      }
	  
      return false;
   }
   public static void main(String args[])
   { int n=25;
   
       boolean psqr=prefectsqr(n);
        System.out.println("the prefect square of the give number is"+" "+n+" "+ psqr);
   }
}   