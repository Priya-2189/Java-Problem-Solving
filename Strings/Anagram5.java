import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Anagram5
{
   public static boolean Ana(String s1,String s2)
   {
	   s1=s1.toLowerCase();
	   s2=s2.toLowerCase();
      if(s1.length()!=s2.length())
	   return false;
      
	   int a[]=new int[26];
	  for(int i=0;i<s1.length();i++)
	  {
		  char  ch1=s1.charAt(i);
		  char  ch2=s2.charAt(i);
		  a[ch1 - 'a']++;
		  a[ch2 - 'a']--;
	  }
	  for(int i=0;i<26;i++)
	  {
		  if(a[i]!=a[i])
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