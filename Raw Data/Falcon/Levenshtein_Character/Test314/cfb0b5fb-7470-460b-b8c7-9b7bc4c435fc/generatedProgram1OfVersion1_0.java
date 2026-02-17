import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

    public static void main(String[] args) {

        // Method 1: Using Collections.reverseOrder()
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(5);
        maxPQ.add(10);
        maxPQ.add(2);
        maxPQ.add(7);

        System.out.println("Max PriorityQueue (Method 1):");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");  // Output: 10 7 5 2 
        }
        System.out.println();


        // Method 2: Using a Comparator (lambda expression for brevity) -  less efficient than Collections.reverseOrder()
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // b - a for descending order

        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(2);
        maxPQ2.add(7);


        System.out.println("Max PriorityQueue (Method 2):");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 10 7 5 2
        }
        System.out.println();



         // Example with other data types (String) - Using Collections.reverseOrder()
        PriorityQueue<String> stringMaxPQ = new PriorityQueue<>(Collections.reverseOrder());

        stringMaxPQ.add("apple");
        stringMaxPQ.add("banana");
        stringMaxPQ.add("orange");
        stringMaxPQ.add("grape");

        System.out.println("Max PriorityQueue (Strings):");
        while (!stringMaxPQ.isEmpty()) {
            System.out.print(stringMaxPQ.poll() + " "); // Output: orange grape banana apple
        }
        System.out.println();

    }
}
