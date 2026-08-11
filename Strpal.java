import java.util.Scanner;
class Strpal
{
   public static String pal(String s)
   {
       s=s.toLowerCase();
	   String s2="";
	  for(int i=0;i<s.length();i++)
	  { 
	     char ch= s.charAt(i);
		 if(ch>= 'a'&& 'z'>=ch)
		 {
              s2+=ch ;
		 }
	  }
	   String rev = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            rev += s2.charAt(i);
        }
	  if(s2.equals(rev))
	  {
	   return "YES";
	  }
	  else
	  {
	    return "No";
	  }
   }
   public static void main(String args[])
   {
   
       Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   System.out.println(pal(s));
   }
}

	 