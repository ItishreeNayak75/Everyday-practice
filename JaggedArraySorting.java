import java.util.*;

public class JaggedArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Step 2: Declare jagged array
        int[][] jaggedArray = new int[rows][];

        // Step 3: Input each row size and elements
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Step 4: Sort each row
        for (int i = 0; i < rows; i++) {
            Arrays.sort(jaggedArray[i]);
        }

        // Step 5: Display the sorted jagged array
        System.out.println("\nSorted Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
