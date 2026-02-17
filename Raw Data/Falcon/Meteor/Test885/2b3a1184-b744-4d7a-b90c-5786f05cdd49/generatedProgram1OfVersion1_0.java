import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(4);
        priorityQueue.offer(2);

        // Convert PriorityQueue to an array using toArray()
        Integer[] intArray = priorityQueue.toArray(new Integer[0]);

        // Convert PriorityQueue to an array and specify the type
        // Useful when you know the exact size beforehand for efficiency
        Integer[] sizedIntArray = priorityQueue.toArray(new Integer[priorityQueue.size()]);


        // Print the array elements (demonstration)
        System.out.print("Array elements: ");
        for (Integer element : intArray) {
            System.out.print(element + " ");
        }
        System.out.println(); // New line

        // Print the sized array elements to show the alternative method
        System.out.print("Sized array elements: ");
        for (Integer element : sizedIntArray) {
            System.out.print(element + " ");
        }


        // Example with different data type (String)
        Queue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.offer("apple");
        stringPriorityQueue.offer("banana");
        stringPriorityQueue.offer("orange");

        String[] stringArray = stringPriorityQueue.toArray(new String[0]);

        System.out.println("\nString array elements: "); // New line
        for (String element : stringArray) {
            System.out.print(element + " ");
        }
    }
}
