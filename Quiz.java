import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println("🧮 Welcome to Math Quiz!");

        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(10);
            int b = rand.nextInt(10);
            System.out.print("What is " + a + " + " + b + "? ");
            int ans = sc.nextInt();

            if (ans == a + b) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! The answer is " + (a + b));
            }
        }

        System.out.println("🎉 Quiz Over! Your score: " + score + "/5");
    }
}
