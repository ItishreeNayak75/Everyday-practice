import java.util.Scanner;

public class Array2Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[n];

        // Step 3: Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Find and print 2-digit numbers
        System.out.println("Two-digit numbers in the array:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 10 && arr[i] <= 99 || arr[i] <= -10 && arr[i] >= -99) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No two-digit numbers found.");
        }

        sc.close();
    }
}
