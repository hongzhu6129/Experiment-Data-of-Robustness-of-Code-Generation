public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        findLargest(arr1); // Output: 60

        int[] arr2 = {5, 12, 8, 25, 1, 9};
        findLargest(arr2); // Output: 25

        int[] arr3 = {1,2}; // Handles small even length arrays
        findLargest(arr3); // Output: 2
        

         int[] arr4 = {}; // Handles empty arrays gracefully
         findLargest(arr4); // Output: Array is empty


        int[] arr5 = {1,2,3,4,5}; // Handles incorrect input (odd length)
        findLargest(arr5); // Output: Array must have an even length
    }

    public static void findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        if (arr.length % 2 != 0) {
            System.out.println("Array must have an even length");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2 -1];
        int last = arr[arr.length - 1];

        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }

        System.out.println(largest);


    }
}
