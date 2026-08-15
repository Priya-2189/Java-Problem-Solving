import java.util.Scanner;
class StringEncode
{
     public static String encode(String s)
	 {
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<s.length()-1;i++)
		 {
			 char ch=s.charAt(i);
			 if(i%2==0)
			 {
				 sb.append((char)(ch-1));
			 }
			 else
			 {
				 sb.append((char)(ch+1));
			 }
		 }
		 return sb.toString();
	 }
	 /**public static String encode(String s)
	{
		StringBuilder sb=new StringBuilder();
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 
                char ch1 = (char)('a' + (ch - 'a' + i) % 26);
                sb.append(ch1);
			  
		 }
		 return sb.toString();
	}*/

	/**public static String encode(String s)
	{
		StringBuilder sb=new StringBuilder();
		 for(int i=0;i<s.length();i++)
		 {
			 int r=2;
			 char ch=s.charAt(i);
			 
                char ch1 = (char)('a' + (ch - 'a' + r) % 26);
                sb.append(ch1);
			  
		 }
		 return sb.toString();
	}*/
	/**public static String EncodeCount(String[] s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++)
		{
			char ch[]=s[i].toCharArray();
			sb.append(ch.length);
			sb.append('#');
			sb.append(ch);
		}
		return sb.toString();
	}*/
	

	  public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");

		String s=sc.next();
	
		System.out.print("the pairs are"+" "+encode(s));
    }
}