import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("Initial PriorityQueue: " + pq); // Output: [5, 10, 20, 15] (or similar, order not guaranteed)


        // Element to insert
        int elementToInsert = 8;

        // Insert the element (it will be placed according to its natural ordering)
        pq.add(elementToInsert);


        System.out.println("PriorityQueue after insertion: " + pq); // Output: [5, 8, 20, 15, 10] (or similar)



        // Example with Strings (natural ordering is lexicographical)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        System.out.println("Initial String PriorityQueue: " + stringPQ);

        stringPQ.add("grape");

        System.out.println("String PriorityQueue after insertion: " + stringPQ);


         // Example with custom objects (requires implementing Comparable interface)
         PriorityQueue<MyObject> customPQ = new PriorityQueue<>();
         customPQ.add(new MyObject(10, "A"));
         customPQ.add(new MyObject(5, "B"));

         customPQ.add(new MyObject(7, "C")); // Insertion

         System.out.println("Custom Object PriorityQueue: " + customPQ);


    }
}


// Example custom class (for demonstration of custom object ordering)
class MyObject implements Comparable<MyObject> {
    int value;
    String name;

    public MyObject(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public int compareTo(MyObject other) {
        return Integer.compare(this.value, other.value); // Order based on value
    }

    @Override
    public String toString() {
        return "(" + value + ", " + name + ")";
    }
}

