public class LargestOfFirstAndLast {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {10, 5, 20};
        int largest1 = findLargestOfFirstAndLast(array1);
        System.out.println("Largest of first and last elements in array1: " + largest1); // Output: 20


        int[] array2 = {50, 15, 5};
        int largest2 = findLargestOfFirstAndLast(array2);
        System.out.println("Largest of first and last elements in array2: " + largest2); // Output: 50


        int[] array3 = {1, 2, 3};
        int largest3 = findLargestOfFirstAndLast(array3);
        System.out.println("Largest of first and last elements in array3: " + largest3); // Output: 3
    }

    public static int findLargestOfFirstAndLast(int[] arr) {
        if (arr == null || arr.length != 3) {
            throw new IllegalArgumentException("Array must have a length of 3.");
        }

        // Check for non-zero elements
        if (arr[0] == 0 || arr[1] == 0 || arr[2] == 0) {
            throw new IllegalArgumentException("Array elements must be non-zero.");
        }


        return Math.max(arr[0], arr[2]);
    }
}
