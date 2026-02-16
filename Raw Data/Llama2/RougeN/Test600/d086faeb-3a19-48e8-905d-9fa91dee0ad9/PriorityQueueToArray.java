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
        priorityQueue.toArray(array1);
        System.out.println("Method 1: " + Arrays.toString(array1));

        // Restore the priority queue (as toArray() doesn't remove elements)
        priorityQueue.clear();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);


        // Method 2: Using toArray() with no arguments (less efficient)
        Object[] array2 = priorityQueue.toArray();
        Integer[] array2Int = new Integer[array2.length];  //Need to create an Integer array and cast each element.
        for(int i=0; i< array2.length; i++){
            array2Int[i] = (Integer) array2[i];
        }
        System.out.println("Method 2: " + Arrays.toString(array2Int));



        //Restore priority queue again.  This is necessary to demonstrate the iterative approach since we consume the queue during the iterative process
        priorityQueue.clear();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Method 3: Iterative approach (destructive, consumes the queue) 
        Integer[] array3 = new Integer[priorityQueue.size()];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = priorityQueue.poll(); // Note: poll() removes the head
        }
        System.out.println("Method 3: " + Arrays.toString(array3)); //priorityQueue is now empty!



    }
}
