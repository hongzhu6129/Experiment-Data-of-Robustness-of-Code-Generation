import java.util.Arrays;

public class FindSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5};
        findSmallestLargest(arr1); // Output: Smallest: 1, Largest: 5

        int[] arr2 = {5, 2, 8, 1, 9, 3};
        findSmallestLargest(arr2); // Output: Smallest: 1, Largest: 9

        int[] arr3 = {7, 7, 7, 7};
        findSmallestLargest(arr3); // Output: Smallest: 7, Largest: 7

        int[] arr4 = {}; // Empty array
        findSmallestLargest(arr4); // Output: Array is empty


        int[] arr5 = {3,2,1};
        findSmallestLargest(arr5);  //Output Smallest: 1, Largest 3.
        

    }

    public static void findSmallestLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Method 1: Sort the array (modifies the original array). More efficient for larger arrays or if you need the i-th element easily

        int[] sortedArr = Arrays.copyOf(arr, arr.length); // Create a copy to avoid modifying the original
        Arrays.sort(sortedArr);
        System.out.println("Smallest: " + sortedArr[0] + ", Largest: " + sortedArr[sortedArr.length - 1]);


        // Method 2: Iterate and keep track. (Doesn't modify the original array) Better for smaller arrays and if sorting is not absolutely needed.

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Uncomment the following line if you want output from both methods (for comparison)
        // System.out.println("Smallest (Iteration): " + smallest + ", Largest (Iteration): " + largest); 
    }
}
