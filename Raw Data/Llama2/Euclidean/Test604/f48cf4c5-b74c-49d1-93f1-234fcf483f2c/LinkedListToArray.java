import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Create a LinkedList of names
        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add("Alice");
        linkedNames.add("Bob");
        linkedNames.add("Charlie");
        linkedNames.add("David");

        // Convert the LinkedList to an ArrayList
        ArrayList<String> arrayNames = new ArrayList<>(linkedNames);


        // Print the ArrayList to verify the conversion
        System.out.println("ArrayList of names: " + arrayNames);


         //Demonstrate accessing elements in the ArrayList:
        System.out.println("First name in ArrayList: " + arrayNames.get(0)); 
        System.out.println("Second name in ArrayList: " + arrayNames.get(1));


        //Demonstrate iterating  through the ArrayList:
        System.out.println("Iterating through the ArrayList:");
        for (String name : arrayNames) {
            System.out.println(name);
        }



    }
}
