import java.util.Scanner;

public class MatrixMul {

    // Method to read a matrix
    static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements (" + rows + "x" + cols + ") :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    // Method to multiply two matrices
    static int[][] multiplyMatrices(int[][] a, int[][] b, int r1, int c1, int c2) {
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
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

        // First matrix
        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrix1 = readMatrix(sc, r1, c1);

        // Second matrix
        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix2 = readMatrix(sc, r2, c2);

        // Check for multiplication validity
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must equal rows of second.");
        } else {
            int[][] result = multiplyMatrices(matrix1, matrix2, r1, c1, c2);
            System.out.println("Resultant Matrix:");
            displayMatrix(result);
        }
        sc.close();
    }
}
