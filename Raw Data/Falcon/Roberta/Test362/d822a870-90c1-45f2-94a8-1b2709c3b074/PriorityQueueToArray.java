import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {

        // 1. Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // 2. Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(2);


        // 3. Method 1: Using toArray() with a pre-allocated array

        Integer[] array1 = new Integer[priorityQueue.size()]; // Important: pre-allocate the array
        priorityQueue.toArray(array1); 

        System.out.println("Method 1: Array from PriorityQueue: " + Arrays.toString(array1));


        //  Method 2: Using toArray() with no argument (less efficient)
        // This creates a generic Object[] array which needs casting.

        Object[] array2 = priorityQueue.toArray();
        Integer[] array3 = new Integer[array2.length];
        for (int i = 0; i < array2.length; i++) {
            array3[i] = (Integer) array2[i]; // Cast each element
        }

        System.out.println("Method 2: Array from PriorityQueue (after casting): " + Arrays.toString(array3));




        // 4.  Illustrating that removal order from PriorityQueue is priority-based
        System.out.print("Removing elements from PriorityQueue (in order): ");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println(); // Newline



        // 5. Creating a PriorityQueue with a custom Comparator (e.g., reverse order)
        PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>((a, b) -> b - a); // Reverse order
        reversePriorityQueue.add(5);
        reversePriorityQueue.add(1);
        reversePriorityQueue.add(8);
        reversePriorityQueue.add(3);
        reversePriorityQueue.add(2);

        Integer[] reverseArray = new Integer[reversePriorityQueue.size()];
        reversePriorityQueue.toArray(reverseArray);

        System.out.println("Reverse order PriorityQueue to Array: " + Arrays.toString(reverseArray));



    }
}
