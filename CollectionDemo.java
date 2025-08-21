import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. ArrayList Example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");  // duplicate
        names.add("Charlie");

        System.out.println("ArrayList (with duplicates): " + names);

        // 2. HashSet Example - removes duplicates
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("HashSet (unique values): " + uniqueNames);

        // 3. HashMap Example - word count
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency (HashMap): " + wordCount);
    }
}
