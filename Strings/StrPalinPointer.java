import java.util.Scanner;
class StrPalinPointer
{
	public static boolean isPali(String s)
	{
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
				
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String s= sc.next();
		System.out.println("the string is "+isPali(s));
		
	}
}