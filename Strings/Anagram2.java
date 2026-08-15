import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Anagram2
{
   public static boolean Ana(String s1,String s2)
   {
	    s1=s1.toLowerCase();
	  s2=s2.toLowerCase();
      if(s1.length()!=s2.length())
	   return false;
     HashMap<Character,Integer>hm1=new HashMap<>();
	 HashMap<Character,Integer>hm2=new HashMap<>();
	 for(int i=0;i<s1.length();i++)
	 {
	    hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
	 }
	  for(int i=0;i<s2.length();i++)
	 {
	    hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
	 }
	 for(Map.Entry<Character,Integer>en:hm1.entrySet())
	 {
	    char ch1=en.getKey();
		if(!hm1.containsKey(ch1))
		   return false;
		 if(en.getValue()!=hm2.get(en.getKey()))
           return false;		 
	 }
	return true;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the first String");
	    String s1=sc.next();
	    System.out.println("Enter the second String");
		String s2=sc.next();
		System.out.println("The Strings are "+Ana(s1,s2));
	   
   }
}