import java.util.Scanner;
import java.util.HashSet;
class Isogram
{

   public static boolean Iso(String s)
   {
	    HashSet<Character>hs=new HashSet<>();
		for(char ch:s.toCharArray())
		{
			if(!hs.contains(ch))
			{
				hs.add(ch);
			}
			
		}
		if(hs.size()==s.length())
		{
			return true;
		}
	   
	    return false;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   System.out.println(Iso(s));
   }
}