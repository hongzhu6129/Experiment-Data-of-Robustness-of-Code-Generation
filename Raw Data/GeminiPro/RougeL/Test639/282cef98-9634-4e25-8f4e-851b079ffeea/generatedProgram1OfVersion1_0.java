import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Convert the PriorityQueue to an array using toArray()
        Integer[] array = priorityQueue.toArray(new Integer[0]);

       // Sort the array (Optional: PriorityQueue doesn't guarantee specific order when converted to an array)
        Arrays.sort(array);


        // Print the array elements
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        //Alternative method using a loop and poll() (preserves PriorityQueue order, but empties the queue):
        System.out.print("Array elements (using poll()): ");

        //Create a new PriorityQueue (as the original is now empty if you used the loop above)
        priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue (same elements as before for demonstration)
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        int[] array2 = new int[priorityQueue.size()];
        for(int i=0; !priorityQueue.isEmpty(); i++){
            array2[i] = priorityQueue.poll();
        }

        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();





    }
}
