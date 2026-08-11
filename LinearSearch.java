import java.util.Scanner;
class LinearSearch
{
	
	/** public static boolean linear(int a[],int n,int x)
	 {
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]==x)
				 return true;
			
		 }
		 return false;
	 }*/
	/**  public static int linear(int a[],int n,int x)
	 {
		 for(int i=0;i<n;i++)
		 {
			 if(a[i]==x)
				 return i;
			
		 }
		 return -1;
	 }*/
	/**   public static int linear(int a[],int i,int n,int x)
	 {
		 if(i==n)
			 return -1;
		 else
		 {
			 if(a[i]==x)
			  return i;
		     else 
				 return linear(a,i+1,n,x);
			 
				 
		 }
		 
	 }*/
	 	   public static boolean linear(int a[],int i,int n,int x)
	 {
		 if(i==n)
			 return false;
		 else
		 {
			 if(a[i]==x)
			  return true;
		     else 
				 return linear(a,i+1,n,x);
			 
				 
		 }
		 
	 }
	 
	 public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the target number");
		int x=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the number int to array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean p=linear(a,0,n,x);
		System.out.println("The position is"+p);
  }
 }
 
class ScoateEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int n = (int) Math.ceil(Math.sqrt(input.length()));
        char[][] matrix = new char[n][n];

       
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k < input.length()) {
                    matrix[i][j] = input.charAt(k++);
                } else {
                    matrix[i][j] = ' '; 
                }
            }
        }

        
        StringBuilder encr = new StringBuilder();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                encrypted.append(matrix[i][j]);
            }
        }

        System.out.println("Scoate Code: " + encr.toString());
    }
}