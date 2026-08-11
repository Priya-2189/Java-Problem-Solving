import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Pangram1
{
   public static boolean pan(String s1)
   { 
        int c=0;
          s1 = s1.toLowerCase(); 
	  HashMap<Character,Integer>hm=new HashMap<>();
	  for(int i=0;i<s1.length();i++)
	  {
	  char ch=s1.charAt(i);
	  if(ch>='a'&&'z'>=ch)
	  {
	     hm.put(ch,hm.getOrDefault(ch,0)+1);
	  }
	  }
	  for(Map.Entry<Character,Integer>en:hm.entrySet())
	  {
	     if(hm.size()==26)
			 return true;
	  }
	  return false;
   }
   public static void main(String args[]) throws Exception
   {
	     InputStreamReader i=new InputStreamReader(System.in);
		 BufferedReader b=new BufferedReader(i);
		 System.out.println("Enter the String");
		 String s1=b.readLine();
		 System.out.println(" these pangrams"+pan(s1));
   }
}