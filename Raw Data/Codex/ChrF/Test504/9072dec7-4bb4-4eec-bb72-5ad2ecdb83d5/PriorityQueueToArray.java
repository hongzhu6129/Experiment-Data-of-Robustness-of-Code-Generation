import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] array1 = new Integer[priorityQueue.size()];
        array1 = priorityQueue.toArray(array1);

        System.out.println("Array 1 (using pre-allocated array): " + Arrays.toString(array1));

        // Method 2: Using toArray() without a pre-allocated array (less efficient)
        Object[] array2 = priorityQueue.toArray();
        Integer[] array3 = new Integer[array2.length];
        // Need to manually cast each element if we didn't pre-allocate
        for (int i = 0; i < array2.length; i++) {
           array3[i] = (Integer)array2[i]; // Safe to cast here as we know it's Integer
        }

        System.out.println("Array 2 (using toArray() without pre-allocation, then casting): " + Arrays.toString(array3));


        // Method 3: Iterating and adding to the array (less efficient)
        Integer[] array4 = new Integer[priorityQueue.size()];
        int i = 0;
        for (Integer element : priorityQueue) {
            array4[i++] = element;
        }

        System.out.println("Array 3 (using iteration): " + Arrays.toString(array4));

        //Note: the order of elements in the array won't necessarily be the priority order
        // as toArray() doesn't guarantee any specific order. If you need
        //the elements in priority order, you would need to poll() them one by one.


        //Demonstrating polling to maintain order (destructive to the PriorityQueue)
        System.out.print("Priority Order: ");
        PriorityQueue<Integer> pqCopy = new PriorityQueue<>(priorityQueue); //make a copy to not modify original

        while (!pqCopy.isEmpty()) {
            System.out.print(pqCopy.poll() + " "); 
        }
         System.out.println();


    }
}
