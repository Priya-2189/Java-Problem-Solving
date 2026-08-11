import java.util.Scanner;
class StrrevPointer
{
      public static String isRev(String s)
	  {
		  StringBuilder sb =new StringBuilder();
		  int n= s.length();
		  char ch1[]=new char[n];
	     char ch[] =s.toCharArray();
	    int i=0,j=ch.length-1;
		
		while(i<j)
		{ 
		   char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
			i++;
			j--;
		}
		for(char c: ch)
		{
			sb.append(c);
		}
		return sb.toString();
	  
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String s= sc.next();
		System.out.println("the string is "+isRev(s));
		
	}
}