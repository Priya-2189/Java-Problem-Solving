import java.util.Scanner;
class Nevenfib2
{
	 public static int evenfib(int n)
	 {
		  
		 
		 if(n==1)
		 {
              return 0;
		 }
		 else if(n==2)
			 return 2;
		 else{
			   int a=0,b=2,c=0;
		  
		 
			 for(int i=3;i<=n;i++)
			 {
			 
				   c=4*b+a;
					a=b;
					b=c;	
			  
			 }
			 return c;
		 }
			  	  
 	 }
	 public static void main(String k[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n= sc.nextInt();
		 System.out.println("the number is"+evenfib(n));
		  
	 }
}