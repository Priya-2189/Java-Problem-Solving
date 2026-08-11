import java.util.Scanner;
 class StringCompress
 {
	 public static String Compress(String s)
	 {
		 StringBuilder sb=new StringBuilder();
		 int c=1;
		 for(int i=0;i<s.length()-1;i++)
		 {
			 if(s.charAt(i)==s.charAt(i+1))
			 {
				 c++;
			 }
			 else
			 {
				 sb.append(s.charAt(i));
				 sb.append(Integer.toOctalString(c));
				 c=1;
			 }
		 }
		 sb.append(s.charAt(s.length()-1));
		 sb.append(Integer.toOctalString(c));
		 return sb.toString();
	 }
	 public static void main(String args[])
     {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=sc.next();
		System.out.println("the pairs are"+" "+Compress(s));
    }
 }