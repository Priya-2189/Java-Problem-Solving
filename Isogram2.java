import java.util.Scanner;
import java.util.HashMap;
class Isogram2
{

   public static boolean Iso(String s)
   {
	    int b[] =new int [26];
		for(char ch:s.toCharArray())
		{
			if(ch>='a'&&ch<='z')
			{
			 b[ch - 'a']++;
			}
			
		}
		for(int i=0;i<26;i++)
		{
         if(b[i]>1)
	     {
	       return false;
		 }
		}
		return true;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   System.out.println(Iso(s));
   }
}