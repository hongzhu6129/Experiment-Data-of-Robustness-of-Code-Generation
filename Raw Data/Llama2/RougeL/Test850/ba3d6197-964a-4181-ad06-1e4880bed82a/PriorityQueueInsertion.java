import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the data type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some initial elements (optional)
        pq.add(5);
        pq.add(1);
        pq.add(8);
        pq.add(3);

        // Element to insert
        int elementToInsert = 6;

        // Insert the element
        pq.add(elementToInsert);  // PriorityQueue automatically handles the insertion based on priority (natural ordering or a Comparator if provided)

        // Print the PriorityQueue after insertion (elements are not guaranteed to be in sorted order when iterated)
        System.out.println("PriorityQueue after insertion: " + pq);


        // Example of retrieving and removing the head (smallest element in a min-heap)
        System.out.println("Head of the queue (smallest element): " + pq.peek()); 
        System.out.println("Removed head: " + pq.poll());
        System.out.println("PriorityQueue after removing head: " + pq);


    }
}
