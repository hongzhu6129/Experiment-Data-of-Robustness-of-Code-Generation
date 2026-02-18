import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Example usage:
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        Integer[] arr = convertToArray(pq);

        System.out.println(Arrays.toString(arr)); // Output (order may vary): [1, 3, 5, 10] 

        // Demonstrating that the original PriorityQueue is unchanged
        System.out.println(pq); // Output (order inherent to PriorityQueue): [1, 3, 5, 10]
    }


    //  Generic method to convert a PriorityQueue to an array
    public static <T> T[] convertToArray(PriorityQueue<T> pq) {
        // Create an array of the same size as the PriorityQueue.
        @SuppressWarnings("unchecked") // unavoidable generic array creation
        T[] arr = (T[]) java.lang.reflect.Array.newInstance(pq.peek().getClass(), pq.size()); 

        // Efficiently copy elements while maintaining the original PriorityQueue.
        // Using toArray(T[] a) is the recommended way to do this
        pq.toArray(arr); 

        return arr;


    }
}
