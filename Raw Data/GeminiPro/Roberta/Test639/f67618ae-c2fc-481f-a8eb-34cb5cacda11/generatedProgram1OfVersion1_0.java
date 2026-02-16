import java.util.*;

public class PriorityQueueToSet {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(3);
        priorityQueue.add(8);

        // Convert PriorityQueue to Set (using a TreeSet to maintain sorted order if needed)
        Set<Integer> set = new TreeSet<>(priorityQueue); 

        // Print the Set
        System.out.println("Set elements: " + set);


        // Example demonstrating that changes to the set do not affect the PriorityQueue:
        set.remove(5); 
        System.out.println("Set after removal: " + set);
        System.out.println("Original PriorityQueue (unaffected): " + priorityQueue);


        // If order is not important and you don't need a sorted set, you can use a HashSet for potentially better performance:
        Set<Integer> hashSet = new HashSet<>(priorityQueue);
        System.out.println("HashSet elements (order may vary): " + hashSet);




    }
}
