public class Prefectsqr
{
   public static String prefectsqr(int n)
   {
     double x=Math.sqrt(n);
	 if(Math.floor(x)==Math.ceil(x))
	  {
	     return"yes";   
      }
	  
      return "no";
   }
   public static void main(String args[])
   { int n=11;
   
       String psqr=prefectsqr(n);
        System.out.println("the prefect square of the give number is"+n+" "+ psqr);
   }
}   