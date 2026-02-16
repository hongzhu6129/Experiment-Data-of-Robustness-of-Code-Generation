import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListToArray {

    public static void main(String[] args) {

        // Example linked list (represented as a standard Java List for simplicity)
        List<String> linkedList = Arrays.asList("apple", "banana", "orange", "grape");

        // Convert to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);


        // Print the ArrayList to verify
        System.out.println("ArrayList: " + arrayList);


        //More involved example with different data type (Integer)

         List<Integer> numberLinkedList = Arrays.asList(1, 2, 3, 4, 5);

        // Convert to ArrayList
        ArrayList<Integer> numberArrayList = new ArrayList<>(numberLinkedList);

        // Print the ArrayList 
        System.out.println("ArrayList of numbers: " + numberArrayList);


    }
}
