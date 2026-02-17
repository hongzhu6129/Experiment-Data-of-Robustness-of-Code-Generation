import java.util.Comparator;
import java.util.PriorityQueue;

public class ThresholdPriorityQueue {

    public static void main(String[] args) {
        // Example usage:

        // Create a standard PriorityQueue (min-heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);
        minHeap.add(3);

        // Convert to a threshold priority queue (e.g., keep only elements <= 5)
        int threshold = 5;
        PriorityQueue<Integer> thresholdQueue = toThresholdPriorityQueue(minHeap, threshold);

        // Print the elements of the threshold queue
        System.out.println("Threshold Priority Queue (<= " + threshold + "):");
        while (!thresholdQueue.isEmpty()) {
            System.out.print(thresholdQueue.poll() + " ");
        }
        System.out.println();



        // Example with max heap and different threshold
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);
        maxHeap.add(3);

        threshold = 7;
        thresholdQueue = toThresholdPriorityQueue(maxHeap, threshold);

        System.out.println("Threshold Priority Queue (<= " + threshold + " with max heap):");
        while (!thresholdQueue.isEmpty()) {
            System.out.print(thresholdQueue.poll() + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> PriorityQueue<T> toThresholdPriorityQueue(PriorityQueue<T> originalQueue, T threshold) {
        PriorityQueue<T> thresholdQueue = new PriorityQueue<>(originalQueue.comparator()); // Maintain the same ordering

        // Iterate through the original queue and add elements below the threshold to the new queue.
        for (T element : originalQueue) {
            if (element.compareTo(threshold) <= 0) {  //  <= for threshold inclusive
                thresholdQueue.add(element);
            }
        }

        return thresholdQueue;
    }


}
