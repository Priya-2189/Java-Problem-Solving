import java.util.Scanner;
class Last2fib
{
  public static int Lfib(int n)
  {
      int N=n%60;
	  int f[]=new int[N+1];
	   if (N == 0) return 0;
        if (N == 1) return 1;
	  f[0]=0;
	  f[1]=1;
	  for(int i=2;i<=N;i++)
	  {
	     f[i]=(f[i-1]+f[i-2])%100;
	  }
        return f[N];
  }
  	 public static void main(String k[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n= sc.nextInt();
		 System.out.println("the number is"+Lfib(n));
		  
	 }
}