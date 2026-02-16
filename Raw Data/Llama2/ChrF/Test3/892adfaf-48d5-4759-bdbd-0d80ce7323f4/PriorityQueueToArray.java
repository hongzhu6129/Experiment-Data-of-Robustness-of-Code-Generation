import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(7);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] arr1 = new Integer[pq.size()];
        pq.toArray(arr1);
        System.out.println("Array 1 (pre-allocated): " + Arrays.toString(arr1));


        // Method 2: Using toArray() without a pre-allocated array (less efficient)
        Object[] arr2 = pq.toArray();
        Integer[] arr3 = new Integer[arr2.length];

        //You need to manually cast from object to Integer for this method.
        for(int i = 0; i < arr2.length; i++){
            arr3[i] = (Integer)arr2[i];
        }

        System.out.println("Array 2 (not pre-allocated, then casted) : " + Arrays.toString(arr3));

        // Note: The order of elements in the array may not be the same as the order in which
        // they were added to the PriorityQueue, as PriorityQueue maintains elements based on priority.


        // Example using Strings
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        String[] stringArray = new String[stringPQ.size()];
        stringPQ.toArray(stringArray);
        System.out.println("String Array: " + Arrays.toString(stringArray));



    }
}
