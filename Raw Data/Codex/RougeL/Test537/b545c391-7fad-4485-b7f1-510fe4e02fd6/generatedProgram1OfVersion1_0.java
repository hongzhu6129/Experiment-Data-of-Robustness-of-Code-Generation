import java.util.LinkedList;

public class RemoveLinkedListElement {

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

        // Remove the element
        boolean removed = linkedList.remove(elementToRemove); // Removes first occurrence

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }


        // Example removing by index:
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Orange");
        linkedList2.add("Grape");
        linkedList2.add("Mango");

        System.out.println("\nOriginal LinkedList 2: " + linkedList2);
        int indexToRemove = 1; //Remove the element at index 1 ("Banana")

        try {
            String removedElement = linkedList2.remove(indexToRemove);
            System.out.println("LinkedList 2 after removing element at index " + indexToRemove + ": " + linkedList2);
            System.out.println("Removed element: " + removedElement);
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.  No element removed.");
        }


         // Example demonstrating removing all occurrences (if duplicates exist)
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(2); // Duplicate
         numbers.add(4);
         numbers.add(2); // Duplicate

         System.out.println("\nOriginal numbers LinkedList: " + numbers);

         int numToRemove = 2;
         while (numbers.remove(Integer.valueOf(numToRemove))) {  // Keep removing until no more are found
             // This loop efficiently handles potential duplicates
         } // end while


         System.out.println("numbers LinkedList after removing all '" + numToRemove + "' : " + numbers);




    }
}
