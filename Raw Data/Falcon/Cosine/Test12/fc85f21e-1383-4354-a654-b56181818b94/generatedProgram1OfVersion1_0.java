import java.util.PriorityQueue;

public class CountLeastPriorityQueue {

    public static void main(String[] args) {
        // Example usage:
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(2); // Adding duplicate least element
        pq.add(1); // Adding another duplicate least element
        pq.add(9);

        int leastElement = pq.peek();
        int count = 0;

        // Iterate through a copy to avoid modifying the original PriorityQueue
        PriorityQueue<Integer> copyPq = new PriorityQueue<>(pq); 

        while (!copyPq.isEmpty()) {
            if (copyPq.poll() == leastElement) {
                count++;
            } else { // Optimization: No need to continue once elements greater than the least are encountered (due to PriorityQueue order)
              break; 
            }
        }

        System.out.println("Least element: " + leastElement);
        System.out.println("Count of least element: " + count);


        // Example 2: Empty PriorityQueue
        PriorityQueue<Integer> emptyPq = new PriorityQueue<>();
        if (emptyPq.isEmpty()) {
            System.out.println("The priority queue is empty. No least element.");
        }


    }
}
