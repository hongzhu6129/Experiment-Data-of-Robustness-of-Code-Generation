import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(7);

        // Method 1: Using toArray() with a provided array
        Integer[] array1 = new Integer[priorityQueue.size()];
        priorityQueue.toArray(array1);
        System.out.println("Array 1 (using toArray() with provided array): " + Arrays.toString(array1));


        // Method 2: Using toArray() without a provided array
        Object[] array2 = priorityQueue.toArray(); // Returns an Object[]
        Integer[] array2Int = new Integer[array2.length]; 
        for(int i = 0; i < array2.length; i++) {
            array2Int[i] = (Integer) array2[i]; // Explicit cast is required
        }
        System.out.println("Array 2 (using toArray() without provided array): " + Arrays.toString(array2Int));



        // Method 3: Manual conversion using a loop and poll() (destructive) - ORDER IS NOT GUARANTEED
        Integer[] array3 = new Integer[priorityQueue.size()];
        for (int i = 0; i < array3.length; i++) {
             array3[i] = priorityQueue.poll(); // poll() removes the head
        }        
        System.out.println("Array 3 (using manual conversion with poll()): " + Arrays.toString(array3)); // Note: priorityQueue is now empty

        // Recreate the PriorityQueue after Method 3 since it was emptied
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(7);



         //Method 4: Stream API toArray() (Java 8 and above). Preserves insertion order
         Integer[] array4 = priorityQueue.stream().toArray(Integer[]::new);
         System.out.println("Array 4 (using Stream API toArray()): " + Arrays.toString(array4));




    }
}
