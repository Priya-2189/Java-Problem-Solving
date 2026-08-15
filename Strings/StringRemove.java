import java.util.Scanner;
class StringRemove
{
	public static String remove(String s)
	{
		StringBuilder s1 = new StringBuilder();
          
			
			int n=s.length();
			if(n==0)
				return "";
			s1.append(s.charAt(0));
			for(int i=1;i<n;i++)
			{
				if(s.charAt(i)!=s.charAt(i-1))
				{
					s1.append(s.charAt(i));
				}
			}
		
		return s1.toString();
	}
	 public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number int to array");
		String s=sc.next();
		System.out.println("the pairs are"+" "+remove(s));
   }
}