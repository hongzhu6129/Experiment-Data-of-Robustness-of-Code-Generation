import java.util.PriorityQueue;

public class InsertIntoPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Insert elements into the PriorityQueue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        priorityQueue.offer(1);


        // Element to insert
        int elementToInsert = 6;

        // Insert the element
        priorityQueue.offer(elementToInsert);



        // Print the PriorityQueue (elements will be ordered according to their natural ordering or a Comparator if provided)
        System.out.println("PriorityQueue after insertion: " + priorityQueue);


        // Example demonstrating different data type (String) and a custom Comparator (for max-heap)
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>((s1, s2) -> s2.compareTo(s1)); // Max-heap using Comparator

        stringPriorityQueue.offer("apple");
        stringPriorityQueue.offer("banana");
        stringPriorityQueue.offer("orange");

        stringPriorityQueue.offer("grape"); // Inserting

        System.out.println("String PriorityQueue (max-heap): " + stringPriorityQueue);


    }
}
