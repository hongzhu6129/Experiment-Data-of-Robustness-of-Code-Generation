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

        // Remove the specified element
        boolean removed = linkedList.remove(elementToRemove);  // remove(Object) handles nulls safely

        if (removed) {
            System.out.println("LinkedList after removing " + elementToRemove + ": " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }



        // Example demonstrating removing by index:
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Red");
        linkedList2.add("Green");
        linkedList2.add("Blue");


        System.out.println("Original LinkedList2: " + linkedList2);

        int indexToRemove = 1; // Remove element at index 1 ("Green")

        try {
            String removedElement = linkedList2.remove(indexToRemove);
            System.out.println("LinkedList2 after removing element at index " + indexToRemove + ": " + linkedList2);
            System.out.println("Removed element: " + removedElement);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.  Element not removed.");
        }



         //Demonstrate removing the first and last elements.
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println("Original Numbers LinkedList: " + numbers);

        if (!numbers.isEmpty()) {  // Check if the list is empty before removing
          numbers.removeFirst();
          System.out.println("Numbers after removeFirst(): " + numbers); 
        }

        if (!numbers.isEmpty()) { // Check again before removeLast()
         numbers.removeLast();
         System.out.println("Numbers after removeLast(): " + numbers);
        }



    }
}
