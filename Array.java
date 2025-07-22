public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array of 10 integers
        int[] numbers = new int[10];

        // Populate the array with values using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // store even numbers: 0, 2, 4, ...
        }

        // Print the contents of the array using another loop
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
