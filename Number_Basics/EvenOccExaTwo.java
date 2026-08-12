import java.util.Scanner;

class EvenOccExaTwo {
    public static boolean findevenOcc2(int a[]) {
        int xor = 0;
        for (int num : a) {
            xor ^= num; 
        }
        return xor==0;  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array (2M):");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(findevenOcc2(a))
            System.out.println("The even occurring element is:");
	    else
			 System.out.println("The not even occurring element is:");
			
    }
}
