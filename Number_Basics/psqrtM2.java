public class Prefectsqr
{
   public static String prefectsqr(int n)
   {
     int x=(int)Math.sqrt(n);
	 if(x*x==n)
	  {
	     return"yes";   
      }
	  
      return "no";
   }
   public static void main(String args[])
   { int n=25;
   
       String psqr=prefectsqr(n);
        System.out.println("the prefect square of the give number is"+n+" "+ psqr);
   }
}   