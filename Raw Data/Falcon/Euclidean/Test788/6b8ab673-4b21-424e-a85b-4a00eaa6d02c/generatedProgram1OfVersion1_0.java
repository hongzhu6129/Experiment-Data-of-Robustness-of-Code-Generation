public class LargestOfFirstAndLast {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 10}; // Example array

        if (numbers.length >= 3) {  // Check if the array has at least 3 elements.

            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            int largest = (first > last) ? first : last; // Use the ternary operator for conciseness.

            System.out.println("Largest of first and last element: " + largest);

        } else {
            System.out.println("Array must have at least 3 elements.");
        }
    }
}
