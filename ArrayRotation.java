import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Number of rotations
        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        // Normalize k in case it is larger than n
        k = k % n;

        // Rotate array to the right
        for (int r = 0; r < k; r++) {
            int last = arr[n - 1]; // store last element
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        // Display rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
