import java.util.Scanner;
import java.util.Arrays;
class Anagram1
{
     public static boolean Ana( String s1,String s2)
	 {
	    s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s11=String.valueOf(ch1);
        String s22=String.valueOf(ch2);
		if(s11.equals(s22))
		{
			return true;
		}
		return false;
   }
   public static void main(String args[])
   {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.next();
		System.out.println("Enter the second String");
		String s2=sc.next();
		System.out.println(" the strings are "+Ana(s1,s2));
   }
  
}