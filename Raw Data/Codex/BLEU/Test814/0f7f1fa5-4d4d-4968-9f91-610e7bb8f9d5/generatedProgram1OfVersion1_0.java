import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors to the queue
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");

        // Method 1: Iterate using enhanced for loop (preferred for just printing)
        for (String color : colorQueue) {
            System.out.println(color);
        }


        //Method 2: Iterate and remove elements using poll() (useful if you need to process and remove elements)
        // PriorityQueue<String> tempQueue = new PriorityQueue<>(colorQueue); // Create a copy to avoid modifying the original
        // while (!tempQueue.isEmpty()) {
        //     System.out.println(tempQueue.poll());  // poll() retrieves and removes the head
        // }


        //Method 3:  Convert to an array and print (less efficient if you only need to print)
        // Object[] colorArray = colorQueue.toArray();
        // for (Object color : colorArray) {
        //     System.out.println(color);
        // }



    }
}
