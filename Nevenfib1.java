import java.util.Scanner;
class Nevenfib1
{
	 public static int evenfib(int n)
	 {
		  
		 
		 if(n==1)
		 {
              return 0;
		 }
		 else{
			   int a=0,b=1,c=0;
		   int  next=1,ans=0;
		 
			 for(int i=2;i<=n;i++)
			 {
			  while(next<n)
			  {
				c=a+b;
				 if(c%2==0)
					{
						next++;
					}
					ans=c;	
					a=b;
					b=c;	
			  }
			 }
			 return ans;
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