import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        // Another example
        int[] arr2 = {11, 5, 27, 8, 1, 15, 4};
        int k2 = 4;
        findKLargest(arr2, k2);


        // Example with duplicates
        int[] arr3 = {11, 5, 27, 8, 1, 27, 4, 27};
        int k3 = 3;
        findKLargest(arr3, k3);
        
        // Example with k larger than array length
        int[] arr4 = {1, 2, 3};
        int k4 = 5;
        findKLargest(arr4, k4); // Will print all elements as k > array length
    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        

        // Use a min-heap (PriorityQueue in Java) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element from the heap
                minHeap.offer(num);
            }
        }
        

        // Convert the minHeap elements into an array and sort in descending order for output
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray, (a,b)-> b - a); // Reverse sort for descending order
        

        System.out.print("The " + k + " largest elements are: ");
        if (k > arr.length) { // Handle cases where k is larger than the array size
            System.out.println(Arrays.toString(kLargestArray));
        } else {
            for (int i = 0; i < kLargestArray.length; i++) {
                System.out.print(kLargestArray[i]);
                if (i < kLargestArray.length - 1) {
                    System.out.print(", ");
                }

            }
            System.out.println(); // Add a newline at the end
        }
    }
}
