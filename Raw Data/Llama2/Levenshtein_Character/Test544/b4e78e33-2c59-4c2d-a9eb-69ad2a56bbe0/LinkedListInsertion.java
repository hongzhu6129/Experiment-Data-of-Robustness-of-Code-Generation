import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Insert at the beginning (first position)
        myList.addFirst("Apple");
        myList.addFirst("Banana");


        // Insert at a specific position (let's say 3rd which is index 2)
        // We'll consider this analogous to "year" position, though a "year" might not always align with an index.
        //  If the desired index is beyond the list size, it adds to the end.
        // If you strictly want to insert only if the index exists, use a check like:
        //  if (index < myList.size()) { myList.add(index,"element"); }
        int yearPosition = 2; // Example - Insert at 3rd position (index 2)
        if (yearPosition <= myList.size()) {
            myList.add(yearPosition, "Orange"); 
        } else {
            System.out.println("Year position exceeds list size. Adding to the end.");
            myList.addLast("Orange"); //  Alternatively, don't add at all.
        }
        

        // Add another element at the beginning
        myList.addFirst("Grape");


        //  Insert at a position beyond the current size - it adds at the end like addLast()
        myList.add(10, "Mango"); // Effectively adds to the end.



        // Print the LinkedList
        System.out.println(myList);
    }
}
