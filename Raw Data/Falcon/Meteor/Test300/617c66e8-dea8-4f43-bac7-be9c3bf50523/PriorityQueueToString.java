import java.util.PriorityQueue;

public class PriorityQueueToString {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        // Method 1: Using toString() directly
        String pqString = pq.toString();
        System.out.println("PriorityQueue as String (using toString()): " + pqString);

        // Method 2: Iterating and building a string (preserves order)
        StringBuilder sb = new StringBuilder("[");
        for (Integer element : pq) {
            sb.append(element).append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Remove trailing comma and space
        }
        sb.append("]");

        System.out.println("PriorityQueue as String (using iteration): " + sb.toString());


        // Method 3: Java 8+ Stream API (preserves order, more concise)
        String streamString = pq.stream()
                .map(String::valueOf) // Convert each element to string
                .collect(java.util.stream.Collectors.joining(", ", "[", "]"));
        System.out.println("PriorityQueue as String (using streams): " + streamString);

          // Example for custom objects:
        PriorityQueue<MyObject> customPq = new PriorityQueue<>((a, b) -> a.value - b.value);  // Comparator needed
        customPq.add(new MyObject(10, "A"));
        customPq.add(new MyObject(1, "B"));

        String customString = customPq.stream()
                .map(MyObject::toString)  // Call your object's toString()
                .collect(java.util.stream.Collectors.joining(", ", "[", "]"));

        System.out.println("Custom Object PriorityQueue: " + customString);
    }


    // Example custom class
    static class MyObject {
        int value;
        String name;

        public MyObject(int value, String name) {
            this.value = value;
            this.name = name;
        }


        @Override
        public String toString() {  // Important for custom objects
            return "{value: " + value + ", name: '" + name + "'}";
        }
    }




}
