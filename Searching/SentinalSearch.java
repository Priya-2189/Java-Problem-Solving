import java.util.Scanner;
class SentinalSearch
{
     public static int Sentinal(int a[],int n,int x)
	 {
		 int last=a[n-1];
		 a[n-1]=x;
		 int i=0;
		 while(a[i]!=x)
		 {
			 i++;
		 }
		 a[n-1]=last;
		 if(i<n-1||a[n-1]==x)
		 {
			 return i;
		 }
		 else
		 {
			 return -1;
		 }
	 }
	  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target element:");
        int x = sc.nextInt();
        System.out.println("the element is"+ Sentinal(a, n, x));
    }
}
