public class LargestFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {20, 30, 10};
        int largest1 = findLargestFirstLast(array1);
        System.out.println("Largest between first and last element: " + largest1);  // Output: 20

        int[] array2 = {10, 5, 25};
        int largest2 = findLargestFirstLast(array2);
        System.out.println("Largest between first and last element: " + largest2); // Output: 25

        int[] array3 = {5, 5, 5};
        int largest3 = findLargestFirstLast(array3);
        System.out.println("Largest between first and last element: " + largest3); // Output: 5

         int[] array4 = {5}; // Handling array with less than 3 elements
        int largest4 = findLargestFirstLast(array4);
        System.out.println("Largest between first and last element: " + largest4); // Output: 5


          int[] array5 = {5, 10}; // Handling array with less than 3 elements
        int largest5 = findLargestFirstLast(array5);
        System.out.println("Largest between first and last element: " + largest5); // Output: 10


    }

    public static int findLargestFirstLast(int[] arr) {
        if (arr == null || arr.length == 0) {  // Handle null or empty arrays
            return Integer.MIN_VALUE; // Or throw an exception if appropriate
        }

        if (arr.length == 1) { // Handles arrays with a single element
          return arr[0];
        }
        
        if(arr.length == 2) { // Handles arrays with two elements
          return Math.max(arr[0], arr[1]);
        }

        // Compare first and last elements of a 3+ element array
        return Math.max(arr[0], arr[arr.length - 1]);

    }
}
