import java.util.LinkedList;

public class LinkedListSearch {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);


        // Element to search for
        int searchElement = 30;

        // Check if the element exists using contains()
        if (linkedList.contains(searchElement)) {
            System.out.println(searchElement + " exists in the linked list.");
        } else {
            System.out.println(searchElement + " does not exist in the linked list.");
        }



        // Example with a different search element
        searchElement = 60; // Element not in the list

         if (linkedList.contains(searchElement)) {
            System.out.println(searchElement + " exists in the linked list.");
        } else {
            System.out.println(searchElement + " does not exist in the linked list.");
        }
    }
}
