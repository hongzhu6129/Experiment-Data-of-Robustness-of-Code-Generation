public class LargestOfFirstAndLast {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 25}; // Example array

        int largest = findLargest(numbers);

        System.out.println("Largest of first and last element: " + largest);


        // More test cases:
        int[] numbers2 = {5, 10, 5};
        System.out.println("Largest of first and last element: " + findLargest(numbers2));

        int[] numbers3 = {25, 5, 10};
        System.out.println("Largest of first and last element: " + findLargest(numbers3));

        // Test case with negative numbers
        int[] numbers4 = {-10, 5, -25};
        System.out.println("Largest of first and last element: " + findLargest(numbers4));

        // Test case where first and last are equal
        int[] numbers5 = {10, 5, 10};
        System.out.println("Largest of first and last element: " + findLargest(numbers5));

        //Handling potential error: empty array
        int[] emptyArray = {};
        System.out.println("Largest of first and last element (empty array): " + findLargest(emptyArray));
        //Handling potential error: null array
        int[] nullArray = null;
        System.out.println("Largest of first and last element (null array): " + findLargest(nullArray));


    }


    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE; // Or throw an exception, depending on how you want to handle errors.
        }

        if (arr.length == 1) {
            return arr[0]; //If only 1 element, return it as largest.
        }


        int first = arr[0];
        int last = arr[arr.length - 1];

        return (first > last) ? first : last; // Using the ternary operator for conciseness
    }
}
