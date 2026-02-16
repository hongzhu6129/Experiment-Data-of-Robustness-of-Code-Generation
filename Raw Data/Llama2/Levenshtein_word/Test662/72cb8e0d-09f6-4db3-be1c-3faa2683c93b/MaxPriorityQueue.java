import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() comparator

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(10);
        maxPQ.add(5);
        maxPQ.add(20);
        maxPQ.add(15);

        System.out.println("Max Priority Queue (Method 1): " + maxPQ);


        // Method 2:  Multiplying elements by -1 (for numeric types only)  and then multiplying by -1 when retrieving.
        //  This is less efficient and only suitable for certain data types.  Demonstrating for educational purposes:

         PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>();

         maxPQ2.add(-10); // Add the negative of the actual value
         maxPQ2.add(-5);
         maxPQ2.add(-20);
         maxPQ2.add(-15);


        System.out.print("Max Priority Queue (Method 2 - retrieval requires multiplying by -1): ");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() * -1 + " "); // Multiply by -1 to get original value
        }
        System.out.println();


        //Preferred method is always using the comparator (Method 1).




    }
}
