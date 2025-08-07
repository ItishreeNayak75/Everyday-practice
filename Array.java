import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Step 2: Declare array
        int[] arr = new int[n];

        // Step 3: Input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Step 5: Display array elements
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Step 6: Print sum
        System.out.println("\nSum of array elements = " + sum);

        sc.close();
    }
}
