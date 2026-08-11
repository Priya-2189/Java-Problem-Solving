import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Anagram3
{
   public static boolean Ana(String s1,String s2)
   {
      if(s1.length()!=s2.length())
	   return false;
     HashMap<Character,Integer>hm=new HashMap<>();
	// HashMap<Character,Integer>hm2=new HashMap<>();
	 
	 for(int i=0;i<s1.length();i++)
	 {
	     hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
		 hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)-1);
	 }

	 for(Map.Entry<Character,Integer>en:hm.entrySet())
	 {
	    char ch1=en.getKey();
		if(!hm.containsKey(ch1))
		   return false;
		 if(en.getValue()!=hm.get(en.getKey()))
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