import java.util.Scanner;
class ConBuild{

   public static int Con(int a[])
   {  int c=0;
	   int min= 0;
	   
	   for(int i=0;i<a.length-1;i++)
	   {
		   
		     if(a[i+1]>a[i])
			 { 
		        c++;
				if(c>min)
				{
				  min=c;
				}	 
			 }
			 else 
			 {
				 c=0;
			 }
	   }
	   return min;
   }  
   public static void main(String args[])
   {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter into arrayList");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("the count is"+Con(a));
    }   
	
	
}