import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the PriorityQueue
        pq.offer(5);
        pq.offer(1);
        pq.offer(10);
        pq.offer(3);

        // Insert a particular element (e.g., 7)
        int elementToInsert = 7;
        pq.offer(elementToInsert);

        // Print the PriorityQueue elements (order will be based on priority)
        System.out.println("PriorityQueue elements after insertion: " + pq);


        // Example with Strings (natural ordering)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.offer("apple");
        stringPQ.offer("banana");
        stringPQ.offer("orange");

        String stringToInsert = "grape";
        stringPQ.offer(stringToInsert);
        System.out.println("String PriorityQueue: " + stringPQ);


         // Example with custom objects and a Comparator (for more complex scenarios)
        PriorityQueue<MyObject> customPQ = new PriorityQueue<>((o1, o2) -> o2.value - o1.value); // Reverse order of value

        customPQ.offer(new MyObject(10));
        customPQ.offer(new MyObject(1));
        customPQ.offer(new MyObject(5));

        MyObject objectToInsert = new MyObject(7);
        customPQ.offer(objectToInsert);
        System.out.println("Custom Object PriorityQueue: " + customPQ);

    }


    // Example custom object (if needed)
    static class MyObject {
        int value;

        public MyObject(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "value=" + value +
                    '}';
        }
    }


}
