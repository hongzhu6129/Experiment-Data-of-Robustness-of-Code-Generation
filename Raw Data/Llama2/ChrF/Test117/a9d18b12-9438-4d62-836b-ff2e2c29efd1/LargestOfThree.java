public class LargestOfThree {

    public static void main(String[] args) {
        // Example array (even length)
        int[] numbers = {10, 5, 25, 15, 8, 20}; 

        if (numbers.length == 0 || numbers.length % 2 != 0) {
            System.out.println("Array must be non-empty and have an even length.");
            return;
        }

        int first = numbers[0];
        int middle = numbers[numbers.length / 2 -1]; // Calculate middle index for even length
        int last = numbers[numbers.length - 1];



        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }



        System.out.println("Largest of first, middle, and last elements: " + largest);



         // Testing with various even-length arrays
        testLargestOfThree(new int[]{2, 8, 4, 6});    // Output: 8
        testLargestOfThree(new int[]{10, 5, 25, 15}); // Output: 25
        testLargestOfThree(new int[]{1, 2, 3, 4, 5, 6}); // Output: 6
        testLargestOfThree(new int[]{20, 15, 30, 5}); // Output: 30
        
    }



    // Helper function for testing (not part of the original problem requirement)
    public static void testLargestOfThree(int[] arr) {
        if (arr.length == 0 || arr.length % 2 != 0) {
            System.out.println("Array must be non-empty and have an even length.");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2 - 1]; // Middle for even length
        int last = arr[arr.length - 1];

        int largest = Math.max(first, Math.max(middle, last));  // Using Math.max for conciseness in the test function
        System.out.println("Largest (test): " + largest);
    }


}
