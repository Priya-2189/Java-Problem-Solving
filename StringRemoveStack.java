import java.util.Scanner;
import java.util.Stack;
class StringRemoveStack
{
	public static String remove(String s)
	{
		Stack<Character> st=new Stack<>();
		StringBuilder sb=new StringBuilder();
		int n=s.length();
		if(n==0)
			return "";
		
		st.push(s.charAt(0));
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(i-1))
			{
				st.push(s.charAt(i));
			}
		}
		for(char ch:st)
		{
			sb.append(ch);
		}
		return sb.toString();
	}
	 public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number int to array");
		String s=sc.next();
		System.out.println("the pairs are"+remove(s));
   }
}