import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        // Print the elements of the PriorityQueue (Note: they will be in natural order - alphabetical for Strings)
        System.out.println("Elements of the PriorityQueue:");

        // Method 1: Iterating using enhanced for loop (recommended)
        for (String color : colorQueue) {
            System.out.println(color); 
        }


        // Method 2:  Using a while loop and .poll()  (Removes elements)
        /*  
        System.out.println("Elements using poll() - removes elements!: ");
        while (!colorQueue.isEmpty()) {  // Be careful as this empties the queue!
            System.out.println(colorQueue.poll());
        }
        */


        // Method 3: Convert to array (creates a copy, doesn't remove from queue)
        /*
        String[] colorArray = colorQueue.toArray(new String[0]);
        System.out.println("Elements in array form (copied from queue): ");
        for (String color : colorArray) {
            System.out.println(color);
        }
        */


         // Method 4:  Using iterator (less common for PriorityQueues)
         /*
        System.out.println("Elements using iterator:");
        Iterator<String> iterator = colorQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
    }
}
