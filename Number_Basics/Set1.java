import java.util.Scanner;
class Set1
{
   public static int setbit(int n)
   {
	   int c=0;
	   while(n>0)
	   {
		   if(n%2==0)
			   c++;
		      n=n/2;
	   }
	   return c;
   }
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number");
	   int n =sc.nextInt();
	   int res=setbit(n);
	   System.out.println("the set bits are "+res);
   }
}