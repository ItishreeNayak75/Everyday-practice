import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Step 2: Declare jagged array
        int[][] jaggedArray = new int[rows][];

        // Step 3: Input each row size and elements
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols]; // allocate columns for current row

            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Step 4: Display the jagged array
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
