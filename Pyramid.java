import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (e.g., 5): ");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
