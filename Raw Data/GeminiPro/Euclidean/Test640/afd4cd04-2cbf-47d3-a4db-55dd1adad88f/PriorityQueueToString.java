import java.util.PriorityQueue;

public class PriorityQueueToString {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Convert PriorityQueue to String using toString() method
        String pqString = pq.toString();

        // Print the string representation
        System.out.println("String representation of the PriorityQueue: " + pqString);


        // Demonstrating conversion for a PriorityQueue of Strings
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("Apple");
        stringPQ.add("Banana");
        stringPQ.add("Orange");

        String stringPQString = stringPQ.toString();
        System.out.println("String representation of the String PriorityQueue: " + stringPQString);



       // Demonstrating handling potential nulls within a PriorityQueue
        PriorityQueue<String> pqWithNulls = new PriorityQueue<>();
        pqWithNulls.add("Apple");
        pqWithNulls.add(null);  // Adding a null element (can cause issues in some cases)
        pqWithNulls.add("Orange");


       try{
           String pqWithNullsString = pqWithNulls.toString(); //This might throw a NullPointerException depending on the Java version

           System.out.println("String representation with nulls : " + pqWithNullsString);
       } catch (NullPointerException e){
           System.out.println("NullPointerException caught.  PriorityQueues may not handle nulls correctly.");
       }


    }
}
