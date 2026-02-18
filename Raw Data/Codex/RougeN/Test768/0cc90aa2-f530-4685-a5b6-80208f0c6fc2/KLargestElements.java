import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 23, 56, 1, 7, 34, 89, 2, 4, 10};
        k = 5;
        findKLargest(arr, k);

         arr = new int[]{5,10,15};
         k=3;
         findKLargest(arr,k);

        //Edge cases
        arr = new int[]{5,10,15};
        k=0;
        findKLargest(arr,k);

        arr = new int[]{5,10,15};
        k=4; //K larger than array size
        findKLargest(arr,k);

        arr = null; //Null array
        k=2;
        findKLargest(arr,k);

        arr = new int[]{}; //Empty array
        k=2;
        findKLargest(arr,k);



    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid input: Array is null or empty.");
            return;
        }

        if (k <= 0) {
            System.out.println("Invalid input: K must be greater than 0.");
            return;
        }
        
        if (k > arr.length) {
            System.out.println("Invalid input: K cannot be larger than the array size.");
            return;
        }


        // Using a min-heap (PriorityQueue) to efficiently store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);  // Add element to the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the minHeap)
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);  // Convert to array for easier printing
        System.out.println(Arrays.toString(kLargestArray));

    }
}
