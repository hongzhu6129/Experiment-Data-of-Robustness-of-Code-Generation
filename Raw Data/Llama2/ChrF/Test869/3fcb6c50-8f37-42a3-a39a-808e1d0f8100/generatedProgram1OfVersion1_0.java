import java.util.PriorityQueue;

public class PriorityQueueToString {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        // Convert PriorityQueue to String using toString()
        String pqString = pq.toString();
        System.out.println("PriorityQueue as String using toString(): " + pqString);


        //  Alternatively, iterate and build a string (more control over formatting)
        StringBuilder sb = new StringBuilder("[");
        for (Integer element : pq) {
            sb.append(element).append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length()); // Remove trailing ", "
        }
        sb.append("]");
        System.out.println("PriorityQueue as String using iteration: " + sb.toString());



        // Demonstrating with a PriorityQueue of Strings
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        System.out.println("String PriorityQueue using toString(): " + stringPQ.toString());

        //String PriorityQueue with custom formatting using iteration
        sb = new StringBuilder();  //reuse StringBuilder
        sb.append("{");
        for(String s : stringPQ) {
            sb.append("\"").append(s).append("\"").append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");

        System.out.println("String PriorityQueue with custom formatting: " + sb.toString());


    }
}
