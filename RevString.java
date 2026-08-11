import java.io.InputStreamReader;
import java.io.BufferedReader;//i.like.the.color.of.my.friend
class RevString
{ 
    public static String res(String s)
	{
	   String s1[]=s.split("\\.");
	   String s2="";
	   for(int i=s1.length-1;i>=0;i--)
	   {
	       if(i!=0)
		   {
		     s2=s2+s1[i]+".";
		   }
		   else
		   {
		      s2=s2+s1[i];
		   }
	   }
	  return s2;
	
	}
	public static void main(String args[]) throws Exception
	{
	   BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("enter the string");
	    String s=b.readLine();
		System.out.println("the reversed string is "+res(s));
		
	}
}