import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImage {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Image the LinkedList using a ListIterator
        imageLinkedList(linkedList); 
    }

    private static void imageLinkedList(LinkedList<String> linkedList) {
        System.out.println("Original LinkedList:");
        printLinkedListWithPositions(linkedList);

        LinkedList<String> imagedList = new LinkedList<>();
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size()); // Start from the end

        while (iterator.hasPrevious()) {
            imagedList.add(iterator.previous());
        }


        System.out.println("\nImaged LinkedList:");
        printLinkedListWithPositions(imagedList);


    }


    private static void printLinkedListWithPositions(LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }
    }
}
