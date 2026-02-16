import java.util.PriorityQueue;
import java.util.Iterator;

public class IteratePriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Orange");
        pq.add("Grape");

        // Method 1: Using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Method 2: Using a for-each loop (enhanced for loop)  - NOTE: order is not guaranteed
        System.out.println("\nIterating using for-each loop (order not guaranteed):");
        for (String fruit : pq) {
            System.out.println(fruit);
        }

        // Method 3:  Iterating while removing elements (careful, this empties the queue)
        System.out.println("\nIterating by removing elements (empties the queue):");
        while (!pq.isEmpty()) {
           System.out.println(pq.poll());
        }

          //Demonstrate creating a copy to avoid modifying the original queue
         PriorityQueue<String> pq2 = new PriorityQueue<>(pq); //pq is empty at this point if you ran method 3, so this re-populates based on the original initialization
         System.out.println("\nIterating a copy by removing elements (original preserved):");
         while (!pq2.isEmpty()) {
            System.out.println(pq2.poll());
         }



    }
}
