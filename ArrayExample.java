import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

       
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

       
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
        System.out.println("\nSum of array elements = " + sum);

        sc.close();
    }
}
