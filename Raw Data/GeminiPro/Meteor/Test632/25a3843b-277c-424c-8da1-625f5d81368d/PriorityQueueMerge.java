import java.util.PriorityQueue;

public class PriorityQueueMerge {

    public static void main(String[] args) {
        // Create two priority queues
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Add elements to the first priority queue
        pq1.add(5);
        pq1.add(1);
        pq1.add(8);
        pq1.add(3);

        // Add elements to the second priority queue
        pq2.add(2);
        pq2.add(7);
        pq2.add(4);


        System.out.println("Priority Queue 1: " + pq1);
        System.out.println("Priority Queue 2: " + pq2);

        // Method 1: Using addAll() -  Simplest and most efficient
        pq2.addAll(pq1); 


        System.out.println("Priority Queue 2 after adding elements from Queue 1 (addAll): " + pq2);

        // Reset pq2 for demonstration of the iterative method
        pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(7);
        pq2.add(4);

        // Method 2: Iterating and adding individually (Less efficient, useful for understanding)
        for (Integer element : pq1) {
            pq2.add(element);
        }

        System.out.println("Priority Queue 2 after adding elements from Queue 1 (iterative): " + pq2);


         //Important Note: The original pq1 remains unchanged after both methods. 
         // If you want to move all elements and empty pq1, use:
         System.out.println("Original Priority Queue 1: " + pq1); //pq1 is still the same

         pq2.clear(); //Clear pq2 to reuse it
         pq2.addAll(pq1);
         pq1.clear();  // Clear pq1 to simulate moving

         System.out.println("Priority Queue 1 after moving (clear): " + pq1); // now empty
         System.out.println("Priority Queue 2 after moving (addAll then clear): " + pq2);


    }
}
