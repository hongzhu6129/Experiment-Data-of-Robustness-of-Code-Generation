import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can use other data types as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some initial elements (optional)
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // The element to insert
        int elementToInsert = 8; 

        // Insert the element - PriorityQueue automatically handles ordering
        pq.add(elementToInsert); 

        // Print the PriorityQueue after insertion (to verify)
        System.out.println("PriorityQueue after insertion: " + pq);


        // Example with Strings (for demonstration)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        stringPQ.add("grape");  // Inserting "grape"

        System.out.println("String PriorityQueue after insertion: " + stringPQ);


        // Example with custom objects (you'll need to implement Comparable)
        PriorityQueue<MyObject> customPQ = new PriorityQueue<>();
        customPQ.add(new MyObject(15, "A"));
        customPQ.add(new MyObject(5, "B"));
        customPQ.add(new MyObject(25, "C"));

        customPQ.add(new MyObject(10, "D")); // Inserting a new MyObject

        System.out.println("Custom Object PriorityQueue after insertion: " + customPQ);




    }



    // Example of a custom class for PriorityQueue (must implement Comparable)
     static class MyObject implements Comparable<MyObject> {
         int value;
         String name;

         public MyObject(int value, String name) {
             this.value = value;
             this.name = name;
         }

        @Override
        public int compareTo(MyObject other) {
            // Compare based on the 'value' field (you can customize the comparison logic)
            return Integer.compare(this.value, other.value); 
        }

         @Override
         public String toString() {
             return "(" + value + ", " + name + ")";
         }

     }


}
