import java.util.PriorityQueue;

public class IteratePriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Method 1: Using enhanced for loop (Recommended - maintains order)
        System.out.println("Iterating using enhanced for loop (maintains order):");
        for (Integer element : pq) {
            System.out.print(element + " ");
        }
        System.out.println(); // Newline

        // Method 2: Using iterator (maintains order)
        System.out.println("Iterating using iterator (maintains order):");
        var iterator = pq.iterator();  // Use var for type inference
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Newline


        // Method 3:  Using poll() repeatedly (DESTRUCTIVE - removes elements!)
        System.out.println("Iterating using poll() (DESTRUCTIVE - removes elements):");
        PriorityQueue<Integer> pqCopy = new PriorityQueue<>(pq); // Create a copy to avoid modifying the original
        while (!pqCopy.isEmpty()) {
            System.out.print(pqCopy.poll() + " ");
        }
        System.out.println(); // Newline

        // Method 4: Using toArray() and then iterating the array (maintains order)
        System.out.println("Iterating using toArray() and then iterating the array (maintains order):");
        Integer[] array = pq.toArray(new Integer[0]);
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Method 5:  Using stream() and forEach (Java 8+ - maintains order)
        System.out.println("Iterating using stream() and forEach (maintains order):");
         pq.stream().forEach(element -> System.out.print(element + " ")); // Use lambda expression
        System.out.println();


    }
}
