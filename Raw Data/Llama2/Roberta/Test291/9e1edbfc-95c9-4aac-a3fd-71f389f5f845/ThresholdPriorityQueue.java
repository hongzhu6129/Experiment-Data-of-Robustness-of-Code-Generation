import java.util.Comparator;
import java.util.PriorityQueue;

public class ThresholdPriorityQueue {

    public static void main(String[] args) {
        // Example usage:

        // Create a standard PriorityQueue (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(8);


        int threshold = 7; // Set your threshold

        // Convert to a ThresholdPriorityQueue using a custom Comparator
        PriorityQueue<Integer> thresholdPq =  toThresholdPriorityQueue(pq, threshold);


        System.out.println("Threshold Priority Queue (elements >= " + threshold + "):");
        while (!thresholdPq.isEmpty()) {
            System.out.print(thresholdPq.poll() + " ");  //Output: 8 10
        }
        System.out.println();



        // Example using a max-heap and a different threshold
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.add(5);
        maxPq.add(1);
        maxPq.add(10);
        maxPq.add(3);
        maxPq.add(8);

        int threshold2 = 4;
        PriorityQueue<Integer> thresholdMaxPq = toThresholdPriorityQueue(maxPq, threshold2, Comparator.reverseOrder());

        System.out.println("Threshold Priority Queue (max-heap, elements >= " + threshold2 + "):");
        while (!thresholdMaxPq.isEmpty()) {
            System.out.print(thresholdMaxPq.poll() + " "); // Output: 10 8 5
        }
        System.out.println();

    }

    public static <T extends Comparable<T>> PriorityQueue<T> toThresholdPriorityQueue(PriorityQueue<T> originalPq, T threshold) {
        return toThresholdPriorityQueue(originalPq, threshold, Comparator.naturalOrder()); //Default to min-heap
    }



    public static <T> PriorityQueue<T> toThresholdPriorityQueue(PriorityQueue<T> originalPq, T threshold, Comparator<T> comparator) {
        PriorityQueue<T> thresholdPq = new PriorityQueue<>(comparator); 
        for (T element : originalPq) {
            if (comparator.compare(element, threshold) >= 0) {
                thresholdPq.add(element);
            }
        }
        return thresholdPq;
    }
}
