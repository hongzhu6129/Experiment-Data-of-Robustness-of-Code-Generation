import java.util.PriorityQueue;

public class RemoveAllPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements from the PriorityQueue using clear()
        pq.clear();


        System.out.println("PriorityQueue after removing all elements: " + pq);


        //Demonstrate another way using removeAll - though less efficient for clearing *everything*
        // Repopulate for demonstration
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        System.out.println("Repopulated PriorityQueue: " + pq);


        pq.removeAll(pq); // Removes everything as we're removing all elements present in the queue itself

        System.out.println("PriorityQueue after removeAll: " + pq);



    }
}
