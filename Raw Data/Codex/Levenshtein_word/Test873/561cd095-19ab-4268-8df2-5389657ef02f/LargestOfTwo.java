public class LargestOfTwo {

    public static void main(String[] args) {
        int[] array = {10, 5, 25}; // Example array (length 3)
        int largest;

        if (array.length != 3) {
            System.out.println("Array length must be 3.");
            return; // Exit if the array is not of length 3
        }

        if (array[0] > array[2]) {
            largest = array[0];
        } else {
            largest = array[2];
        }

        System.out.println("Largest of first and last elements: " + largest);


        // Example with different arrays
        testLargest(new int[]{50, 20, 10});
        testLargest(new int[]{1, 5, 2});
        testLargest(new int[]{7, 7, 7});
    }

    // Helper function to make testing easier within main()
    public static void testLargest(int[] array) {
        if (array.length != 3) {
            System.out.println("Array length must be 3.");
            return; // Exit if the array is not of length 3
        }

        int largest;

        if (array[0] > array[2]) {
            largest = array[0];
        } else {
            largest = array[2];
        }
        System.out.println("Largest of first and last elements in array " + java.util.Arrays.toString(array)+ ": " + largest);
    }
}
