import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {
        // Method 1: Using Collections.reverseOrder() comparator
        PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ1.add(5);
        maxPQ1.add(10);
        maxPQ1.add(1);
        maxPQ1.add(7);

        System.out.println("Max Priority Queue 1 (using Collections.reverseOrder()):");
        while (!maxPQ1.isEmpty()) {
            System.out.print(maxPQ1.poll() + " "); // Output: 10 7 5 1 
        }
        System.out.println();


        // Method 2: Using a lambda expression for the comparator (Java 8 and above)
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // b - a for max heap

        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(1);
        maxPQ2.add(7);

        System.out.println("Max Priority Queue 2 (using lambda):");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 10 7 5 1
        }
        System.out.println();


        //Example with Strings (using lambda for natural order - max alphabetical)
        PriorityQueue<String> maxStringPQ = new PriorityQueue<>((s1, s2) -> s2.compareTo(s1));

        maxStringPQ.add("apple");
        maxStringPQ.add("banana");
        maxStringPQ.add("orange");

        System.out.println("Max String Priority Queue:");
        while (!maxStringPQ.isEmpty()) {
            System.out.print(maxStringPQ.poll() + " ");  // Output: orange banana apple
        }

    }
}
