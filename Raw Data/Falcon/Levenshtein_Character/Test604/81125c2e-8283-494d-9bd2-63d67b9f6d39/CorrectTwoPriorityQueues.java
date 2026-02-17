import java.util.Comparator;
import java.util.PriorityQueue;

public class CorrectTwoPriorityQueues {

    public static void main(String[] args) {
        // Example usage:
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(); // Natural order (min-heap)
        pq1.add(5);
        pq1.add(1);
        pq1.add(10);
        pq1.add(3);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // Reverse order (max-heap)
        pq2.add(2);
        pq2.add(8);
        pq2.add(4);
        pq2.add(6);


        System.out.println("Original pq1: " + pq1);
        System.out.println("Original pq2: " + pq2);


        correctPriorityQueues(pq1, pq2);

        System.out.println("Corrected pq1 (min-heap): " + pq1);
        System.out.println("Corrected pq2 (max-heap): " + pq2);
    }



    public static void correctPriorityQueues(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2) {
        // 1. Create temporary lists to store elements
        java.util.List<Integer> allElements = new java.util.ArrayList<>();

        // 2. Add all elements from both queues to the list
        allElements.addAll(pq1);
        allElements.addAll(pq2);

        // 3. Clear original priority queues
        pq1.clear();
        pq2.clear();


        //4. Sort the combined list to easily divide elements
        java.util.Collections.sort(allElements);

        int n = allElements.size();
        // 5. Re-add elements to corrected queues
        for (int i = 0; i < n / 2; i++) {
            pq1.add(allElements.get(i));  // Smaller half to min-heap
        }

        for (int i = n / 2; i < n; i++) {
            pq2.add(allElements.get(i)); // Larger half to max-heap
        }


       //Alternative (more efficient if the heaps are large and mostly correct):

        /*
         *  This approach iteratively swaps elements that are in the wrong heap. 
         *  It's generally faster when only a small portion of the elements 
         *  needs correction.
         */


       /*
        while (!pq1.isEmpty() && !pq2.isEmpty() && pq1.peek() > pq2.peek()) {
            // Swap the top elements if they are in the wrong heaps
            int temp = pq1.poll();
            pq1.add(pq2.poll());
            pq2.add(temp);
        }
        */


    }
}
