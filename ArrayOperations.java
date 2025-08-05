import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many elements to store
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Input elements into array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int sum = 0;
        int max = arr[0];

        // Calculate sum and max
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate average
        double average = (double) sum / n;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum value = " + max);
    }
}
