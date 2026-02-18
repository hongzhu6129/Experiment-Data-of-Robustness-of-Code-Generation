import java.util.PriorityQueue;

public class RemoveAllPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements from the PriorityQueue
        pq.clear();


        System.out.println("PriorityQueue after removing all elements: " + pq);


        //Alternative method using removeAll (less efficient generally)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(10);
        pq2.add(5);
        pq2.add(20);
        pq2.add(15);

        System.out.println("Original PriorityQueue 2: " + pq2);

        pq2.removeAll(pq2); //Removes all elements that are also in pq2 (which is all of them)

        System.out.println("PriorityQueue 2 after removing all elements: " + pq2);


    }
}
