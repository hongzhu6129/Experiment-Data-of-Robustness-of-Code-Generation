public class LargestFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {1, 5, 3};
        int largest1 = getLargestFirstLast(array1);
        System.out.println("Largest of first and last in [1, 5, 3]: " + largest1); // Output: 5

        int[] array2 = {7, 2, 9};
        int largest2 = getLargestFirstLast(array2);
        System.out.println("Largest of first and last in [7, 2, 9]: " + largest2); // Output: 9


        int[] array3 = {4, 4, 4};
        int largest3 = getLargestFirstLast(array3);
        System.out.println("Largest of first and last in [4, 4, 4]: " + largest3); // Output: 4

        //Handle cases where the array might be null or have less than 3 elements gracefully:
        int[] array4 = null;
        int largest4 = getLargestFirstLast(array4);
        System.out.println("Largest of first and last in null: " + largest4); // Output: -1 (or whatever default you choose)

        int[] array5 = {1};
        int largest5 = getLargestFirstLast(array5);
         System.out.println("Largest of first and last in [1]: " + largest5); // Output: -1 (or whatever default you choose)

    }

    public static int getLargestFirstLast(int[] arr) {
        if (arr == null || arr.length < 1) {  // Handle null or empty arrays
            return -1; // Or throw an exception, return a special value, etc.
        }

        // For arrays of size 1, return the single element 
        if (arr.length == 1) {
            return arr[0];
        }


        int first = arr[0];
        int last = arr[arr.length - 1];
        return Math.max(first, last); // Use Math.max for conciseness

    }
}
