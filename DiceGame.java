import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎲 Welcome to Dice Roll Game!");
        System.out.print("Roll the dice? (yes/no): ");
        String input = sc.nextLine();

        while (input.equalsIgnoreCase("yes")) {
            int dice = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + dice);
            System.out.print("Roll again? (yes/no): ");
            input = sc.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}
