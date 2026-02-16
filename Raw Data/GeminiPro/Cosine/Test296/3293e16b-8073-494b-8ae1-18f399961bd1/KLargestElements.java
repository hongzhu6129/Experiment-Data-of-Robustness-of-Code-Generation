import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 12, 9, 2, 50, 30};
        k = 4;
        findKLargest(arr, k);


        arr = new int[]{7, 10, 4, 3, 20, 15};
        k = 3;
        findKLargest(arr, k);

        // Test with k larger than array size
        arr = new int[]{7, 10, 4, 3, 20, 15};
        k = 7;
        findKLargest(arr, k);


        //Test with empty array
        arr = new int[]{};
        k = 3;
        findKLargest(arr, k);


         //Test with null array
        arr = null;
        k = 3;
        findKLargest(arr, k);

    }


    public static void findKLargest(int[] arr, int k) {
        if(arr == null || arr.length ==0){
            System.out.println("Invalid input array");
            return;
        }

        if(k <= 0){
             System.out.println("Invalid input k");
            return;
        }

        if (k > arr.length) {
            k = arr.length; // Adjust k if it's larger than the array size
        }


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        // Reverse sort to display in descending order (largest to smallest)
        Arrays.sort(result);
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");

        }
        System.out.println(); // Newline for the next output
    }
}
