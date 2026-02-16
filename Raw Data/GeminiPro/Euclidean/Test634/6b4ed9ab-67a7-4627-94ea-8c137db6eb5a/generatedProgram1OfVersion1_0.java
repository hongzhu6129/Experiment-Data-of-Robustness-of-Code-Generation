import java.util.PriorityQueue;

public class RemoveAllFromPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements from the PriorityQueue
        pq.clear(); // This method removes all elements

        System.out.println("PriorityQueue after removing all elements: " + pq);


        // Demonstrating another way using a loop (less efficient than clear())
        // Repopulate for demonstration
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);


        System.out.println("PriorityQueue repopulated: " + pq);

        while (!pq.isEmpty()) {
            pq.poll(); // Removes and returns the head, or null if empty
        }

        System.out.println("PriorityQueue after removing all elements using loop: " + pq);


    }
}
