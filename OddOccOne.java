import java.util.Scanner;

class OddOccOne {
    public static int findOddOccurrence(int a[]) {
        int xor = 0;
        for (int num : a) {
            xor ^= num; 
        }
        return xor;  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array (2n+1):");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("The odd occurring element is: " + findOddOccurrence(a));
    }
}
