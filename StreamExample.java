import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // A list of numbers
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // 1. Filter: keep only even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // 2. Map: square each number
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());

        // 3. Sort: ascending order
        List<Integer> sorted = numbers.stream()
                                      .sorted()
                                      .collect(Collectors.toList());

        // 4. Reduce: sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);

        // 5. ForEach: print all numbers
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Squares: " + squares);
        System.out.println("Sorted: " + sorted);
        System.out.println("Sum: " + sum);
    }
}
