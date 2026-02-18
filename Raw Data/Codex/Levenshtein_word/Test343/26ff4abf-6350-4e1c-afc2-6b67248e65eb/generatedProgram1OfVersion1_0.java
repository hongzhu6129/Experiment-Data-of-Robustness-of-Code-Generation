import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Example PriorityQueue (you can customize this)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] array1 = new Integer[priorityQueue.size()];
        priorityQueue.toArray(array1);
        System.out.print("Method 1: ");
        printArray(array1);

        // Method 2: Using toArray() without a pre-allocated array
        Object[] array2 = priorityQueue.toArray(); // Returns Object[] - needs casting
        Integer[] array3 = new Integer[array2.length];
        for (int i = 0; i < array2.length; i++) {
            array3[i] = (Integer) array2[i]; // Cast to Integer
        }
        System.out.print("Method 2: ");
        printArray(array3);

        // Method 3: Iterating and adding to an ArrayList, then converting to array.  More flexible
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            arrayList.add(priorityQueue.poll()); // poll() removes and retrieves head
        }

         // Note: priorityQueue is now empty after using poll() in Method 3
        // Repopulate for demonstration with previous values (optional)
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);


        Integer[] array4 = arrayList.toArray(new Integer[0]); // Efficient way
        System.out.print("Method 3: ");
        printArray(array4);


    }


    // Helper function to print the array
    private static void printArray(Integer[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

