import java.util.Scanner;

class Perfect {

 
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is NOT a Perfect number.");
        }
    }
}
