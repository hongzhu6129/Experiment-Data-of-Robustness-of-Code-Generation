import java.util.PriorityQueue;
import java.util.Iterator;

public class IteratePriorityQueue {

    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the Priority Queue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Method 1: Using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Add a newline for clarity


        // Method 2: Using a for-each loop (enhanced for loop)
        System.out.println("Iterating using for-each loop:");
        for (Integer element : pq) {
            System.out.print(element + " ");
        }
        System.out.println(); // Add a newline for clarity


        // Method 3:  While loop with poll() - Note: this removes elements!
        System.out.println("Iterating using poll() - Note: this removes elements!");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(pq); // Create a copy to avoid modifying the original
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
        System.out.println();


        // Method 4: Using toArray()
        System.out.println("Iterating using toArray():");
        Object[] arr = pq.toArray();
        for (Object element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();


         // Method 5: Java 8+ Stream API (also creates copy and doesn't modify original)
        System.out.println("Iterating using Stream API:");
        pq.stream().forEach(element -> System.out.print(element + " ")); 
        System.out.println();
    }
}
