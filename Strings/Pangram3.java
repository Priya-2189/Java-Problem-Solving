import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Pangram3
{
   public static boolean pan(String s1)
   { 
        int c=0;
          s1 = s1.toLowerCase(); 
		  int b[]=new int[26];
	   
	  for(int i=0;i<s1.length();i++)
	  { 
	     char ch= s1.charAt(i);
		 if(ch>= 'a'&& 'z'>=ch)
		 {
          b[ch -'a']++;
		 }
	  }
	 
	     if(b.length==26)
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