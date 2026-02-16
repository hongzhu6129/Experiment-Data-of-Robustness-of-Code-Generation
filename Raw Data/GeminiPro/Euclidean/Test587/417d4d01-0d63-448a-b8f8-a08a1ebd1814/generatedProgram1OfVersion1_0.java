import java.util.LinkedList;

public class RemoveFromLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to remove
        String elementToRemove = "Orange";

        // Remove the specified element 
        boolean removed = linkedList.remove(elementToRemove);

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }



         // Example removing by index:
        int indexToRemove = 1; //Banana's index, assuming "Orange" was removed.

        try {
            String removedByIndex = linkedList.remove(indexToRemove);
            System.out.println("LinkedList after removing element at index " + indexToRemove + " ('" + removedByIndex +"'): " + linkedList);

        }catch (IndexOutOfBoundsException e) {
             System.out.println("Invalid index: " + indexToRemove);

        }

         // Example using removeFirstOccurrence for duplicates
         LinkedList<String> listWithDuplicates = new LinkedList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Orange");
        listWithDuplicates.add("Banana"); // Duplicate
        listWithDuplicates.add("Mango");

        System.out.println("\nList with duplicates: " + listWithDuplicates);
        String duplicateToRemove = "Banana";
        listWithDuplicates.removeFirstOccurrence(duplicateToRemove); // Removes only the first "Banana"
        System.out.println("List after removing first occurrence of '" + duplicateToRemove + "': " + listWithDuplicates);

        //Example using removeLastOccurrence for duplicates.
        listWithDuplicates.removeLastOccurrence(duplicateToRemove);
        System.out.println("List after removing last occurrence of '" + duplicateToRemove + "': " + listWithDuplicates);

    }
}
