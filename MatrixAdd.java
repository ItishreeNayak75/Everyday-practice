import java.util.Scanner;

public class MatrixAdd {

    // Method to read a matrix from user
    static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    static int[][] addMatrices(int[][] a, int[][] b, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Read both matrices
        int[][] matrix1 = readMatrix(sc, rows, cols);
        int[][] matrix2 = readMatrix(sc, rows, cols);

        // Add matrices
        int[][] sum = addMatrices(matrix1, matrix2, rows, cols);

        // Display result
        System.out.println("Matrix Addition Result:");
        displayMatrix(sum);

        sc.close();
    }
}
