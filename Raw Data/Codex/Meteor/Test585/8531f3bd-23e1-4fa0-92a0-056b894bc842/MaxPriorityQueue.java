import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() comparator (for any data type)
        PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ1.add(5);
        maxPQ1.add(10);
        maxPQ1.add(2);
        maxPQ1.add(8);

        System.out.println("Max PriorityQueue (Method 1): " + maxPQ1); // Output: [10, 8, 2, 5] (order may vary slightly due to heap implementation)



        // Method 2: Using a lambda expression for the Comparator (for any data type)
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // Reverse of natural ordering

        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(2);
        maxPQ2.add(8);


        System.out.println("Max PriorityQueue (Method 2): " + maxPQ2); // Output: [10, 8, 2, 5]  (order may vary slightly)


        // Method 3: For Integers only, Multiply by -1 (Less efficient, modifies data)
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); // Standard min PriorityQueue

        minPQ.add(5 * -1);
        minPQ.add(10 * -1);
        minPQ.add(2 * -1);
        minPQ.add(8 * -1);

        System.out.print("Max PriorityQueue (Method 3 - with adjusted output): [");
        while (!minPQ.isEmpty()) {
            System.out.print(minPQ.poll() * -1); // Multiply by -1 to restore original values
            if (!minPQ.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println("]"); //Output: [10, 8, 5, 2] (order may vary slightly)
    }
}
