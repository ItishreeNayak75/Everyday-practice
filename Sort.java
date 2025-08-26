import java.util.Scanner;

class Sort {
    public static void main(String args[]) {
        int x[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        // Bubble Sort (ascending order)
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
