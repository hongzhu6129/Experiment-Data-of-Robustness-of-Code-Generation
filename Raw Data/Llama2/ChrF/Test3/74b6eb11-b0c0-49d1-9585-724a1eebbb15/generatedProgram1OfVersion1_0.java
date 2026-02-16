import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.offer(5);
        pq.offer(1);
        pq.offer(8);
        pq.offer(3);
        pq.offer(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] arr1 = new Integer[pq.size()];
        pq.toArray(arr1);
        System.out.println("Array 1 (pre-allocated): " + Arrays.toString(arr1));


        // Method 2: Using toArray() without a pre-allocated array (less efficient)
        Object[] arr2 = pq.toArray();  // Returns an Object[]
        Integer[] arr2Int = new Integer[arr2.length]; 
        for(int i = 0; i < arr2.length; i++){
            arr2Int[i] = (Integer) arr2[i]; // Cast to Integer
        }

        System.out.println("Array 2 (no pre-allocation): " + Arrays.toString(arr2Int));



        // Method 3:  Iterating and adding to an array (least efficient, not recommended)
        Integer[] arr3 = new Integer[pq.size()];
        int i = 0;
        while (!pq.isEmpty()) {
            arr3[i++] = pq.poll(); //Note: This modifies the original PriorityQueue
        }
        System.out.println("Array 3 (iteration - modifies original queue): " + Arrays.toString(arr3));
        System.out.println("Original PriorityQueue (now empty after Method 3): " + pq);




        // Recreate the PriorityQueue since method 3 emptied it.
         pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(8);
        pq.offer(3);
        pq.offer(6);



         // Method 4: Stream toArray (Java 8 and later) - maintains order
        Integer[] arr4 = pq.stream().toArray(Integer[]::new);
        System.out.println("Array 4 (Stream toArray): " + Arrays.toString(arr4));


        System.out.println("Original PriorityQueue (after Method 4): " + pq);//Stream doesn't modify it


    }
}

