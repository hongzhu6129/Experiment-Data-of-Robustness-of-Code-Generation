import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Add some initial elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Element to append
        String newElement = "Grape";

        // Append the element to the end of the list
        myList.add(newElement); // Alternatively: myList.addLast(newElement);  addLast is equivalent to add.

        // Print the updated list
        System.out.println("Updated LinkedList: " + myList); 
    }
}
