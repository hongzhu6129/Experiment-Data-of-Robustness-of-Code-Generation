import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings (colors)
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors to the queue
        colorQueue.offer("Red");
        colorQueue.offer("Green");
        colorQueue.offer("Blue");
        colorQueue.offer("Yellow");
        colorQueue.offer("Orange");

        // Print the elements of the priority queue
        System.out.println("Elements of the Priority Queue:");

        // Method 1: Iterate using enhanced for loop (recommended)
        for (String color : colorQueue) {
            System.out.println(color);
        }

        // Method 2: Iterate using iterator (less common for PriorityQueues)
        // Iterator<String> iterator = colorQueue.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }



        // Note: PriorityQueues by default order elements in their natural order (for Strings, alphabetical).
        //       If you need a custom ordering, you can provide a Comparator during PriorityQueue creation. 


    }
}
