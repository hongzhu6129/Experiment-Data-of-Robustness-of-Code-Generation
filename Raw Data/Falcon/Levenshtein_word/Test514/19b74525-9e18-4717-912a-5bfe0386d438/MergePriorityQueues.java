import java.util.PriorityQueue;

public class MergePriorityQueues {

    public static void main(String[] args) {
        // Create the first priority queue (pq1)
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(5);
        pq1.add(1);
        pq1.add(9);
        pq1.add(3);

        // Create the second priority queue (pq2) where we'll add elements from pq1
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Add all elements from pq1 to pq2
        pq2.addAll(pq1);


        // Print the elements of pq2 to verify
        System.out.print("Elements of pq2: ");
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        } 
        System.out.println(); // Add a newline for cleaner output


        // Example with different initial data in pq2:
        PriorityQueue<Integer> pq3 = new PriorityQueue<>();
        pq3.add(10);
        pq3.add(2);

        PriorityQueue<Integer> pq4 = new PriorityQueue<>();
        pq4.add(7);
        pq4.add(4);

        pq3.addAll(pq4);

         System.out.print("Elements of pq3 after merging with pq4: ");
        while (!pq3.isEmpty()) {
            System.out.print(pq3.poll() + " ");
        }
        System.out.println();


    }
}
