import java.util.PriorityQueue;

public class AddPriorityQueues {

    public static void main(String[] args) {
        // Create two sample PriorityQueues
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.add(5);
        pq1.add(3);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(4);
        pq2.add(6);


        // Method 1: Add all elements of pq2 to pq1
        pq1.addAll(pq2); 

        // Print the combined PriorityQueue (pq1 now contains elements of both)
        System.out.println("Combined PriorityQueue (pq1): " + pq1);


        // Method 2:  Create a new PriorityQueue containing all elements
         // Re-initialize the PriorityQueues (for demonstration)
        pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.add(5);
        pq1.add(3);
        pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(4);
        pq2.add(6);

        PriorityQueue<Integer> combinedPq = new PriorityQueue<>();
        combinedPq.addAll(pq1);
        combinedPq.addAll(pq2);

        System.out.println("New Combined PriorityQueue: " + combinedPq);


        //Method 3: Calculating the sum of all elements (if that's what "add" meant)
        // Re-initialize the PriorityQueues (for demonstration)
        pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.add(5);
        pq1.add(3);
        pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(4);
        pq2.add(6);

        int sum = 0;
        for (Integer num : pq1) {
            sum += num;
        }
        for (Integer num : pq2) {
            sum += num;
        }

        System.out.println("Sum of all elements in both PriorityQueues: " + sum);




    }
}
