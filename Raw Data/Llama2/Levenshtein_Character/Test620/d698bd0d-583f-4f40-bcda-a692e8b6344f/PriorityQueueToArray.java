import java.util.PriorityQueue;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(7);

        // Convert PriorityQueue to an array using toArray()
        Integer[] arr = pq.toArray(new Integer[0]); // Or new Integer[pq.size()]

        // Print the array elements
        System.out.print("Array elements: ");
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Demonstrating maintaining priority order when converting:

        // Create a new PriorityQueue (demonstration)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(5);
        pq2.add(1);
        pq2.add(10);
        pq2.add(3);
        pq2.add(7);

        // Convert to array while preserving natural order (ascending in this case)
         Integer[] orderedArray = new Integer[pq2.size()];
         for (int i = 0; i < orderedArray.length; i++) {
             orderedArray[i] = pq2.poll(); // Poll retrieves and removes the head (smallest element)
         }

        System.out.print("Ordered Array elements: ");
        for (Integer num : orderedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
