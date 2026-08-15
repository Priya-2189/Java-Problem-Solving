import java.util.Scanner;
import java.util.HashMap;
class Isogram1
{

   public static boolean Iso(String s)
   {
	    HashMap<Character,Integer>hs=new HashMap<>();
		for(char ch:s.toCharArray())
		{
			hs.put(ch,hs.getOrDefault(ch,0)+1);
			
		}
		for(char ch:hs.KeySet())
		{
		  if(hs.get(ch)>1)
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