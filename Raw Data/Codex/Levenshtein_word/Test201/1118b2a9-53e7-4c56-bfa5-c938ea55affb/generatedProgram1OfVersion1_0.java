import java.util.PriorityQueue;

public class EditPriorityQueueElement {

    public static void main(String[] args) {
        // Example usage:
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(10);


        System.out.println("Original Priority Queue: " + pq); // Output: [1, 2, 8, 5, 10] (or similar, order not guaranteed)

        editElement(pq, 8, 3); // Edit element with value 8 to 3

        System.out.println("Modified Priority Queue: " + pq); // Output: [1, 2, 3, 5, 10] (or similar)

        editElement(pq, 1, 12); // Edit element with value 1 to 12

        System.out.println("Modified Priority Queue: " + pq); // Output: [2, 5, 3, 12, 10] (or similar)

         // Example with String PriorityQueue:
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        System.out.println("Original String Priority Queue: " + stringPQ);

        editElement(stringPQ, "banana", "grape");

        System.out.println("Modified String Priority Queue: " + stringPQ);


    }



    public static <T> void editElement(PriorityQueue<T> pq, T oldElement, T newElement) {
        if (pq.contains(oldElement)) {
            pq.remove(oldElement); // Remove the old element
            pq.add(newElement);     // Add the new element (re-orders the queue)
        } else {
            System.out.println("Element " + oldElement + " not found in the Priority Queue.");
        }
    }
}
