import java.util.*;

class Permutation {
    
    // Method to check if a string can be rearranged into a palindrome
    static boolean canFormPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // remove spaces & make lowercase
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency of characters
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Count odd frequencies
        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Rule: A string can form a palindrome if at most one character has an odd frequency
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (canFormPalindrome(input)) {
            System.out.println("✅ The string CAN be rearranged into a Palindrome.");
        } else {
            System.out.println("❌ The string CANNOT be rearranged into a Palindrome.");
        }
    }
}
