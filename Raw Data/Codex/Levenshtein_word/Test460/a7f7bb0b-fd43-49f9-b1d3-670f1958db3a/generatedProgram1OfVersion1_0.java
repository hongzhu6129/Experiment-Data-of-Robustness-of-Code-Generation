import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() (Recommended)
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(5);
        maxPQ.add(10);
        maxPQ.add(1);
        maxPQ.add(7);

        System.out.println("Max PriorityQueue (using Collections.reverseOrder()): " + maxPQ);


        // Method 2: Using a custom Comparator (Less efficient, generally avoid) 
        //  Only use if you need truly customized comparison logic that reverseOrder() doesn't provide.
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // b - a for descending order


        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(1);
        maxPQ2.add(7);

        System.out.println("Max PriorityQueue (using custom Comparator): " + maxPQ2);


        // Demonstrating removal (poll()) from the max priority queue:
        System.out.print("Elements removed from maxPQ (in descending order): ");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");
        }
        System.out.println();
    }
}
