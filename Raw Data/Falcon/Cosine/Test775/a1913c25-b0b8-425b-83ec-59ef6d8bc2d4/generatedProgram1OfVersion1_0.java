import java.util.LinkedList;
import java.util.List;

public class LinkedListSearch {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        int elementToFind = 3;

        boolean found = linkedList.contains(elementToFind);

        if (found) {
            System.out.println("Element " + elementToFind + " exists in the linked list.");
        } else {
            System.out.println("Element " + elementToFind + " does not exist in the linked list.");
        }


        //Another Example to show searching for a non existing element.

         elementToFind = 10; // Element not in list

        found = linkedList.contains(elementToFind);

        if (found) {
            System.out.println("Element " + elementToFind + " exists in the linked list.");
        } else {
            System.out.println("Element " + elementToFind + " does not exist in the linked list.");
        }
    }
}
