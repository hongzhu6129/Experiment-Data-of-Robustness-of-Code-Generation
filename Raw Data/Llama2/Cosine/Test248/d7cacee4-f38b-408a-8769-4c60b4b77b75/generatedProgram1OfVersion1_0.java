import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");

        // Insert at a specific position (e.g., the "year" position, assuming it's within bounds)
        int year = 2024; // Example year.  Replace with any desired value, but handle out of bounds scenarios.

        // Check if the year (interpreted as an index) is valid
        if(year <= linkedList.size() && year >= 0){
            linkedList.add(year,"Year " + year); // Adding "Year" to make it distinct
        }else{
           System.out.println("Year index out of bounds");
        }

       
        // Insert at the end (similar to adding at the year position if year == linkedList.size() before the addition)
        linkedList.addLast("Orange");

        // Print the LinkedList
        System.out.println(linkedList);


        //Example demonstrating an out of bounds year.

        linkedList.clear();//Clear for the next demo
        linkedList.add("Element 1");
        year = 5; //Intentionally out of bounds

        if(year <= linkedList.size() && year >= 0){
            linkedList.add(year,"Year " + year);
        }else{
           System.out.println("Year index out of bounds");
        }

        System.out.println(linkedList);


    }
}
