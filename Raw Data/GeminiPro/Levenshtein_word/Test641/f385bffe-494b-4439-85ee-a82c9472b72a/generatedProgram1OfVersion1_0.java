import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueueExample {

    public static void main(String[] args) {

        // Method 1: Using Collections.reverseOrder() comparator

        PriorityQueue<Integer> maxPQ1 = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ1.add(5);
        maxPQ1.add(10);
        maxPQ1.add(1);
        maxPQ1.add(7);

        System.out.println("Max PriorityQueue using Collections.reverseOrder():");
        while (!maxPQ1.isEmpty()) {
            System.out.print(maxPQ1.poll() + " "); // Output: 10 7 5 1
        }
        System.out.println();



        // Method 2: Using a custom Comparator (Lambda expression)

        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // Reverse of natural ordering


        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(1);
        maxPQ2.add(7);


        System.out.println("Max PriorityQueue using a custom Comparator (lambda):");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 10 7 5 1 
        }
        System.out.println();



        // Method 3: Using a custom Comparator (separate class) - more verbose
        class MyComparator implements java.util.Comparator<Integer> {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // Reverse of natural ordering
            }
        }

        PriorityQueue<Integer> maxPQ3 = new PriorityQueue<>(new MyComparator());


        maxPQ3.add(5);
        maxPQ3.add(10);
        maxPQ3.add(1);
        maxPQ3.add(7);


        System.out.println("Max PriorityQueue using a custom Comparator (separate class):");
        while (!maxPQ3.isEmpty()) {
            System.out.print(maxPQ3.poll() + " "); // Output: 10 7 5 1
        }
        System.out.println();



         // Example with Strings (using reverseOrder)
        PriorityQueue<String> maxPQStrings = new PriorityQueue<>(Collections.reverseOrder());
        maxPQStrings.add("apple");
        maxPQStrings.add("banana");
        maxPQStrings.add("zebra");
        maxPQStrings.add("cat");

        System.out.println("Max PriorityQueue with Strings:");
         while (!maxPQStrings.isEmpty()) {
            System.out.print(maxPQStrings.poll() + " "); // Output: zebra cat banana apple
        }
        System.out.println();
    }
}
