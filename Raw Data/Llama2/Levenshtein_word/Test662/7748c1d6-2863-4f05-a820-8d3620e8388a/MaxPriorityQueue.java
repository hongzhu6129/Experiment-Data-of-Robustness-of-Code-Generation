import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {

        // Method 1: Using Collections.reverseOrder() comparator
        PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ1.add(10);
        maxPQ1.add(5);
        maxPQ1.add(20);
        maxPQ1.add(15);

        System.out.println("Max Priority Queue 1 (using Collections.reverseOrder()):");
        while (!maxPQ1.isEmpty()) {
            System.out.print(maxPQ1.poll() + " "); // Output: 20 15 10 5 
        }
        System.out.println();



        // Method 2: Using a custom Comparator (lambda expression)
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // Note: b - a for max heap

        maxPQ2.add(10);
        maxPQ2.add(5);
        maxPQ2.add(20);
        maxPQ2.add(15);

        System.out.println("Max Priority Queue 2 (using custom Comparator):");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 20 15 10 5
        }
        System.out.println();



        // Method 3: Multiplying by -1 (for primitive types only, less efficient and can overflow) -  generally avoid this approach
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();  // Default is min heap

        minPQ.add(-10); // Store negative values
        minPQ.add(-5);
        minPQ.add(-20);
        minPQ.add(-15);

        System.out.println("Max Priority Queue simulated using negative values in a min heap (avoid this approach):");
        while (!minPQ.isEmpty()) {
            System.out.print(-minPQ.poll() + " "); // Retrieve and negate to get original values: 20 15 10 5
        }
        System.out.println();
    }
}
