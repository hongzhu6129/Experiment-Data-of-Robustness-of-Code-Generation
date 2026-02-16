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



        // Method 2: Using a lambda expression for the Comparator (Java 8+)
        PriorityQueue<Integer> maxPQ2 = new PriorityQueue<>((a, b) -> b - a); // Notice b-a for reverse order

        maxPQ2.add(5);
        maxPQ2.add(10);
        maxPQ2.add(1);
        maxPQ2.add(7);


        System.out.println("Max Priority Queue 2 (using lambda):");
        while (!maxPQ2.isEmpty()) {
            System.out.print(maxPQ2.poll() + " "); // Output: 10 7 5 1
        }
        System.out.println();



        //Method 3: Using a custom Comparator class (for more complex comparisons)
        PriorityQueue<Integer> maxPQ3 = new PriorityQueue<>(new MyComparator());

         maxPQ3.add(5);
        maxPQ3.add(10);
        maxPQ3.add(1);
        maxPQ3.add(7);

        System.out.println("Max Priority Queue 3 (using custom comparator):");
        while (!maxPQ3.isEmpty()) {
            System.out.print(maxPQ3.poll() + " "); // Output: 10 7 5 1
        }
        System.out.println();


    }
}



class MyComparator implements java.util.Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a; // Reverse order for max heap
    }
}

