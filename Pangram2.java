import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Pangram2
{
   public static boolean pan(String s1)
   { 
        int c=0;
          s1 = s1.toLowerCase(); 
	  HashSet<Character>hm=new HashSet<>();
	  for(int i=0;i<s1.length();i++)
	  { char ch= s1.charAt(i);
         if (ch >= 'a' && ch <= 'z') {
	        hm.add(ch);
	   }
	  }
	  
	     if(hm.size()==26)
			 return true;
	  
	  return false;
   }
   public static void main(String args[]) throws Exception
   {
	     InputStreamReader i=new InputStreamReader(System.in);
		 BufferedReader b=new BufferedReader(i);
		 System.out.println("Enter the String");
		 String s1=b.readLine();
		 System.out.println(" these pangrams "+pan(s1));
   }
}