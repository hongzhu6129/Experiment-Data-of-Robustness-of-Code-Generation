import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {

        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);
        pq.add(8);


        // Method 1: Using the size() method
        int size = pq.size();
        System.out.println("Size of the PriorityQueue (using size()): " + size);


        // Method 2: Iterating and counting (less efficient but demonstrates iteration)
        int count = 0;
        for (Integer element : pq) {  // Enhanced for loop iterates in natural order (not priority order)
            count++;
        }
        System.out.println("Size of the PriorityQueue (using iteration): " + count);



        // Example of removing elements and observing size change
        pq.poll(); // Removes the head (smallest element in this case)
        System.out.println("Size after removing one element: " + pq.size());


        pq.clear(); // Removes all elements
        System.out.println("Size after clearing: " + pq.size());



        // Example with a different data type (String)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("Apple");
        stringPQ.add("Banana");
        stringPQ.add("Orange");
        System.out.println("Size of the String PriorityQueue: " + stringPQ.size());



    }
}

