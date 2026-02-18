import java.util.LinkedList;

public class LinkedListElementCheck {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add some elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        // Element to search for
        int elementToFind = 30;

        // Check if the element exists using contains()
        if (list.contains(elementToFind)) {
            System.out.println(elementToFind + " exists in the linked list.");
        } else {
            System.out.println(elementToFind + " does not exist in the linked list.");
        }

        // Another Example - searching for an element that isn't present
        elementToFind = 15; //Change search element

         if (list.contains(elementToFind)) {
            System.out.println(elementToFind + " exists in the linked list.");
        } else {
            System.out.println(elementToFind + " does not exist in the linked list.");
        }

    }
}
