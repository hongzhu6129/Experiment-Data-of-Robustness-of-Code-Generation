import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        // Example 2
        int[] arr2 = {11, 5, 2, 7, 1, 15, 8, 3};
        int k2 = 4;
        findKLargest(arr2, k2);


        // Example 3 - Edge case: k larger than array size
        int[] arr3 = {1, 2, 3};
        int k3 = 5;
        findKLargest(arr3, k3);

        // Example 4 - Edge case: empty array
        int[] arr4 = {};
        int k4 = 2;
        findKLargest(arr4, k4);



    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. No largest elements.");
            return;
        }

        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }


        if (k > arr.length) {
            System.out.println("k is larger than the array size. Returning all elements:");
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;

        }


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element if heap size exceeds k
            }
        }

        // Print the k largest elements
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);  // Convert to array for sorting (optional)
        Arrays.sort(kLargestArray); // Sort for consistent output (optional)


        System.out.print("The " + k + " largest elements are: ");
        for (int num : kLargestArray) { //Or just iterate though the PriorityQueue without converting
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
